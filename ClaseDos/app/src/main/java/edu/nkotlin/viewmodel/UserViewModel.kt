package edu.nkotlin.viewmodel

import androidx.lifecycle.ViewModel
import edu.nkotlin.model.User

// asemeja a un controlador
class UserViewModel: ViewModel() {

    var userList:ArrayList<User> = ArrayList<User>()

    fun validateUser(u:User): User? {
        userList.forEach(
            {
                if (it.userName.equals(u.userName) && it.password.equals(u.password))
                    return it
            },
        )
        return null
    }

    fun saveUser(username: String, password: String){
        userList.add(User(username, password))
    }
}