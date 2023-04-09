package com.example.recyclerviewproject

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class myAdapter(var newsArrayList: ArrayList<News>, var context: Activity):
    RecyclerView.Adapter<myAdapter.myViewHolders>()
{

// To create the new view instance
//    when the layout manger fails to find a suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAdapter.myViewHolders {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.each_row, parent, false)
    return myViewHolders(itemView)

    }

    // populate item with data
    override fun onBindViewHolder(holder: myAdapter.myViewHolders, position: Int) {
        val currentItem = newsArrayList[position]
        holder.hTitle.text = currentItem.NewsHeading
        holder.hImage.setImageResource(currentItem.newsImage)
    }

    // It counts the number of items present in your array
    override fun getItemCount(): Int {
        return newsArrayList.size
    }

    // It holds the views are not created everytime, to save the memory
    class myViewHolders(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val hTitle = itemView.findViewById<TextView>(R.id.headingTitle)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.headingImage)

    }
}