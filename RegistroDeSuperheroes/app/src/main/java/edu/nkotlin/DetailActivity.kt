package edu.nkotlin

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.nkotlin.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val SUPERHERO_KEY = "superhero"
        const val BITMAP_KEY = "bitmap"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!

        val superhero = bundle.getParcelable<Superhero>(SUPERHERO_KEY)!!
        val heroImage = bundle.getParcelable<Bitmap>(BITMAP_KEY)!!

        binding.ivHero.setImageBitmap(heroImage)
        binding.superhero = superhero
    }
}