package bahrudin.bagus.qrcode_grubreogponorogo.networking

import bahrudin.bagus.qrcode_grubreogponorogo.model.ReogUser
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {
    @GET("api/v1/groups/{id}")
    suspend fun userDetail(
        @Path("id") id: Int
    ): ReogUser
}