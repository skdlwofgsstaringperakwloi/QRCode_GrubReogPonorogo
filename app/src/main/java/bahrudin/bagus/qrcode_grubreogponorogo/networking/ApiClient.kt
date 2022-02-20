package bahrudin.bagus.qrcode_grubreogponorogo.networking

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

class ApiClient {
    @GET("users/{username}/followers")
    suspend fun userFollower(
        @Path("username") username: String?
    ): List<ReogUser>

    @GET("users/{username}/following")
    suspend fun userFollowing(
        @Path("username") username: String?
    ): List<ReogUser>
}