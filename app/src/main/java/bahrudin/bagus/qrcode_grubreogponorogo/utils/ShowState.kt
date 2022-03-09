package bahrudin.bagus.qrcode_grubreogponorogo.utils

import android.content.res.Resources
import android.view.View
import bahrudin.bagus.qrcode_grubreogponorogo.databinding.ActivityDetailBinding

class ShowState(private val stateId: Int) {

//    fun loading(homeBinding: HomeFragmentBinding?, followBinding: FollowFragmentBinding?){
//        when(stateId){
//            1 -> {
//                homeBinding?.errLayout?.mainNotFound?.visibility = View.GONE
//                homeBinding?.progress?.visibility = View.VISIBLE
//                homeBinding?.recyclerHome?.visibility = View.GONE
//            }
//            2 -> {
//                followBinding?.errLayout?.mainNotFound?.visibility = View.GONE
//                followBinding?.progress?.visibility = View.VISIBLE
//                followBinding?.recylerFollow?.visibility = View.GONE
//            }
//        }
//    }

    fun success(detailBinding: ActivityDetailBinding?){
        when(stateId){
            1 ->{
                detailBinding?.errLayout?.mainNotFound?.visibility = View.GONE
                homeBinding?.progress?.visibility = View.GONE
                homeBinding?.recyclerHome?.visibility = View.VISIBLE
            }
        }
    }

    fun error(detailBinding: ActivityDetailBinding?){
        when(stateId){
            1 -> {
                detailBinding?.errLayout?.mainNotFound?.visibility = View.VISIBLE
                homeBinding?.errLayout?.emptyText?.text = message ?: resources.getString(R.string.not_found)
                homeBinding?.progress?.visibility = View.GONE
                homeBinding?.recyclerHome?.visibility = View.GONE
            }
        }
    }

}