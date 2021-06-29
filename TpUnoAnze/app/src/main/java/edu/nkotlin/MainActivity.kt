package edu.nkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var palindromo: Button
    lateinit var fToC: Button
    lateinit var fibonacci: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeElements()

        palindromo.setOnClickListener( View.OnClickListener {
            val intentPalindromo = Intent(this, PalindromoActivity::class.java)
            startActivity(intentPalindromo)
        })

        fToC.setOnClickListener(View.OnClickListener {
            val intentFtoC = Intent(this, ConverterActivity::class.java)
            startActivity(intentFtoC)
        })

        fibonacci.setOnClickListener(View.OnClickListener {
            val intentFibonacci = Intent(this, FibonacciActivity::class.java)
            startActivity(intentFibonacci)
        })

    }

    fun initializeElements(){
        palindromo = findViewById(R.id.b_main_palindromo)
        fToC = findViewById(R.id.b_main_converter)
        fibonacci = findViewById(R.id.b_main_fibonacci)
    }
}

