package it.euris.academy2023.workout;

import it.euris.academy2023.utils.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class WorkoutManager {

    private List<WorkoutEntry> workoutRepository;

    public WorkoutManager() {
        this.workoutRepository = new ArrayList<>();
    }

    public void load(String csv) {
        List<String> workoutLines = Utils.readCsv(csv);
        workoutRepository = convert(workoutLines);
    }

    public void load(DataLoader loader) {
        workoutRepository = convert(loader.load());
    }

    public void printLogs() {
        for (WorkoutEntry workout : workoutRepository) {
            System.out.println(workout);
        }
    }

    public void printStats() {
        Map<String, List<Integer>> maxWeightMap = mapValues();
        for (String key : maxWeightMap.keySet()) {
            System.out.println(key + ": " + Collections.max(maxWeightMap.get(key)));
        }
    }

    private Map<String, List<Integer>> mapValues() {
        Map<String, List<Integer>> maxWeightMap = new HashMap<>();
        for (WorkoutEntry workout : workoutRepository) {
            String key = workout.getExercise();
            maxWeightMap.putIfAbsent(key, new ArrayList<>());
            maxWeightMap.get(key).add(workout.getWeight());
        }
        return maxWeightMap;
    }

    private List<WorkoutEntry> convert(List<String> workoutLines) {
        List<WorkoutEntry> workouts = new ArrayList<>();
        for (String line : workoutLines) {
            workouts.add(mapWorkoutEntry(line));
        }
        return workouts;
    }

    private WorkoutEntry mapWorkoutEntry(String line) {
        String[] tokens = line.trim().split(";");
        return new WorkoutEntry(parseDate(tokens[0]), tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
    }

    private Date parseDate(String token) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            return sdf.parse(token);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
