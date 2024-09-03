package com.goesbruno.carpicker.vehicle

import com.goesbruno.carpicker.vehicle.parts.Engine
import com.goesbruno.carpicker.vehicle.parts.WheelBase

class Vehicle(
    val engine: Engine,
    val wheelBase: WheelBase
) {

    var price: Int = wheelBase.totalCost + engine.totalCost


}