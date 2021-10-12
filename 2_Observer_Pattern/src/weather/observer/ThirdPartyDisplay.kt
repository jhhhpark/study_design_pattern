package weather.observer

import weather.model.WeatherDataInfo
import weather.subject.WeatherData
import java.util.*
import java.util.Observer

class ThirdPartyDisplay(observable: Observable) : Observer, DisplayElement {
    init { observable.addObserver(this) }

    private var weatherDataInfo: WeatherDataInfo = WeatherDataInfo()

    override fun update(obs: Observable?, arg: Any?) {
        if (obs is WeatherData) {
            val weatherData: WeatherData = obs
            this.weatherDataInfo = weatherData.weatherDataInfo
            display()
        }
    }

    override fun display() {
        val (temp, humidity, pressure) = weatherDataInfo
        println("ThirdPartyDisplay : temp: $temp, humidity: $humidity, pressure: $pressure")
    }
}