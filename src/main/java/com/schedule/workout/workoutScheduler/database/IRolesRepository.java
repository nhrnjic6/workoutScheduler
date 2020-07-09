package com.schedule.workout.workoutScheduler.database;

import com.schedule.workout.workoutScheduler.database.model.RoleDB;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRolesRepository extends CrudRepository<RoleDB,String> {
    List<RoleDB> findAll();
    List<RoleDB> findByName(String name);
}
