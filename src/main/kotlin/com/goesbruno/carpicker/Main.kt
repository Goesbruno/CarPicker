package com.goesbruno.carpicker

import com.goesbruno.carpicker.vehicle.Vehicle
import com.goesbruno.carpicker.vehicle.parts.Chasis
import com.goesbruno.carpicker.vehicle.parts.Engine
import com.goesbruno.carpicker.vehicle.parts.Transmission
import com.goesbruno.carpicker.vehicle.parts.WheelBase
import com.goesbruno.carpicker.vehicle.parts.Seat
import com.goesbruno.carpicker.vehicle.parts.Wheel

fun main() {

    val engineBuilder = Engine.Builder()
    val wheelBaseBuilder = WheelBase.Builder()
    val chasisBuilder = Chasis.Builder()
    val vehicleBuilder = Vehicle.Builder()

    val hatch = vehicleBuilder
        .setEngine(
            engineBuilder
                .setType(Engine.Type.FLEX)
                .setTransmission(Transmission(Transmission.Type.FWD))
                .build()
        )
        .setWheelBase(
            wheelBaseBuilder
                .setSize(WheelBase.Size.SMALL)
                .setWheelFactory(Wheel.Factory(Wheel.Type.STEEL))
                .build()
        )
        .setChasis(
            chasisBuilder
                .setChasisType(Chasis.Type.HATCHBACK)
                .setSeatFactory(Seat.Factory(Seat.Uphosltery.CLOTH))
                .build()
        ).build()

    val sedan = vehicleBuilder
        .setEngine(
            engineBuilder
                .setType(Engine.Type.FLEX)
                .setTransmission(Transmission(Transmission.Type.FWD))
                .build()
        )
        .setWheelBase(
            wheelBaseBuilder
                .setSize(WheelBase.Size.MEDIUM)
                .setWheelFactory(Wheel.Factory(Wheel.Type.ALLOY))
                .build()
        )
        .setChasis(
            chasisBuilder
                .setChasisType(Chasis.Type.SEDAN)
                .setSeatFactory(Seat.Factory(Seat.Uphosltery.LEATHER))
                .build()
        ).build()

    val suv = vehicleBuilder
        .setEngine(
            engineBuilder
                .setType(Engine.Type.DIESEL)
                .setTransmission(Transmission(Transmission.Type.AWD))
                .build()
        )
        .setWheelBase(
            wheelBaseBuilder
                .setSize(WheelBase.Size.BIG)
                .setWheelFactory(Wheel.Factory(Wheel.Type.CARBONFIBER))
                .setSpareWheel(true)
                .build()
        )
        .setChasis(
            chasisBuilder
                .setChasisType(Chasis.Type.SUV)
                .setSeatFactory(Seat.Factory(Seat.Uphosltery.REXINE))
                .build()
        ).build()

    val eletricHatch = vehicleBuilder
        .setEngine(
            engineBuilder
                .setType(Engine.Type.ELETRIC)
                .setTransmission(Transmission(Transmission.Type.AWD))
                .build()
        )
        .setWheelBase(
            wheelBaseBuilder
                .setSize(WheelBase.Size.SMALL)
                .setWheelFactory(Wheel.Factory(Wheel.Type.ALLOY))
                .build()
        )
        .setChasis(
            chasisBuilder
                .setChasisType(Chasis.Type.HATCHBACK)
                .setSeatFactory(Seat.Factory(Seat.Uphosltery.LEATHER))
                .build()
        ).build()

    val pickup = vehicleBuilder
        .setEngine(
            engineBuilder
                .setType(Engine.Type.DIESEL)
                .setTransmission(Transmission(Transmission.Type.AWD))
                .build()
        )
        .setWheelBase(
            wheelBaseBuilder
                .setSize(WheelBase.Size.BIG)
                .setWheelFactory(Wheel.Factory(Wheel.Type.CARBONFIBER))
                .setSpareWheel(true)
                .build()
        )
        .setChasis(
            chasisBuilder
                .setChasisType(Chasis.Type.PICKUP)
                .setSeatFactory(Seat.Factory(Seat.Uphosltery.LEATHER))
                .build()
        ).build()



    println("Preço do hatchback: ${hatch.price}")
    println("Preço do sedan: ${sedan.price}")
    println("Preço do SUV: ${suv.price}")
    println("Preço do hatchback elétrico: ${eletricHatch.price}")
    println("Preço da Pickup: ${pickup.price}")

}