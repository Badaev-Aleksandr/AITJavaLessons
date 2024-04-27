package homework27;
/*
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
public class EmployeeManagerTest {
    public static void main(String[] args) {
        Employee employee = new Employee(6743,"Alex","Director",5674.54);
        Employee employeeDuplicate = new Employee(6743,"Alex","Director",5674.54);
        Employee employee2 = new Employee(666,"Sven","Operator",3245.44);
        Employee employee3 = new Employee(2223,"Silva","Teacher ",10547.65);
        Employee employee4 = new Employee(111,"Kite","Dancer",4745.66);
        Employee employee5 = new Employee(3343,"Bob","Director",5674.54);

        employee.displayInfo();
        System.out.println("-----------------");

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(employee);
        employeeManager.addEmployee(employeeDuplicate);
        employeeManager.addEmployee(employee2);
        employeeManager.addEmployee(employee3);
        employeeManager.addEmployee(employee4);
        employeeManager.addEmployee(employee5);
        employeeManager.addEmployee(employee5);
        System.out.println("-----------------");
        employeeManager.displayAllEmployees();
        System.out.println("-----------------");
        employeeManager.findEmployeeById(2223);
        System.out.println("-----------------");
        employeeManager.updateEmployeeName(111,"Olga");
        employeeManager.updateEmployeeDepartment(111,"Police");
        employeeManager.updateEmployeeSalary(111,99887);
        System.out.println("-----------------");
        employeeManager.findEmployeeById(111);
        System.out.println("-----------------");
        employeeManager.removeEmployee(111);





    }
}
