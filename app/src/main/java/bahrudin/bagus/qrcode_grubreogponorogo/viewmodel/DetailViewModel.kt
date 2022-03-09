package bahrudin.bagus.qrcode_grubreogponorogo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import bahrudin.bagus.qrcode_grubreogponorogo.model.ReogUser
import bahrudin.bagus.qrcode_grubreogponorogo.networking.UserRetrofit
import bahrudin.bagus.qrcode_grubreogponorogo.utils.Resource

class DetailViewModel : ViewModel() {

    private val id: MutableLiveData<String> = MutableLiveData()

    val searchResult: LiveData<Resource<List<ReogUser>>> = Transformations
        .switchMap(id) {
            UserRetrofit.searchUsers(it)
        }

    fun setSearch(query: String) {
        if (id.value == query) {
            return
        }
        id.value = query
    }

    val dataDetail: LiveData<Resource<ReogUser>> = Transformations
        .switchMap(id) {
            UserRetrofit.getDetailUser(it)
        }

    fun setDetail(userid: String) {
        if (id.value == userid) {
            return
        }
        id.value = userid
    }
}