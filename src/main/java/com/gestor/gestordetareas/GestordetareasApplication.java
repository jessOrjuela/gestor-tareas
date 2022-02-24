package com.gestor.gestordetareas;

import com.gestor.gestordetareas.entity.Task;
import com.gestor.gestordetareas.repository.TaskRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class GestordetareasApplication implements CommandLineRunner {
	private final Log logger = LogFactory.getLog(this.getClass());

	private TaskRepository taskRepository;

	public GestordetareasApplication(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public static void main(String[] args) {

		SpringApplication.run(GestordetareasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		saveTaskInBD();
	}
	private void saveTaskInBD(){
		Task tarea1 = new Task("esta es una descripcion 1","OK");
		Task tarea2 = new Task("esta es una descripcion 2","PAUSE");
		Task tarea3 = new Task("esta es una descripcion 3","OK");
		Task tarea4 = new Task("esta es una descripcion 4","OK");
		//List<Task> list = new ArrayList<>();
		List<Task> list= Arrays.asList(tarea1,tarea2,tarea3,tarea4);
		list.stream().forEach(taskRepository::save);
	}
}
