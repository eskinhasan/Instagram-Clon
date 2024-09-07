package com.example.InstagramUI.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.InstagramUI.R
import com.example.InstagramUI.model.GalleryModel

class GalleryAdapter(val list: List<GalleryModel>):RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {
    class ViewHolder(view:View):RecyclerView.ViewHolder(view) {

    }
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate=LayoutInflater.from(parent.context).inflate(R.layout.gallery_item,parent,false)
        context=parent.context
        return ViewHolder(inflate)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val drawableResourceId=holder.itemView.resources.getIdentifier(list[position].image,"drawable",context.packageName)
        Glide.with(context).load(drawableResourceId).into(holder.itemView.findViewById<ImageView>(R.id.imgGalleryRecycler))

        val layout= holder.itemView.findViewById<ConstraintLayout>(R.id.imageGalleryRecyclerView)
        layout.layoutParams.height=holder.itemView.context.resources.displayMetrics.widthPixels/3
    }

    override fun getItemCount(): Int =list.size
}