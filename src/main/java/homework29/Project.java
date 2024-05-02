package homework29;

import java.util.HashSet;

/*
Проект:

Атрибуты: идентификатор, название, список задач, список сотрудников.
Методы: добавление задачи, добавление сотрудника, удаление задачи,
удаление сотрудника, вывод общей информации о проекте.
 */
public class Project {
    private Identifier id;
    private String projectName;
    private HashSet<Task> tasks = new HashSet<>();
    private HashSet<Employee> employees = new HashSet<>();

    public Project(Identifier id, String projectName) {
        this.id = id;
        this.projectName = projectName;
    }
    public void addTask(Task task){
        tasks.add(task);
        System.out.println("the task was added");
    }
    public void removedTask(Task task){
        boolean checkResult = tasks.remove(task);
        if (checkResult){
            System.out.println("The task was removed from the list");
        }else {
            System.out.println("The Task was not found");
        }
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
        System.out.println("Employee was added in the list");
    }
    public void removedEmployee(Employee employee){
        boolean checkResult = employees.remove(employee);
        if (checkResult){
            System.out.println("Employee was removed from the list");
        }else {
            System.out.println("Employee was not found!!!");
        }
    }
    public void displayProjectInfo(){
        System.out.println("Project info");
        System.out.println("Project name: " + getProjectName() + " Project ID: " + getId());
        for (Task task: tasks){
            System.out.println("Description: " + task.getDescription() + " Status: " + task.getStatus() +
                    " Deadline: " + task.getDeadline());
        }
        for (Employee employee: employees){
            System.out.println("Name: " + employee.getName() + " ID: " + employee.getId() + " Position: " +
                    employee.getPosition());
        }
    }

    public Identifier getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
