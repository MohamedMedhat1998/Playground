package com.andalus.playground.data

import com.andalus.playground.model.User

interface DataSource {

    fun getData(): User

    fun saveData(user: User)
}