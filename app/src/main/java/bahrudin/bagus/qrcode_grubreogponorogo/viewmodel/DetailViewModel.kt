package bahrudin.bagus.qrcode_grubreogponorogo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import bahrudin.bagus.qrcode_grubreogponorogo.model.ReogUser
import bahrudin.bagus.qrcode_grubreogponorogo.networking.UserRetrofit
import bahrudin.bagus.qrcode_grubreogponorogo.utils.Resource

class DetailViewModel : ViewModel() {

    private val id: MutableLiveData<Int> = MutableLiveData()

    val dataDetail: LiveData<Resource<ReogUser>> = Transformations
        .switchMap(id) {
            UserRetrofit.getDetailUser(it)
        }

    fun setDetail(userid: Int) {
        if (id.value == userid) {
            return
        }
        id.value = userid
    }
}