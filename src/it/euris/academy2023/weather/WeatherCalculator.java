package it.euris.academy2023.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherCalculator implements Calculator {
    @Override
    public StatResult calculate(List<Float> values) {
        StatResult results = new StatResult();
        float avgResult = avg(values);
        results.getStatResultsMap().putIfAbsent("AVG", avgResult);
        results.getStatResultsMap().putIfAbsent("DEVIAZIONE STANDARD", devStandard(values, avgResult));
        return results;
    }

    private float avg(List<Float> values) {
        if (values.isEmpty())
            return 0;
        float sum = 0;
        for (Float value : values) {
            sum = sum + value;
        }
        return sum / values.size();
    }

    private List<Float> mode(List<Float> values) {
        List<Float> result = new ArrayList<>();


        return result;
    }

    private List<Float> median(List<Float> values) {
        List<Float> result = new ArrayList<>();


        return result;
    }

    private float devStandard(List<Float> values, float avg) {
        if (values.isEmpty())
            return 0;
        float devStandard = 0;
        for (Float value : values) {
            devStandard += Math.pow(value - avg, 2);
        }
        return (float) Math.sqrt(devStandard);
    }
}
