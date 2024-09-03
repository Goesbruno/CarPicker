package com.goesbruno.carpicker.vehicle.parts

class WheelBase(
    val size: Size,
    val chasis: Chasis
) : Part {

    val wheels: List<Wheel> = listOf(Wheel(), Wheel(), Wheel(), Wheel())
    override val selfPrice: Int
        get() = when (size) {
            Size.SMALL -> 30000
            Size.MEDIUM -> 40000
            Size.BIG -> 50000
        }
    override val totalCost: Int
        get() = selfPrice + chasis.totalCost + wheels.sumOf { it.totalCost }

    enum class Size { SMALL, MEDIUM, BIG }
}