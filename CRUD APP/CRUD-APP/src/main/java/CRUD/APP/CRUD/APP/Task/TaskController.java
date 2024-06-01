package CRUD.APP.CRUD.APP.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Task")
public class TaskController {
    @Autowired
    TaskService taskService;
    @PostMapping("/Create")
    public String addNewTask(Task task) {
        taskService.addNewTask(task);
        return "redirect:/Task/all";
    }

    @GetMapping("/{taskId}")
    public String getTaskById(@PathVariable int taskId, Model model) {
        model.addAttribute("task", taskService.getTaskById(taskId));
        return "task-detail";
    }
    @PostMapping("/update")
    public String updateTask(Task task) {
        taskService.addNewTask(task);
        return "redirect:/task/" + task.getTaskId();
    }

    @GetMapping("/delete")
    public String deleteTask(@PathVariable int taskId) {
        taskService.deleteTaskById(taskId);
        return "redirect:/Task/all";
    }

}
