package bahrudin.bagus.qrcode_grubreogponorogo.networking

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiClient {
    @GET("api/v1/groups/{id}")
    suspend fun userDetail(
        @Path("id") id: Int
    ): ReogUser

    @GET("api/v1/groups/{name}")
    suspend fun userDetail(
        @Path("id") name: String?
    ): List<ReogUser>

    @GET("api/v1/groups/{owner}")
    suspend fun userDetail(
        @Path("id") owner: String?
    ): List<ReogUser>
}