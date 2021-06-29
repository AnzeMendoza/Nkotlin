package edu.nkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PalindromoActivity : AppCompatActivity() {

    lateinit var frase: EditText
    lateinit var verificar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindromo)
        initializeElements()

        verificar.setOnClickListener(View.OnClickListener {
            if(vericaPalindromo(frase.text.toString())){
                Toast.makeText(this, "ES UN PALINDROMO", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "NO ES UN PALINDROMO", Toast.LENGTH_SHORT).show()
            }
        })
    }

    fun initializeElements(){
        frase = findViewById(R.id.e_palindromo_frase)
        verificar = findViewById(R.id.b_palidromo_verificar)
    }

    fun vericaPalindromo(fraseTe: String): Boolean{
        val fraseSinEspacios = fraseTe.replace(" ", "").lowercase()
        val fraseInvertida = fraseSinEspacios.reversed()

        return fraseSinEspacios.equals(fraseInvertida)
    }
}