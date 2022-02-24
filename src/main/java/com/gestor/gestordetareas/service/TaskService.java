package com.gestor.gestordetareas.service;

import com.gestor.gestordetareas.entity.Task;
import com.gestor.gestordetareas.repository.TaskRepository;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    //private final Log logger = LogFactory.getLog(TaskService.class);
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public  List<Task> getAllTask(){
       return taskRepository.findAll();
    }

    public Task save(Task newTask) {
        return taskRepository.save(newTask);
    }


    public void delete(int id) {
        taskRepository.delete(new Task(id));
    }

    public Task update(Task newtask, int id) {
        return taskRepository.findById(id).map(
                task -> {
                    task.setDescription(newtask.getDescription());
                    task.setStatus(newtask.getStatus());
                    return taskRepository.save(task);
                }

        ).get();
    }
}
