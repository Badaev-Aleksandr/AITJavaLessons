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
        if (!checkEmployee(employee)) {
            employees.add(employee);
            System.out.println("Employee: " + employee.getName() + " ID: " + employee.getEmployeeId() + " was added");
        } else {
            System.out.println("Employee " + employee.getName() + " ID: " + employee.getEmployeeId() + " is already registered!!!");
        }
    }

    public boolean checkEmployee(Employee employee) {
        for (Employee employeeCheck : employees) {
            if (employee.getEmployeeId() == employeeCheck.getEmployeeId()) {
                return true;
            }
        }
        return false;
    }

    // методы обновления данных сотрудника

    // проверка наличия сотрудника по ID
    public boolean checkEmployeeByID(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return true;
            }
        }
        return false;
    }

    // обновляет данные Имени сотрудника по ID
    public void updateEmployeeName(int employeeId, String name) {
        if (!checkEmployeeByID(employeeId)) {
            System.out.println("Employee with ID: [" + employeeId + "] not found!");
        } else {
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    employee.setName(name);
                    System.out.println("Employee details: " + employee.getName() + " ID: [" +
                            employee.getEmployeeId() + "] was updated!");
                }
            }
        }
    }

    // обновляет данные Должности сотрудника по ID
    public void updateEmployeeDepartment(int employeeId, String department) {
        if (!checkEmployeeByID(employeeId)) {
            System.out.println("Employee with ID: [" + employeeId + "] not found!");
        } else {
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    employee.setDepartment(department);
                    System.out.println("Employee details: " + employee.getName() + " ID: [" +
                            employee.getEmployeeId() + "] was updated!");
                }
            }
        }
    }

    // обновляет данные Зарплаты сотрудника по ID
    public void updateEmployeeSalary(int employeeId, double salary) {
        if (!checkEmployeeByID(employeeId)) {
            System.out.println("Employee with ID: [" + employeeId + "] not found!");
        } else {
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    employee.setSalary(salary);
                    System.out.println("Employee details: " + employee.getName() + " ID: [" +
                            employee.getEmployeeId() + "] was updated!");
                }
            }
        }
    }

    // удаляет сотрудника по ID.
    public void removeEmployee(int employeeId) {
        System.out.println("Deleting an employee by ID");
        boolean checkResult = employees.removeIf(employee -> employee.getEmployeeId() == employeeId);
        if (!checkResult) {
            System.out.println("Employee with ID: [" + employeeId + "] not found!");
        } else {
            System.out.println("The employee with ID: " + employeeId + " was removed from the database!");
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