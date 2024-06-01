package CRUD.APP.CRUD.APP.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    @Query(value = "select t from task" , nativeQuery = true)
    public List<Task> getTask(String title);
}
