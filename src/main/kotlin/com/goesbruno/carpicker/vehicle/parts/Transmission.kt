package com.goesbruno.carpicker.vehicle.parts

class Transmission(val type: Type) : Part {
    override val selfPrice: Int
        get() = when(type){
            Type.RWD -> 10000
            Type.FWD -> 8000
            Type.AWD -> 20000
        }
    override val totalCost: Int = selfPrice

    enum class Type {RWD, FWD, AWD}

}