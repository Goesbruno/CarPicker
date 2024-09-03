package com.goesbruno.carpicker.vehicle.parts

class Chasis private constructor (
    private val type: Type,
    private val seats: List<Seat>
) : Part {


    override val selfPrice: Int
        get() = when(type){
            Type.HATCHBACK -> 10000
            Type.SEDAN -> 20000
            Type.SUV -> 20000
            Type.PICKUP -> 90000
        }
    override val totalCost: Int
        get() = selfPrice + seats.sumOf { it.totalCost }

    enum class Type {HATCHBACK, SEDAN, SUV, PICKUP}

    class Builder {
        private lateinit var chasisType: Type
        private var seatFactory: Seat.Factory = Seat.Factory(Seat.Uphosltery.CLOTH)

        fun setChasisType(chasisType: Type): Builder {
            this.chasisType = chasisType
            return this
        }

        fun setSeatFactory(seatFactory: Seat.Factory): Builder {
            this.seatFactory = seatFactory
            return this
        }

        fun build(): Chasis{
            val numSeats = when(chasisType){
                Type.HATCHBACK -> 4
                Type.SEDAN -> 5
                Type.SUV -> 7
                Type.PICKUP -> 5
            }
            return  Chasis(
                chasisType,
                seatFactory.createSeats(numSeats)
            )
        }
    }
}