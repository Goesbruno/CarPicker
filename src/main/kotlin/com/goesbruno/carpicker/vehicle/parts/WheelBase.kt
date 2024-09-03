package com.goesbruno.carpicker.vehicle.parts

class WheelBase private constructor(
    private val size: Size,
    private val wheels: List<Wheel>
) : Part {

    override val selfPrice: Int
        get() = when (size) {
            Size.SMALL -> 20000
            Size.MEDIUM -> 50000
            Size.BIG -> 80000
        }
    override val totalCost: Int
        get() = selfPrice + wheels.sumOf { it.totalCost }

    enum class Size { SMALL, MEDIUM, BIG }

    class Builder {
        private lateinit var wheelBaseSize: Size
        private lateinit var wheelFactory: Wheel.Factory
        private var spareWheel = false

        fun setSize(wheelBaseSize: Size): Builder {
            this.wheelBaseSize = wheelBaseSize
            return this
        }

        fun setWheelFactory(wheelFactory: Wheel.Factory): Builder {
            this.wheelFactory = wheelFactory
            return this
        }

        fun setSpareWheel(spareWheel: Boolean): Builder {
            this.spareWheel = spareWheel
            return this
        }

        fun build(): WheelBase {
            return WheelBase(
                this.wheelBaseSize,
                this.wheelFactory.createWheels(
                    4 + if (spareWheel) 1 else 0
                )
            )
        }
    }
}