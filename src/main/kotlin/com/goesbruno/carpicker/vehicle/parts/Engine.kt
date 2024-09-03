package com.goesbruno.carpicker.vehicle.parts

import kotlin.reflect.typeOf

class Engine(
    val type: Type,
    val transmission: Transmission
) : Part {

    override val selfPrice: Int
        get() = when(type){
            Type.GASOLINE -> 30000
            Type.FLEX -> 35000
            Type.DIESEL -> 40000
            Type.HYBRID -> 50000
            Type.ELETRIC -> 60000
        }
    override val totalCost: Int
        get() = selfPrice + transmission.totalCost

    enum class Type {GASOLINE, FLEX, DIESEL, HYBRID, ELETRIC}
}