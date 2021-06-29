package edu.nkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class ConverterActivity : AppCompatActivity() {

    lateinit var temperatura: EditText
    lateinit var convFtoC: CheckBox
    lateinit var convCtoF: CheckBox
    lateinit var converte: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)
        initializeElements()

        
    }

    fun initializeElements(){
        temperatura = findViewById(R.id.e_converter_value)
        convCtoF = findViewById(R.id.cb_converter_cToF)
        convFtoC = findViewById(R.id.cb_converter_fToC)
        converte = findViewById(R.id.b_converter_converter)
    }
}