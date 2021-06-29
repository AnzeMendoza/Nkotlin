package edu.nkotlin.view

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import edu.nkotlin.R
import edu.nkotlin.model.User
import edu.nkotlin.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    lateinit var user: EditText
    lateinit var pass: EditText
    lateinit var signin: Button
    lateinit var login: Button
    lateinit var forget: Button
    lateinit var frameRegister: FrameLayout

    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeElements()

        // estariamos inicializando el objeto
        // en java --> kotlin
        // Class.forName(Usuario.class) --> Usuario::class.java
        val userVM = ViewModelProvider(this).get(UserViewModel::class.java)


        // a nivel de codigo llamamos al evento onClick
        login.setOnClickListener(
            View.OnClickListener {
                var u: User = User(user.text.toString(),pass.text.toString())

                u = userVM.validateUser(u)!!

                if(u != null){
                    val intent: Intent= Intent(this, InicioActivity::class.java)

                    intent.putExtra("usuario", u)

                    //debo inicializar el elemento
                    startActivity(intent)
                }

            }
        )

        signin.setOnClickListener(
            View.OnClickListener {
                val viewRegister: View = LayoutInflater.from(this).inflate(R.layout.register_layout, null,false)

                var userRegister: EditText = viewRegister.findViewById(R.id.r_user)
                var passRegister: EditText = viewRegister.findViewById(R.id.r_password)
                var saveRegister: Button = viewRegister.findViewById(R.id.r_save)

                saveRegister.setOnClickListener(
                    View.OnClickListener{
                        userVM.saveUser(userRegister.text.toString(), passRegister.text.toString())
                        Toast.makeText(viewRegister.context,"Usuario guardado correctamente", Toast.LENGTH_SHORT).show()
                        frameRegister.removeAllViews()
                    }
                )
                frameRegister.addView(viewRegister)
            }
        )
    }

    fun initializeElements(){
        user = findViewById(R.id.e_user)
        pass = findViewById(R.id.e_pass)
        signin = findViewById(R.id.b_register)
        login = findViewById(R.id.b_login)
        forget = findViewById(R.id.b_restore)
        frameRegister = findViewById(R.id.f_register)
    }
}