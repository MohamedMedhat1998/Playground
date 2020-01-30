package com.andalus.playground.data

import android.content.Context
import com.andalus.playground.model.User
import com.andalus.playground.utils.Constants

class LocalDatabase(private val context: Context) : DataSource{

    override fun getData(): User {
        val prefs = context.getSharedPreferences(Constants.PREFS_FILE_NAME, Context.MODE_PRIVATE)
        val username = prefs.getString(Constants.USERNAME, "")
        val email = prefs.getString(Constants.EMAIL, "")
        return User(username, email)
    }

    override fun saveData(user: User) {
        val prefs =
            context.getSharedPreferences(Constants.PREFS_FILE_NAME, Context.MODE_PRIVATE).edit()
        prefs.putString(Constants.USERNAME, user.username)
        prefs.putString(Constants.EMAIL, user.email)
        prefs.apply()
    }
}