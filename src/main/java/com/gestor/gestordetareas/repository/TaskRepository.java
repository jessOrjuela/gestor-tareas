package com.gestor.gestordetareas.repository;

import com.gestor.gestordetareas.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query("select u from task u  where u.description")
    Optional<Task> encontraralgo(String description);
}
