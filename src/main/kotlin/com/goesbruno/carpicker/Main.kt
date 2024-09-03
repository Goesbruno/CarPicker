package com.goesbruno.carpicker

import com.goesbruno.carpicker.vehicle.Vehicle
import com.goesbruno.carpicker.vehicle.parts.Chasis
import com.goesbruno.carpicker.vehicle.parts.Engine
import com.goesbruno.carpicker.vehicle.parts.Transmission
import com.goesbruno.carpicker.vehicle.parts.WheelBase
import com.goesbruno.carpicker.vehicle.parts.seat.Seat
import com.goesbruno.carpicker.vehicle.parts.wheel.Wheel

fun main() {
    val hatch = Vehicle(
        Engine(
            Engine.Type.FLEX,
            Transmission(Transmission.Type.FWD)
        ),
        WheelBase(
            WheelBase.Size.SMALL,
            Chasis(
                Chasis.Type.HATCHBACK,
                Seat.Factory(Seat.Uphosltery.CLOTH)
            ),
            Wheel.Factory(Wheel.Type.STEEL)
        )
    )
    val sedan = Vehicle(
        Engine(
            Engine.Type.FLEX,
            Transmission(Transmission.Type.FWD)
        ),
        WheelBase(
            WheelBase.Size.MEDIUM,
            Chasis(
                Chasis.Type.SEDAN,
                Seat.Factory(Seat.Uphosltery.LEATHER)
                ),
            Wheel.Factory(Wheel.Type.ALLOY)
        )
    )
    val suv = Vehicle(
        Engine(
            Engine.Type.DIESEL,
            Transmission(Transmission.Type.AWD)
        ),
        WheelBase(
            WheelBase.Size.BIG,
            Chasis(
                Chasis.Type.SUV,
                Seat.Factory(Seat.Uphosltery.REXINE)
            ),
            Wheel.Factory(Wheel.Type.CARBONFIBER),
            spareWheel = true
        )
    )

    val eletricHatch = Vehicle(
        Engine(
            Engine.Type.ELETRIC,
            Transmission(Transmission.Type.AWD)
        ),
        WheelBase(
            WheelBase.Size.SMALL,
            Chasis(
                Chasis.Type.HATCHBACK,
                Seat.Factory(Seat.Uphosltery.LEATHER)
            ),
            Wheel.Factory(Wheel.Type.ALLOY)
        )
    )
    val pickup = Vehicle(
        Engine(
            Engine.Type.DIESEL,
            Transmission(Transmission.Type.AWD)
        ),
        WheelBase(
            WheelBase.Size.BIG,
            Chasis(
                Chasis.Type.PICKUP,
                Seat.Factory(Seat.Uphosltery.LEATHER)
            ),
            Wheel.Factory(Wheel.Type.CARBONFIBER),
            spareWheel = true
        )
    )
    println("Preço do hatchback: ${hatch.price}")
    println("Preço do sedan: ${sedan.price}")
    println("Preço do SUV: ${suv.price}")
    println("Preço do hatchback elétrico: ${eletricHatch.price}")
    println("Preço da Pickup: ${pickup.price}")
}