package CRUD.APP.CRUD.APP.Task;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int taskId;

    private int goalId;

    @Nonnull
    private String title;

    @Nullable
    private String details;

    private String status;

    public Task (int taskId, int goalId, String title, String details, String status){
        this.taskId = taskId;
        this.goalId = goalId;
        this.title = title;
        this.details = details;
        this.status = status;

    }
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getGoalId() {
        return goalId;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    @Nonnull
    public String getTitle() {
        return title;
    }

    @Nonnull
    public void setTitle(@Nonnull String title) {
        this.title = title;
    }

    @Nullable
    public String getDetails() {
        return details;
    }

    @Nonnull
    public void setDetails(@Nullable String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
