package com.example.surfhomework2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.surfhomework2.R
import com.example.surfhomework2.Rocket

class LaunchesRecyclerViewAdapter(private val dataSet: Array<Rocket>) :
    RecyclerView.Adapter<LaunchesRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameOfRocket: TextView
        val image: ImageView
        val typeOfRocket: TextView
        val data: TextView

        init {
            nameOfRocket = view.findViewById(R.id.name_of_rocket)
            image = view.findViewById(R.id.image)
            typeOfRocket = view.findViewById(R.id.type_of_rocket)
            data = view.findViewById(R.id.data)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.basic_card, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameOfRocket.text = dataSet[position].nameOfRocket
        holder.typeOfRocket.text = dataSet[position].typeOfRocket
        holder.data.text = dataSet[position].data
        holder.image.setImageResource(dataSet[position].image)
    }
}