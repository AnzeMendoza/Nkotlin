package com.sucho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.sucho.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener{
            val ageString = binding.etAge.text.toString()

            if(ageString.isNotEmpty()){
                val ageInt = ageString.toInt()
                binding.tvResult.setText("La edad canica es de ${ageInt*7} años")
            } else {
                // trabajar con logs
                Log.d("MainActivity","Lanza el toast")
                Toast.makeText(this, "Ingrese una edad valida", Toast.LENGTH_SHORT).show()
            }
        }
    }


}