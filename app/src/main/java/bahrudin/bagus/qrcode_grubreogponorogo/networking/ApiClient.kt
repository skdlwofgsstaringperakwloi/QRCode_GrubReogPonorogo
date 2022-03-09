package bahrudin.bagus.qrcode_grubreogponorogo.networking

import bahrudin.bagus.qrcode_grubreogponorogo.model.ReogUser
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiClient {

    @GET("search/users")
    suspend fun searchUsers(
        @Query("q") q: String?
    ): SearchRespond

    @GET("api/v1/groups/{id}")
    suspend fun userDetail(
        @Path("id") id: String?
    ): ReogUser

//    @GET("search/users")
//    suspend fun searchUsers(
//        @Query("q") q: String?
//    ): SearchRespond
}