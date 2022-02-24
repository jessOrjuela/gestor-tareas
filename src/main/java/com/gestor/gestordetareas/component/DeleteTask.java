package com.gestor.gestordetareas.component;

import com.gestor.gestordetareas.entity.Task;
import com.gestor.gestordetareas.service.TaskService;
import org.springframework.stereotype.Component;

@Component
public class DeleteTask {

    private TaskService taskService;

    public DeleteTask(TaskService taskService) {
        this.taskService = taskService;
    }
    public void remove(int id){
        taskService.delete(id);
 }
}
