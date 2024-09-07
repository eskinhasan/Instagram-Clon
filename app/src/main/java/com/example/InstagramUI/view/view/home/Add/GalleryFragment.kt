package com.example.InstagramUI.view.view.home.Add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramUI.R
import com.example.InstagramUI.adapter.GalleryAdapter
import com.example.InstagramUI.repository.MainRepository


class GalleryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView=view.findViewById<RecyclerView>(R.id.galleryRecycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=GridLayoutManager(requireContext(),3,GridLayoutManager.VERTICAL,false)
        recyclerView.adapter= GalleryAdapter(MainRepository().gallery)

        view.findViewById<ImageView>(R.id.nextAddPost).setOnClickListener {
            findNavController().navigate(R.id.action_galleryFragment3_to_addPostFragment)
        }
    }


}