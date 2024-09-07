package com.example.InstagramUI.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.InstagramUI.R
import com.example.InstagramUI.model.User

class SearchAdapter(private val list:List<User>):RecyclerView.Adapter<SearchAdapter.ViewHolder>() {
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){

    }
    lateinit var  context:Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.search_item,parent,false)
        context=view.context
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int =list.size

    @SuppressLint("CutPasteId")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val img=holder.itemView.findViewById<ImageView>(R.id.imgSearchProfile)
        val user=holder.itemView.findViewById<TextView>(R.id.imgSearchUserName)
        user.text=list[position].userName

        val drawableResourceId=holder.itemView.resources.getIdentifier(list[position].imageUser,"drawable",context.packageName)
        Glide.with(context).load(drawableResourceId).into(img)
    }
}