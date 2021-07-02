package edu.nkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.nkotlin.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val SUPERHERO_KEY = "superhero"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!

        val superhero = bundle.getParcelable<Superhero>(SUPERHERO_KEY)!!
        binding.superhero = superhero
    }
}