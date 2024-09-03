package com.goesbruno.carpicker.vehicle

import com.goesbruno.carpicker.vehicle.parts.Engine
import com.goesbruno.carpicker.vehicle.parts.WheelBase

class Vehicle() {
    val engine: Engine = Engine()
    val wheelBase: WheelBase = WheelBase()

    var price: Int = 0
        get() {
                var costs = 0
                costs += wheelBase.price
                costs += wheelBase.chasis.price
                costs += wheelBase.wheels.sumOf { it.price }
                costs += wheelBase.chasis.seats.sumOf { it.price }
                costs += engine.price
                costs += engine.transmission.price
                return costs
            }

}