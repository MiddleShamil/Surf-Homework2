package com.example.surfhomework2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.surfhomework2.R
import com.example.surfhomework2.Rockets
import com.example.surfhomework2.adapters.RocketsRecyclerViewAdapter

class RocketsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rockets, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rocketList = Rockets.getRockets()
        val itemAdapter = RocketsRecyclerViewAdapter(rocketList)

        val recyclerView : RecyclerView = view.findViewById(R.id.rockets_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)

        recyclerView.adapter = itemAdapter
    }
}