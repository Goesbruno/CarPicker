package com.goesbruno.carpicker.vehicle.parts

class Chasis : Part {
    val seats: List<Seat> = listOf(Seat(), Seat(), Seat(), Seat())
    override val price: Int
        get() = 20000
}