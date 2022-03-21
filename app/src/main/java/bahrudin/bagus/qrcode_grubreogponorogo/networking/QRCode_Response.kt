package bahrudin.bagus.qrcode_grubreogponorogo.networking

import android.os.Parcelable
import bahrudin.bagus.qrcode_grubreogponorogo.model.ReogUser
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QRCode_Response(
//    @field:SerializedName("data")
    val data: List<ReogUser>? = null
): Parcelable