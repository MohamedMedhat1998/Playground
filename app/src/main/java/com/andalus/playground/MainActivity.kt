package com.andalus.playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.andalus.playground.databinding.ActivityMainBinding
import com.andalus.playground.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userBinding  = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val customUser = User("Mohamed","mohamed.medhat0298@gmail.com")

        userBinding.mainActivityUser = customUser

        btnChange.setOnClickListener {
            customUser.name = etName.text.toString()
            customUser.email = etEmail.text.toString()
            userBinding.mainActivityUser = customUser
        }
    }
}
