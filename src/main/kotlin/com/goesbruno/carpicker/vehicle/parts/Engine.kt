package com.goesbruno.carpicker.vehicle.parts

class Engine private constructor (
    val type: Type,
    val transmission: Transmission
) : Part {

    override val selfPrice: Int
        get() = when(type){
            Type.GASOLINE -> 30000
            Type.FLEX -> 35000
            Type.DIESEL -> 50000
            Type.HYBRID -> 60000
            Type.ELETRIC -> 70000
        }
    override val totalCost: Int
        get() = selfPrice + transmission.totalCost

    enum class Type {GASOLINE, FLEX, DIESEL, HYBRID, ELETRIC}

    class Builder {
        private lateinit var engineType: Type
        private lateinit var transmission: Transmission

        fun setTransmission(transmission: Transmission): Builder {
            this.transmission = transmission
            return this
        }

        fun setType(engineType: Type): Builder {
            this.engineType = engineType
            return this
        }

        fun build(): Engine {
            return Engine(engineType, transmission)
        }

    }

}