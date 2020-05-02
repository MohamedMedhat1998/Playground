package com.andalus.playground.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.andalus.playground.R
import com.andalus.playground.pojo.Recipe
import kotlinx.android.synthetic.main.item_recipe.view.*

class ChildAdapter(val data: List<Recipe>) : RecyclerView.Adapter<ChildAdapter.RecipeHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeHolder, position: Int) {
        holder.tvItem.text = data[position].recipeTitle
        holder.btnItem.text = data[position].btnTitle
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class RecipeHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem: TextView = itemView.tvItem
        val btnItem: Button = itemView.btnItem
    }
}