package it.euris.academy2023.weather;

import java.util.HashMap;
import java.util.Map;

public class StatResult {
    private Map<String, Float> statResultsMap = new HashMap<>();

    public StatResult() {
    }

    public Map<String, Float> getStatResultsMap() {
        return statResultsMap;
    }

    public void setStatResultsMap(Map<String, Float> statResultsMap) {
        this.statResultsMap = statResultsMap;
    }

    @Override
    public String toString() {
        String s = "";
        for (String key : statResultsMap.keySet()) {
            s = s + key + " : " + statResultsMap.get(key) + "\n";
        }
        return s;
    }
}
