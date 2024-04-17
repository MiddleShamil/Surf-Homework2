package com.example.surfhomework2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.surfhomework2.R
import com.example.surfhomework2.adapters.LaunchesRecyclerViewAdapter
import com.example.surfhomework2.Rockets

class LaunchesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_launches, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rocketList = Rockets.getLaunchedRockets()
        val itemAdapter = LaunchesRecyclerViewAdapter(rocketList)

        val recyclerView : RecyclerView = view.findViewById(R.id.launches_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)

        recyclerView.adapter = itemAdapter
    }
}