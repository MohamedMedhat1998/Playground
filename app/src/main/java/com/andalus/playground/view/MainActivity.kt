package com.andalus.playground.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.andalus.playground.R
import com.andalus.playground.databinding.ActivityMainBinding
import com.andalus.playground.view_model.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        activityBinding.mainActivityViewModel = MainActivityViewModel()

    }
}
