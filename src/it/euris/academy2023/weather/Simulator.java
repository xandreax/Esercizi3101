package it.euris.academy2023.weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulator {
    List<WeatherRecord> records;
    Map<String, List<Float>> recordsMap;

    public Simulator() {
        this.records = new ArrayList<>();
        this.recordsMap = new HashMap<>();
    }

    public Simulator(List<String> recordsString) {
        this();
        this.records = convert(recordsString);
    }

    public Simulator(DataLoader loader) {
        this();
        this.records = convert(loader.load());
    }

    private List<WeatherRecord> convert(List<String> recordsString) {
        List<WeatherRecord> records = new ArrayList<>();
        for (String line: recordsString) {
            records.add(parseLine(line));
        }
        return records;
    }

    private WeatherRecord parseLine(String line) {
        String[] tokens = line.trim().split(";");
        return new WeatherRecord(tokens[0], tokens[1], Float.parseFloat(tokens[2]), Float.parseFloat(tokens[3]));
    }

    public void simulate(Calculator calculator) {
        mapValues();
        Map<String, StatResult> results = calculate(calculator);
        printResults(results);
    }

    private Map<String, StatResult> calculate(Calculator calculator) {
        Map<String, StatResult> results = new HashMap<>();
        for(String key : recordsMap.keySet()){
            results.putIfAbsent(key, calculator.calculate(recordsMap.get(key)));
        }
        return results;
    }

    private void printResults(Map<String, StatResult> results) {
        for (String key: results.keySet()) {
            System.out.println(key+"\n"+ results.get(key));
        }
    }

    // popolare recordsMap
    private void mapValues() {
        for (WeatherRecord record : records) {
            mapValue(record, "-T_MIN", record.getMinTemp());
            mapValue(record, "-T_MAX", record.getMaxTemp());
        }
    }

    private void mapValue(WeatherRecord record, String x, float value) {
        String keyMin = record.getLocation() + x;
        recordsMap.putIfAbsent(keyMin, new ArrayList<>());
        recordsMap.get(keyMin).add(value);
    }
}
