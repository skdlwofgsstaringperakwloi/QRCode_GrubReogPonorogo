package bahrudin.bagus.qrcode_grubreogponorogo.networking

import bahrudin.bagus.qrcode_grubreogponorogo.utils.Resource
import kotlinx.coroutines.Dispatchers

object UserRetrofit {

    fun getDetailUser(username: String) = liveData(Dispatchers.IO) {
        try {
            emit(Resource.success(RetrofitConfig.apiClient.userDetail(username)))
        } catch (exception: Exception) {
            emit(Resource.error(null, exception.message ?: "Error"))
        }
    }
}