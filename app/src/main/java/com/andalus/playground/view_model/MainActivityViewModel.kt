package com.andalus.playground.view_model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.andalus.playground.model.User

class MainActivityViewModel : BaseObservable(){

    private val user = User("Mohamed Medhat",21)


    @Bindable
    fun getUserName() : String{
        return user.name
    }

    @Bindable
    fun getUserAge() : String{
        return user.age.toString()
    }

    fun setUserName(name : String){
        user.name = name
        notifyPropertyChanged(BR.userName)
    }

    fun setUserAge(age : Int){
        user.age = age
        notifyPropertyChanged(BR.userAge)
    }

    fun onButtonClicked(){
        setUserName("new Name")
        setUserAge(1)
    }

}