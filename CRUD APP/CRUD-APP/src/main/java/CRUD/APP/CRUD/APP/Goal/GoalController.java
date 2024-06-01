package CRUD.APP.CRUD.APP.Goal;



import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Goal")
public class GoalController {
    @Autowired
    GoalService goalService;
    @PostMapping("/create")
    public String addNewGoal(Goal goal) {
        goalService.addNewGoal(goal);
        return "redirect:/Goal/all";
    }
    @GetMapping("/{goalId}")
    public String getGoalById(@PathVariable int goalId, Model model) {
        model.addAttribute("goal", goalService.getGoalById(goalId));
        return "goal-detail";
    }
    @PostMapping("/update")
    public String updateGoal(Goal goal) {
        goalService.addNewGoal(goal);
        return "redirect:/Goal/" + goal.getGoalId();
    }

    @GetMapping(" /delete")
    public String deleteGoal(@PathVariable int goalId) {
        goalService.deleteGoalById(goalId);
        return "redirect:/Goal/all";

        }

    }

