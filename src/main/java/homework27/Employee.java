package homework27;

import java.util.Objects;

/*
1.Класс Employee:

Атрибуты:
employeeId (int) — уникальный идентификатор сотрудника.
name (String) — имя сотрудника.
department (String) — отдел, в котором работает сотрудник.
salary (double) — заработная плата сотрудника.
Методы:
Конструктор для инициализации всех атрибутов.
Геттеры и сеттеры для всех атрибутов, при этом сеттер для employeeId должен предотвращать изменение ID
после его первоначальной установки.
Метод displayInfo(), который выводит информацию о сотруднике.


2. Класс EmployeeManager:

Атрибуты:
employees (List) — список всех сотрудников.
Методы:
addEmployee(Employee employee) — добавляет нового сотрудника в систему, при этом проверяет, что сотрудник с таким ID
ещё не зарегистрирован.
updateEmployee(int employeeId, String name, String department, double salary) — обновляет данные сотрудника.
removeEmployee(int employeeId) — удаляет сотрудника по ID.
findEmployeeById(int employeeId) — возвращает сотрудника по его ID.
displayAllEmployees() — выводит информацию о всех сотрудниках.
Задачи
Разработка:

Реализуйте класс Employee с необходимыми полями, методами и инкапсуляцией.
Создайте класс EmployeeManager, который будет управлять списком сотрудников с использованием коллекций.
Рефакторинг и инкапсуляция:

Убедитесь, что все аспекты управления данными сотрудников защищены и инкапсулированы.
Проверьте, что классы корректно обрабатывают ошибочные сценарии, такие как попытка добавления сотрудника с
уже существующим ID.
Тестирование:

Напишите несколько тестовых случаев, используя JUnit или другую библиотеку для тестирования в Java, чтобы проверить
функциональность вашей системы.
 */
public class Employee {
    private int employeeId; //уникальный идентификатор сотрудника
    private String name;
    private String department;
    private double salary;

    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public final void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[Name: " + name + "] [EmployeeId: " + employeeId + "] [Department: " + department + "] " +
                "[Salary: " + salary + "$]";
    }

    void displayInfo() {
        System.out.println("[Name: " + name + "] [EmployeeId: " + employeeId + "] [Department: " + department + "] " +
                "[Salary: " + salary + "$]");
    }
}
