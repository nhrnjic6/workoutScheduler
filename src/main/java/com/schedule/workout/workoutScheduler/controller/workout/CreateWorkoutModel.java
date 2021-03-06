package com.schedule.workout.workoutScheduler.controller.workout;

import com.schedule.workout.workoutScheduler.database.model.RoleDB;

import javax.validation.constraints.*;

public class CreateWorkoutModel {

    @NotEmpty
    @Size(min = 2, max = 20)
    private String name;
    @NotEmpty
    @Size(min = 2, max = 80)
    private String description;
    @NotNull
    private Integer duration;
    @NotNull
    @Min(value = 1)
    @Max(value = 5)
    private Integer difficulty;
    private String trainerId;



    public CreateWorkoutModel() {
    }

    public CreateWorkoutModel(String name, String description, Integer duration, Integer difficulty, String trainerId) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.difficulty = difficulty;
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }



}
