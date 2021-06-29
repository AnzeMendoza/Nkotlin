package edu.nkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import edu.nkotlin.R
import edu.nkotlin.model.User

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val user: User = intent.getSerializableExtra("usuario") as User
        Toast.makeText(this, "hola" + user.userName, Toast.LENGTH_LONG).show()
    }
}