package com.gestor.gestordetareas.component;

import com.gestor.gestordetareas.entity.Task;
import com.gestor.gestordetareas.service.TaskService;
import org.springframework.stereotype.Component;

@Component
public class UpdateTask {

    private TaskService taskService;

    public UpdateTask(TaskService taskService) {
        this.taskService = taskService;
    }

    public Task update(Task task, int id) {
        return taskService.update(task, id);
    }
}
