package com.goesbruno.carpicker.vehicle

import com.goesbruno.carpicker.vehicle.parts.Chasis
import com.goesbruno.carpicker.vehicle.parts.Engine
import com.goesbruno.carpicker.vehicle.parts.WheelBase

class Vehicle private constructor (
    engine: Engine,
    wheelBase: WheelBase,
    chasis: Chasis
) {

    var price: Int = wheelBase.totalCost + engine.totalCost + chasis.totalCost

    class Builder {
        private lateinit var engine: Engine
        private lateinit var wheelBase: WheelBase
        private lateinit var chasis: Chasis

        fun setEngine(engine: Engine): Builder {
            this.engine = engine
            return this
        }

        fun setWheelBase(wheelBase: WheelBase): Builder{
            this.wheelBase = wheelBase
            return this
        }

        fun setChasis(chasis: Chasis): Builder {
            this.chasis = chasis
            return this
        }

        fun build(): Vehicle {
            return Vehicle(
                engine,
                wheelBase,
                chasis
            )
        }

    }
}