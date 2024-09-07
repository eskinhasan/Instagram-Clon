package com.example.InstagramUI.view.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.InstagramUI.R
import com.example.InstagramUI.adapter.SearchAdapter
import com.example.InstagramUI.repository.MainRepository


class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText=view.findViewById<EditText>(R.id.searchEditText)

            editText.addTextChangedListener {
                val searchText=it.toString()
                val userList= MainRepository().user
                val filteredList= userList.filter { user->user.userName.contains(searchText)}

                val recyclerView=view.findViewById<RecyclerView>(R.id.searchRecyclerView)
                recyclerView.setHasFixedSize(true)
                recyclerView.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
                recyclerView.adapter= SearchAdapter(filteredList)
            }





    }

}