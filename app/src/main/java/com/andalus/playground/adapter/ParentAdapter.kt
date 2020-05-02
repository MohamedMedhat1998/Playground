package com.andalus.playground.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andalus.playground.R
import com.andalus.playground.pojo.Category
import kotlinx.android.synthetic.main.item_category.view.*

class ParentAdapter(private val data: List<Category>) :
    RecyclerView.Adapter<ParentAdapter.CategoryHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.tvTitle.text = data[position].categoryTitle
        holder.rvRecipes.adapter = ChildAdapter(data[position].data)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class CategoryHolder(view: View) : RecyclerView.ViewHolder(view) {
        val rvRecipes: RecyclerView = itemView.childRecyclerView
        val tvTitle: TextView = itemView.tvTitle

        init {
            rvRecipes.layoutManager =
                LinearLayoutManager(itemView.context, RecyclerView.HORIZONTAL, false)
        }
    }
}