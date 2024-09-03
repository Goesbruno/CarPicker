package com.goesbruno.carpicker.vehicle.parts

class Seat private constructor(
    val uphosltery: Uphosltery
): Part {
    override val selfPrice: Int
        get() = when(uphosltery){
            Uphosltery.CLOTH -> 500
            Uphosltery.REXINE -> 1000
            Uphosltery.LEATHER -> 2000
        }
    override val totalCost: Int = selfPrice

    enum class Uphosltery {CLOTH, REXINE, LEATHER}

    class Factory (val uphosltery: Uphosltery){
        fun createSeats(numSeats: Int): List<Seat> {
            return generateSequence { Seat(uphosltery) }.take(numSeats).toList()
        }
    }

}