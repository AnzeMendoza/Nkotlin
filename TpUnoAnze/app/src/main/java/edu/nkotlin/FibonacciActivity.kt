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
        initializeElements()

        siguienteNumero.setOnClickListener(
            View.OnClickListener {

            val mostrarValorConvertido = findViewById<TextView>(R.id.tv_muestra_conversion)
            val siguienteFibonacci = calculoFibonacciSiguienteValor(numeroFibonacci.text.toString().toInt())

            if(siguienteFibonacci>0){
                mostrarValorConvertido.setText("El siguiente valor es : $siguienteFibonacci")
            } else {
                mostrarValorConvertido.setText("El valor ingresado no corresponde a un valor de la serie")
            }
        })
    }

    fun initializeElements(){
        numeroFibonacci = findViewById(R.id.e_fibonacci_numero)
        siguienteNumero = findViewById(R.id.b_fibonacci_siguiente)
    }

    fun calculoFibonacciSiguienteValor(numero: Int): Int{
        var a = 0
        var b = 1

        while (a<numero){
            a = b
            b += a
        }

        if(a==numero)
            return b
        return 0
    }

}