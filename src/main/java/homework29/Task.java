package homework29;
/*
Задача:

Атрибуты: идентификатор, описание, статус (новая, в работе, завершена), срок выполнения.
Методы: изменение статуса, установка срока выполнения.
 */
public class Task {
    private Identifier id;
    private String description;
    private Status status;
    private String deadline;

    public Task(Identifier id, String description, Status status, String deadline) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.deadline = deadline;
    }

    public Identifier getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}
