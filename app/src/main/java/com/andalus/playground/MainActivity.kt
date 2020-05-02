package com.andalus.playground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.andalus.playground.adapter.ParentAdapter
import com.andalus.playground.pojo.Category
import com.andalus.playground.pojo.Recipe
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        populateFakeData()
    }


    private fun populateFakeData() {
        val categories = mutableListOf<Category>()
        val fakeRecipes = mutableListOf<Recipe>()
        fakeRecipes.add(Recipe("meat", "1"))
        fakeRecipes.add(Recipe("chicken", "2"))
        fakeRecipes.add(Recipe("kick", "3"))
        fakeRecipes.add(Recipe("double", "4"))
        fakeRecipes.add(Recipe("csgo", "5"))
        fakeRecipes.add(Recipe("Rocket-League", "6"))
        fakeRecipes.add(Recipe("ArmyMen", "7"))
        fakeRecipes.add(Recipe("Stronghold", "8"))
        fakeRecipes.add(Recipe("Arma 3", "9"))
        categories.add(Category("First", fakeRecipes))
//        categories.add(Category("Second", fakeRecipes))
//        categories.add(Category("Third", fakeRecipes))
//        categories.add(Category("Forth", fakeRecipes))
//        categories.add(Category("Fifth", fakeRecipes))
//        categories.add(Category("sixth", fakeRecipes))
//        categories.add(Category("seventh", fakeRecipes))
//        categories.add(Category("eighth", fakeRecipes))
//        categories.add(Category("ninth", fakeRecipes))
//        categories.add(Category("tenth", fakeRecipes))
        rvParent.layoutManager = LinearLayoutManager(this)
        rvParent.adapter = ParentAdapter(categories)
    }

}
