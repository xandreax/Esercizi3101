package it.euris.academy2023.weather;

import it.euris.academy2023.utils.Utils;

public class SimulatorRunner {
    public static void main(String[] args) {

        Simulator simulator = new Simulator(() -> Utils.readCsv("weather-data.csv"));
        simulator.simulate(new WeatherCalculator());

    }
}
