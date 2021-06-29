package edu.nkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FibonacciActivity : AppCompatActivity() {

    lateinit var numeroFibonacci: EditText
    lateinit var siguienteNumero: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fibonacci)

        siguienteNumero.setOnClickListener(View.OnClickListener {
            val mostrarValorConvertido = findViewById<TextView>(R.id.tv_muestra_conversion)


        })
    }

    fun initializeElements(){
        numeroFibonacci = findViewById(R.id.e_fibonacci_numero)
        siguienteNumero = findViewById(R.id.b_fibonacci_siguiente)
    }

    fun calculoFibonacci(){

    }

}