package bahrudin.bagus.qrcode_grubreogponorogo.networking

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ReogUser(
    val id: Int,
//    val avatar_url: String,
    val name: String?,
    val owner: String?,
    val profession: String?,
    val address: String?
) : Parcelable