public class Task {
    private static int nextId = 1;  // static ID generator

    private final int id;
    private String title;
    private String description;
    private TaskStatus status;

    public Task(String title, String description) {
        this.id = nextId;
        nextId++;

        validateString("title", title);
        this.title = title;

        validateString("description", description);
        this.description = description;

        // How do you validate enums???
        this.status = TaskStatus.TO_DO;  // default
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validateString("title", title);
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        validateString("description", description);
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void changeStatus(TaskStatus newStatus) {
        // How do you validate enum
        this.status = newStatus;
    }

    public void complete() {
        this.status = TaskStatus.DONE;
    }

    @Override
    public String toString() {
        return "Task #" + id + " [" + title + "] - " + status;
    }

    private void validateString(String message, String input) {
        if(input == null || input.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }
}
