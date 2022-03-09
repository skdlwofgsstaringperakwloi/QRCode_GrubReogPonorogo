package bahrudin.bagus.qrcode_grubreogponorogo.networking

import androidx.lifecycle.liveData
import bahrudin.bagus.qrcode_grubreogponorogo.utils.Resource
import kotlinx.coroutines.Dispatchers

object UserRetrofit {

//    fun searchUsers(query: String) = liveData(Dispatchers.IO) {
//        try {
//            val userSearch = RetrofitConfig.apiClient.searchUsers(query)
//            emit(Resource.success(userSearch.items))
//        } catch (exception: Exception) {
//            emit(Resource.error(null, exception.message ?: "Error"))
//        }
//    }

    fun getDetailUser(id: Int) = liveData(Dispatchers.IO) {
        try {
            emit(Resource.success(RetrofitConfig.apiClient.userDetail(id)))
        } catch (exception: Exception) {
            emit(Resource.error(null, exception.message ?: "Error"))
        }
    }
}