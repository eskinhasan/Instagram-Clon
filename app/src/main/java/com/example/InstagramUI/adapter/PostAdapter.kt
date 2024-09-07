package com.example.InstagramUI.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.InstagramUI.R
import com.example.InstagramUI.model.PostModel

class PostAdapter(val list: List<PostModel>):RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    class PostViewHolder(view:View):RecyclerView.ViewHolder(view) {

    }
    private  lateinit var content: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        content=parent.context
        val view=LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent,false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val drawableResourceId=holder.itemView.resources.getIdentifier(list[position].postImage,"drawable",content.packageName)
        Glide.with(content).load(drawableResourceId).into(holder.itemView.findViewById<ImageView>(R.id.imgPostProfile))

        val drawableResourceId2=holder.itemView.resources.getIdentifier(list[position].postImage,"drawable",content.packageName)
        Glide.with(content).load(drawableResourceId2).into(holder.itemView.findViewById<ImageView>(R.id.imgPostProfile))

        //holder.itemView.findViewById<ImageView>(R.id.imgPostProfile).setImageDrawable(list[position].userImage)holder.itemView.findViewById<ImageView>(R.id.imgPostImage).setImageDrawable(list[position].postImage as Drawable)
        holder.itemView.findViewById<TextView>(R.id.txtPostLocation).text=list[position].postLocation
        holder.itemView.findViewById<TextView>(R.id.txtPostUserName).text=list[position].userName
        holder.itemView.findViewById<TextView>(R.id.txtPostUserName2).text=list[position].userName
        holder.itemView.findViewById<TextView>(R.id.txtPostTitle).text=list[position].postTitle
    }
}