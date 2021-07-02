package edu.nkotlin

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import edu.nkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var heroImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener{
            val superHeroName = binding.etNameHero.text.toString()
            val alterEgo = binding.etAlterEgo.text.toString()
            val bio = binding.etBio.text.toString()
            val ratingPower = binding.rbRating.rating

            val hero = Superhero(superHeroName, alterEgo, bio, ratingPower)
            openDetailActivity(hero)
        }
        heroImage = binding.ivHero
        heroImage.setOnClickListener{
            openCamera()
        }
    }

    private fun openCamera() {
        // es un intent implicito solo tiene un origen.
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(cameraIntent, 1000)
    }

    private fun openDetailActivity(superhero: Superhero){
        // es un intent explicito, tiene origen y destino
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.SUPERHERO_KEY, superhero)
        intent.putExtra(DetailActivity.BITMAP_KEY, heroImage.drawable.toBitmap())
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK && requestCode == 1000){
            val extras = data?.extras
            val heroMap  = extras?.getParcelable<Bitmap>("data")
            heroImage.setImageBitmap(heroMap)
        }
    }
}