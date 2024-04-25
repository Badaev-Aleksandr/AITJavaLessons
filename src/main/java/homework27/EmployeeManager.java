package homework27;
/*
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
 */

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    // добавляет нового сотрудника в систему, при этом проверяет, что сотрудник с таким ID
    //ещё не зарегистрирован.
    public void addEmployee(Employee employee) {
        boolean check = false;
        if (employees.isEmpty()) {
            employees.add(employee);
            System.out.println("Employee: " + employee.getName() + " ID: " + employee.getEmployeeId() + " was added");
            check = true;
        } else {
            for (Employee employeeOne : employees) {
                if (employeeOne.getEmployeeId() == employee.getEmployeeId()) {
                    System.out.println(employee.toString() + "---> ERROR!!! This employee is already registered!!!");
                    check = true;
                }
            }
        }
        if (!check) {
            employees.add(employee);
            System.out.println("Employee: " + employee.getName() + " ID: " + employee.getEmployeeId() + " was added");
        }
    }

    // обновляет данные сотрудника
    public void updateEmployee(int employeeId, String name, String department, double salary) {
        boolean check = false;
        if (employees.isEmpty()) {
            System.out.println("No registered employees");
        } else {
            System.out.println("Updating employee data");
            Iterator<Employee> iterator = employees.iterator();
            while (iterator.hasNext()) {
                Employee employee = iterator.next();
                if (employee.getEmployeeId() == employeeId) {
                    employee.setName(name);
                    employee.setDepartment(department);
                    employee.setSalary(salary);
                    System.out.println("Employee details " + employee.getName() + " ID: [" +
                            employee.getEmployeeId() + "] updated!");
                    check = true;
                }
            }

        }if (!check){
            System.out.println("Employee with ID: [" + employeeId + "] not found!");
        }
    }

    // удаляет сотрудника по ID.
    public void removeEmployee(int employeeId) {
        boolean check = false;
        if (employees.isEmpty()) {
            System.out.println("No registered employees");
        } else {
            System.out.println("Deleting an employee by ID");
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    employees.remove(employee);
                    System.out.println("The employee " + employee.getName() + " was removed from the database!");
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Employee with ID: [" + employeeId + "] not found!");
            }
        }
    }

    // возвращает сотрудника по его ID.
    public void findEmployeeById(int employeeId) {
        boolean check = false;
        System.out.println("Search for an employee by ID");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmployeeId() == employeeId) {
                employee.displayInfo();
                check = true;
            }
        }
        if (!check) {
            System.out.println("Employee with ID: [" + employeeId + "] not found!");
        }
    }

    // выводит информацию о всех сотрудниках
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No registered employees");
        } else {
            System.out.println("Displaying all registered employees");
            for (Employee employee : employees) {
                employee.displayInfo();
            }
        }
    }
}