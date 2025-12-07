package com.richi.tareas.controller;

import com.richi.tareas.model.Task;
import com.richi.tareas.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173") // 👈 habilita CORS para tu frontend
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    // Obtener todas las tareas
    @GetMapping
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    // Crear nueva tarea
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return repository.save(task);
    }

    // Actualizar tarea existente
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        return repository.save(task);
    }

    // Eliminar tarea
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }
}