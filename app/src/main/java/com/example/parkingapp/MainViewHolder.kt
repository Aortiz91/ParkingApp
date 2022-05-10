package com.example.parkingapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parkingapp.dataclasses.ParkingLot

class LotViewHolder (view: View): RecyclerView.ViewHolder(view){
    private val lotID = view.findViewById<TextView>(R.id.textLotID)
    private val date = view.findViewById<TextView>(R.id.textLotDate)
    private val hour = view.findViewById<TextView>(R.id.textLotHour)

    fun bind(lotData: ParkingLot) {

        lotID.text = lotData.lotId.toString()
        date.text = lotData.lotDate
        hour.text = lotData.lotHour

    }
}