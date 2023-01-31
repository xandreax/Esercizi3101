package it.euris.academy2023.workout;

import it.euris.academy2023.utils.Utils;

public class WorkoutRunner {

    public static void main(String[] args) {

        WorkoutManager manager = new WorkoutManager();
        //manager.load("workouts.csv");
        manager.load(() -> Utils.readCsv("workouts.csv"));
        manager.printLogs();
        manager.printStats();
    }
}
