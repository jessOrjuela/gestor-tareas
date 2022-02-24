package com.gestor.gestordetareas.component;

import com.gestor.gestordetareas.entity.Task;
import com.gestor.gestordetareas.service.TaskService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetTask {
    private TaskService taskService;

    public GetTask(TaskService taskService) {
        this.taskService = taskService;
    }

    public List<Task> getAll() {
        return taskService.getAllTask();
    }
}
