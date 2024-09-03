package com.goesbruno.carpicker.vehicle.parts

class Engine(
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
}