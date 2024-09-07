package com.example.InstagramUI.view.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramUI.R
import com.example.InstagramUI.adapter.PostAdapter
import com.example.InstagramUI.adapter.TopPostAdapter
import com.example.InstagramUI.repository.MainRepository


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView=view.findViewById<RecyclerView>(R.id.homeFragmentRecycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter= PostAdapter(MainRepository().post)


        val recyclerTopView=view.findViewById<RecyclerView>(R.id.homeTopFragmentRecycler)
        recyclerTopView.setHasFixedSize(true)
        recyclerTopView.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        recyclerTopView.adapter= TopPostAdapter(MainRepository().topPost)









    }


}