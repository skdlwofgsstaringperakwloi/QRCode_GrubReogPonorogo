package bahrudin.bagus.qrcode_grubreogponorogo.activities

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import bahrudin.bagus.qrcode_grubreogponorogo.R
import bahrudin.bagus.qrcode_grubreogponorogo.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.idProfil.text =
    }

}