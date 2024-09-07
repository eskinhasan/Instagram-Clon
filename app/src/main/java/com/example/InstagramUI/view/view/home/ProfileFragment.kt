package com.example.InstagramUI.view.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.InstagramUI.adapter.GalleryAdapter
import com.example.InstagramUI.databinding.FragmentProfileBinding
import com.example.InstagramUI.repository.MainRepository

class ProfileFragment : Fragment() {

    private lateinit var _binding:FragmentProfileBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding=FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.profileRecyclerView.setHasFixedSize(true)
        binding.profileRecyclerView.layoutManager=GridLayoutManager(requireContext(),3,GridLayoutManager.VERTICAL,false)
        binding.profileRecyclerView.adapter= GalleryAdapter(MainRepository().gallery)
    }


}

