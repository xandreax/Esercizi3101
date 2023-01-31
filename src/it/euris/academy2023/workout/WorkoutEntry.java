package it.euris.academy2023.workout;

import java.util.Date;

public class WorkoutEntry {
    private Date date;
    private String exercise;
    private int repetitions;
    private int weight;

    public WorkoutEntry(Date date, String exercise, int repetitions, int weight) {
        this.date = date;
        this.exercise = exercise;
        this.repetitions = repetitions;
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WorkoutEntry{" +
                "date=" + date +
                ", exercise='" + exercise + '\'' +
                ", repetitions=" + repetitions +
                ", weight=" + weight +
                '}';
    }
}
