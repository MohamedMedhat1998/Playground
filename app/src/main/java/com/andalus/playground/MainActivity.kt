package com.andalus.playground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.andalus.playground.data.LocalDatabase
import com.andalus.playground.data.Repository
import com.andalus.playground.model.User
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.get
import org.koin.dsl.module


class MainActivity : AppCompatActivity() {

    private val repository: Repository = get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvPreview.text =
            getString(R.string.preview, repository.getUser().username, repository.getUser().email)

        btnSave.setOnClickListener {
            repository.saveUser(User(etUsername.text.toString(),etEmail.text.toString()))
        }

        btnLoad.setOnClickListener {
            tvPreview.text =
                getString(R.string.preview, repository.getUser().username, repository.getUser().email)
        }
    }
}
