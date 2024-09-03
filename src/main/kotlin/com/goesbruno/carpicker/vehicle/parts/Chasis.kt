package com.goesbruno.carpicker.vehicle.parts

class Chasis(val type: Type) : Part {
    val seats: List<Seat> = listOf(Seat(), Seat(), Seat(), Seat())
    override val selfPrice: Int
        get() = when(type){
            Type.HATCHBACK -> 10000
            Type.SEDAN -> 20000
            Type.SUV -> 25000
            Type.PICKUP -> 30000
        }
    override val totalCost: Int
        get() = selfPrice + seats.sumOf { it.totalCost }

    enum class Type {HATCHBACK, SEDAN, SUV, PICKUP}
}