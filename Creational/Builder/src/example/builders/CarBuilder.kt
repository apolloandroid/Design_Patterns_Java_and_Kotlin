package example.builders

import example.cars.Car
import example.cars.Type
import example.components.Engine
import example.components.GPSNavigator
import example.components.Transmission
import example.components.TripComputer

class CarBuilder : Builder {
    private var type: Type? = null
    private var seats = 0
    private var engine: Engine? = null
    private var transmission: Transmission? = null
    private var tripComputer: TripComputer? = null
    private var gpsNavigator: GPSNavigator? = null
    override fun setType(type: Type?) {
        this.type = type
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: Engine?) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission?) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: TripComputer?) {
        this.tripComputer = tripComputer
    }

    override fun setGPSNavigator(gpsNavigator: GPSNavigator?) {
        this.gpsNavigator = gpsNavigator
    }

    val result: Car
        get() = Car(type, seats, engine, transmission, tripComputer, gpsNavigator)
}