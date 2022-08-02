package com.example.classtest

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AnimalAdapter(private val context: Context):
    RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {
    var datas = mutableListOf<Buy>()

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private  val txtImage: ImageView = itemView.findViewById(R.id.image)
        private val txtName: TextView = itemView.findViewById(R.id.nameLbl)
        private val txtBorn: TextView = itemView.findViewById(R.id.cityLbl)
        private val txtTime: TextView = itemView.findViewById(R.id.timeLbl)
        private val txtMuch: TextView = itemView.findViewById(R.id.muchLbl)

        fun bind(item: Buy) {
            txtImage.setImageResource(R.drawable.air)
            txtName.text = item.name
            txtBorn.text = item.city
            txtTime.text = item.time

            txtMuch.text = item.much

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_animal,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    override fun getItemCount(): Int {
        return datas.size
    }
}