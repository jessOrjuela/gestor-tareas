package com.gestor.gestordetareas.controller;

import com.gestor.gestordetareas.component.CreateTask;
import com.gestor.gestordetareas.component.DeleteTask;
import com.gestor.gestordetareas.component.GetTask;
import com.gestor.gestordetareas.component.UpdateTask;
import com.gestor.gestordetareas.entity.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Especifica la creacion de un servicio REST
@RequestMapping("/task")
public class TaskController {

    private GetTask getTask;
    private CreateTask createTask;
    private DeleteTask deleteTask;
    private UpdateTask updateTask;

    public TaskController(GetTask getTask, CreateTask createTask,
                          DeleteTask deleteTask, UpdateTask updateTask){
        this.getTask = getTask;
        this.createTask = createTask;
        this.deleteTask = deleteTask;
        this.updateTask = updateTask;
    }
    // Metodo GET
    @GetMapping("/")
    List<Task> get(){
        return getTask.getAll();
    }

    //Metodo POST
    @PostMapping("/")
    ResponseEntity<Task> newTask(@RequestBody Task newTask){
        return new ResponseEntity<>(createTask.save(newTask), HttpStatus.CREATED);
    }
    //Metodo DELETE
    @DeleteMapping("/{id}")
    ResponseEntity<Task>  deleteTask(@PathVariable int id){
        deleteTask.remove(id);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);

    }
    //Metodo PUT
    @PutMapping("/{id}")
    ResponseEntity<Task> updateTask(@RequestBody Task task, @PathVariable int id){

        return new ResponseEntity<>(updateTask.update(task,id),HttpStatus.ACCEPTED);
    }


}
