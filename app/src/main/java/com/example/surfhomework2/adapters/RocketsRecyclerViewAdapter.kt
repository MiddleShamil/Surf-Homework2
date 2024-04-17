package com.example.surfhomework2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.surfhomework2.R
import com.example.surfhomework2.Rocket

class RocketsRecyclerViewAdapter(private val dataSet: Array<Rocket>) :
    RecyclerView.Adapter<RocketsRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView
        val nameOfRocket: TextView
        val inactive: TextView
        val active: TextView

        init {
            image = view.findViewById(R.id.rocket_image)
            nameOfRocket = view.findViewById(R.id.name_of_active_rocket)
            inactive = view.findViewById(R.id.inactive)
            active = view.findViewById(R.id.active)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rocket_card, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(dataSet[position].image)
        holder.nameOfRocket.text = dataSet[position].nameOfRocket
        if (dataSet[position].isActive) {
            holder.inactive.visibility = View.GONE
            holder.active.visibility = View.VISIBLE
        } else {
            holder.inactive.visibility = View.VISIBLE
            holder.active.visibility = View.GONE
        }
    }


}