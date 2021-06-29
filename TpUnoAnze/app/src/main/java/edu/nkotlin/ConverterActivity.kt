package edu.nkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class ConverterActivity : AppCompatActivity() {

    lateinit var temperatura: EditText
    lateinit var convFtoC: CheckBox
    lateinit var convCtoF: CheckBox
    lateinit var converte: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)
        initializeElements()

        converte.setOnClickListener(View.OnClickListener {
            val mostrarValorConvertido = findViewById<TextView>(R.id.tv_muestra_conversion)
            if(convCtoF.isChecked && !convFtoC.isChecked){
                mostrarValorConvertido.setText(celsiusTofahrenheit(temperatura.text.toString().toDouble()).toString())
            } else if(convFtoC.isChecked && !convCtoF.isChecked){
                mostrarValorConvertido.setText(fahrenheitTocelsius(temperatura.text.toString().toDouble()).toString())
            }
            else mostrarValorConvertido.setText("Elija solamente una opcion")
        })

    }

    fun initializeElements(){
        temperatura = findViewById(R.id.e_converter_value)
        convCtoF = findViewById(R.id.cb_converter_cToF)
        convFtoC = findViewById(R.id.cb_converter_fToC)
        converte = findViewById(R.id.b_converter_converter)
    }

    fun fahrenheitTocelsius(value: Double): Double{
        return ( (value  -  32  ) *  5)/9
    }

    fun celsiusTofahrenheit(value: Double): Double{
        return ((9/5)*value + 32)
    }

}
