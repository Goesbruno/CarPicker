package com.goesbruno.carpicker.vehicle.parts

class Transmission(val type: Type) : Part {
    override val selfPrice: Int
        get() = when(type){
            Type.RWD -> 20000
            Type.FWD -> 10000
            Type.AWD -> 40000
        }
    override val totalCost: Int = selfPrice

    enum class Type {RWD, FWD, AWD}

}