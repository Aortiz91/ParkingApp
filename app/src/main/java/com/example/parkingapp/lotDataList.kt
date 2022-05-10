package com.example.parkingapp

import com.example.parkingapp.dataclasses.ParkingLot

class LotDataList {
    companion object {
        fun listOfLots(numberOfLots: Int): List<ParkingLot> {
            val lotList = mutableListOf<ParkingLot>()
            for (i in 1..numberOfLots) {
                lotList.add(ParkingLot(i, "Monday, 25 May,2022", "8:30 pm"))
            }
            return lotList
        }
    }
}