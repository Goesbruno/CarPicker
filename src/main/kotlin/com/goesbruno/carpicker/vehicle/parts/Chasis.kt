package com.goesbruno.carpicker.vehicle.parts

import com.goesbruno.carpicker.vehicle.parts.seat.Seat

class Chasis(
    val type: Type,
    val seatFactory: Seat.Factory
) : Part {
    val numSeats = when(type){
        Type.HATCHBACK -> 4
        Type.SEDAN -> 5
        Type.SUV -> 7
        Type.PICKUP -> 5
    }
    val seats: List<Seat> = generateSequence {
        seatFactory.createSeat()
    }.take(numSeats).toList()
    override val selfPrice: Int
        get() = when(type){
            Type.HATCHBACK -> 10000
            Type.SEDAN -> 20000
            Type.SUV -> 20000
            Type.PICKUP -> 90000
        }
    override val totalCost: Int
        get() = selfPrice + seats.sumOf { it.totalCost }

    enum class Type {HATCHBACK, SEDAN, SUV, PICKUP}
}