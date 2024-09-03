package com.goesbruno.carpicker.vehicle.parts

import com.goesbruno.carpicker.vehicle.parts.wheel.Wheel

class WheelBase(
    val size: Size,
    val chasis: Chasis,
    val wheelFactory: Wheel.Factory,
    val spareWheel: Boolean = false
) : Part {

    val numWheels = 4 + if (spareWheel) 1 else 0
    val wheels: List<Wheel> = generateSequence {
        wheelFactory.createWheel()
    }.take(numWheels). toList()
    override val selfPrice: Int
        get() = when (size) {
            Size.SMALL -> 20000
            Size.MEDIUM -> 50000
            Size.BIG -> 80000
        }
    override val totalCost: Int
        get() = selfPrice + chasis.totalCost + wheels.sumOf { it.totalCost }

    enum class Size { SMALL, MEDIUM, BIG }
}