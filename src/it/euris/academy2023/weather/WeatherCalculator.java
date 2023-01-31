package it.euris.academy2023.weather;

import java.util.List;

public class WeatherCalculator implements Calculator {
    @Override
    public StatResult calculate(List<Float> values) {
        StatResult results = new StatResult();
        float resultAvg = avg(values);
        results.getStatResultsMap().putIfAbsent("AVG", resultAvg);
        return results;
    }

    private float avg(List<Float> values) {
        if (values.isEmpty())
            return 0;
        float sum = 0;
        for (Float value : values) {
            sum = sum + value;
        }
        return sum/values.size();
    }
}
