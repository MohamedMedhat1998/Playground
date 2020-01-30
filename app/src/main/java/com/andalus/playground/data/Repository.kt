package com.andalus.playground.data

import com.andalus.playground.model.User

class Repository(private val dataSource: DataSource) {

    fun getUser(): User {
        return dataSource.getData()
    }

    fun saveUser(user: User){
        dataSource.saveData(user)
    }

}