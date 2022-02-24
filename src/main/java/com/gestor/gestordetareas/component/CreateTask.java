package com.gestor.gestordetareas.component;

import com.gestor.gestordetareas.entity.Task;
import com.gestor.gestordetareas.service.TaskService;
import org.springframework.stereotype.Component;

@Component
public class CreateTask {
    private TaskService taskService;

    public CreateTask(TaskService taskService) {
        this.taskService = taskService;
    }

    public Task save(Task newTask) {
        return taskService.save(newTask);
    }
}
