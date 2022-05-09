package com.example.parkingapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView



class LotAdapter(private val lotList: List<ParkingLot>) : RecyclerView.Adapter<LotViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LotViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return LotViewHolder(layoutInflater.inflate(R.layout.item_parking_lot, parent,false))
    }

    override fun onBindViewHolder(holder: LotViewHolder, position: Int) {
        val item = lotList[position]

        holder.bind(item)
    }

    override fun getItemCount() = lotList.size
}
