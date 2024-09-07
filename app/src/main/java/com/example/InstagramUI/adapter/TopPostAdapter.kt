package com.example.InstagramUI.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.InstagramUI.R
import com.example.InstagramUI.model.TopPostModel

class TopPostAdapter(val list:List<TopPostModel>):RecyclerView.Adapter<TopPostAdapter.TopPostViewHolder>() {
    class TopPostViewHolder(view:View):RecyclerView.ViewHolder(view) {

    }
        private lateinit var context:Context
         override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopPostViewHolder {
             context=parent.context
        val view= LayoutInflater.from(parent.context).inflate(R.layout.top_post_item,parent,false)
        return TopPostViewHolder(view)
    }

    override fun getItemCount(): Int =list.size

    override fun onBindViewHolder(holder: TopPostViewHolder, position: Int) {
        val drawableResourceId=holder.itemView.resources.getIdentifier(list[position].postImage,"drawable",context.packageName)
        Glide.with(context).load(drawableResourceId).into(holder.itemView.findViewById<ImageView>(R.id.imgTopPostProfile))
    }
}