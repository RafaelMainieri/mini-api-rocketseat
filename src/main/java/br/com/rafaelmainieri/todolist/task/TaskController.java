package br.com.rafaelmainieri.todolist.task;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PostMapping
    public TaskModel create(@RequestBody TaskModel taskModel) {
        System.out.println("Chegou no controller");
        var task = this.taskRepository.save(taskModel);
        return task;
    }
}
