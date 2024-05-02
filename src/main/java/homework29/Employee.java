package homework29;

import java.util.HashSet;

/*
Сотрудник:

Атрибуты: идентификатор, имя, должность, список задач.
Методы: добавление задачи, удаление задачи, вывод информации о сотруднике.
 */
public class Employee {
    private Identifier id;
    private String name;
    private String position;
    private HashSet<Task> taskLists = new HashSet<>();

    public Employee(Identifier id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;

    }

    public void addTaskToList(Task task) {
        taskLists.add(task);
        System.out.println("The task was added in the list");
    }

    public void removeTaskFromList(Task task) {
       boolean checkResult = taskLists.remove(task);
       if (checkResult) {
           System.out.println("The task was removed from the list");
       }else {
           System.out.println("The Task was not found");
       }
    }

    @Override
    public String toString() {
        return "Employee: " + "ID: " + id + ", Name '" + name + "' position: '" + position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public Identifier getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}
