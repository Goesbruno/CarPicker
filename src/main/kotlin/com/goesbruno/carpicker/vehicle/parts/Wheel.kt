package com.goesbruno.carpicker.vehicle.parts

class Wheel: Part {
    override val selfPrice: Int
        get() = 1000
    override val totalCost: Int = selfPrice
}