package com.goesbruno.carpicker.vehicle.parts

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
        val type: Type
    ) {

        fun createWheels(numWheels: Int): List<Wheel>{
           return generateSequence {
                Wheel(type)
            }.take(numWheels).toList()
        }
    }
}