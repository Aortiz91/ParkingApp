package com.example.parkingapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parkingapp.LotViewHolder
import com.example.parkingapp.dataclasses.ParkingLot
import com.example.parkingapp.R


class MainAdapter(private val lotList: List<ParkingLot>) : RecyclerView.Adapter<LotViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LotViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return LotViewHolder(layoutInflater.inflate(R.layout.item_recycler_parking_app, parent,false))
    }

    override fun onBindViewHolder(holder: LotViewHolder, position: Int) {
        val item = lotList[position]

        holder.bind(item)
    }
    override fun getItemCount() = lotList.size
}
