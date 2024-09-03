package com.goesbruno.carpicker

import com.goesbruno.carpicker.vehicle.Vehicle
import com.goesbruno.carpicker.vehicle.parts.Chasis
import com.goesbruno.carpicker.vehicle.parts.Engine
import com.goesbruno.carpicker.vehicle.parts.Transmission
import com.goesbruno.carpicker.vehicle.parts.WheelBase

fun main() {
    val sedan = Vehicle(
        Engine(
            Engine.Type.FLEX,
            Transmission(Transmission.Type.FWD)
        ),
        WheelBase(
            WheelBase.Size.MEDIUM,
            Chasis(Chasis.Type.SEDAN)
        )
    )
    val suv = Vehicle(
        Engine(
            Engine.Type.DIESEL,
            Transmission(Transmission.Type.AWD)
        ),
        WheelBase(
            WheelBase.Size.BIG,
            Chasis(Chasis.Type.SUV)
        )
    )
    println("Preço do sedan: ${sedan.price}")
    println("Preço do SUV: ${suv.price}")


}