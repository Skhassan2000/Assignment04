package CRUD.APP.CRUD.APP.Goal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Integer> {
    @Query(value = "select g from goal", nativeQuery = true)
    public List<Goal> getGoal(String title);
}

