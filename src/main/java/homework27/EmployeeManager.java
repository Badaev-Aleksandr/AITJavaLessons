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
                    System.out.println(employee.toString() + "ERROR!!! This employee is already registered!!!");
                    check = true;
                }
            }
        }if (!check){
            employees.add(employee);
            System.out.println("Employee: " + employee.getName() + " ID: " + employee.getEmployeeId() + " was added");
        }
    }
        // обновляет данные сотрудника
        public void updateEmployee ( int employeeId, String name, String department,double salary){
            Employee employee = new Employee(employeeId, name, department, salary);
            addEmployee(employee);
        }

        // удаляет сотрудника по ID.
        public void removeEmployee ( int employeeId) {
            if (employees.isEmpty()) {
                System.out.println("No registered employees");
            } else {
                System.out.println("Deleting an employee by ID");
                for (Employee employee : employees) {
                    if (employee.getEmployeeId() == employeeId) {
                        employees.remove(employee);
                        System.out.println("Employee " + employee.getName() + " was removed!");
                        break;
                    }
                }
            }
        }

        // возвращает сотрудника по его ID.
        public void findEmployeeById ( int employeeId){
            System.out.println("Search for an employee by ID");
            Iterator<Employee> iterator = employees.iterator();
            while (iterator.hasNext()) {
                Employee employee = iterator.next();
                if (employee.getEmployeeId() == employeeId) {
                    employee.displayInfo();
                }
            }
        }

        // выводит информацию о всех сотрудниках
        public void displayAllEmployees () {
            for (Employee employee : employees) {
                employee.displayInfo();
            }
        }
    }