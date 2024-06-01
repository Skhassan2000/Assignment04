package CRUD.APP.CRUD.APP.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public Object getAllTask() {
        return taskRepository.findAll();
    }

    public Task getTaskById(int taskId) {
        return taskRepository.findById(taskId).orElse(null);
    }

    public void deleteTaskById(int taskId) {
        taskRepository.deleteById(taskId);
    }

    public void addNewTask(Task task) {
        taskRepository.save(task);
    }
}
