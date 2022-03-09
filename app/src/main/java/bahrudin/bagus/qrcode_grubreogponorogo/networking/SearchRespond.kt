package bahrudin.bagus.qrcode_grubreogponorogo.networking

import android.os.Parcelable
import bahrudin.bagus.qrcode_grubreogponorogo.model.ReogUser
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchRespond(
    val total_count : String,
    val incomplete_results: Boolean? = null,
    val items : List<ReogUser>
): Parcelable