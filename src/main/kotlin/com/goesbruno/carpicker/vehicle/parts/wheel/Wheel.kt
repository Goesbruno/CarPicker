package com.goesbruno.carpicker.vehicle.parts.wheel

import com.goesbruno.carpicker.vehicle.parts.Part

class Wheel private constructor (
    val type: Type
): Part {
    override val selfPrice: Int
        get() = when(type){
            Type.STEEL -> 2000
            Type.ALLOY -> 4000
            Type.CARBONFIBER -> 8000
        }

    override val totalCost: Int = selfPrice

    enum class Type {STEEL, ALLOY, CARBONFIBER}

    class Factory(
        val type: Wheel.Type
    ) {

        fun createWheel(): Wheel{
            return Wheel(type)
        }

    }
}