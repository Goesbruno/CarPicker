package com.goesbruno.carpicker.vehicle.parts

class Seat: Part {
    override val selfPrice: Int
        get() = 2000
    override val totalCost: Int = selfPrice
}