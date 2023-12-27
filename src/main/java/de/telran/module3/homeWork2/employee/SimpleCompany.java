

import de.telran.module3.homeWork2.employee.Employee;
import de.telran.module3.homeWork2.employee.EmployeeGenerator;

import java.util.List;
import java.util.Optional;


public static void main(String[] args) {
    List<Employee> employees = EmployeeGenerator.generateEmployees(20);

    System.out.println("------------- Вычисление средней зарплаты -------------------");
    double averageSalary = EmployeeGenerator.calculateAverageSalary(employees);
    System.out.println("Средняя зарплата: " + averageSalary);

    System.out.println("------- Получение списка сотрудников с зарплатой больше 1000 -------");
    double threshold = 1000;
    List<Employee> highSalaryEmployees = EmployeeGenerator.getEmployeesWithSalaryMoreThousand(employees, threshold);
    System.out.println("Сотрудники с зарплатой больше " + threshold + ":");
    highSalaryEmployees.forEach(employee ->
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + ": " + employee.getSalary()));

    System.out.println("-------- Сотрудники маркетинга ----------");
    EmployeeGenerator.increaseMarketingSalaries(employees);
    employees.stream()
            .filter(employee -> "Marketing".equals(employee.getDepartment()))
            .forEach(employee ->
                    System.out.println(employee.getLastName() + " " + employee.getFirstName() + ": " + employee.getSalary()));

    System.out.println("------------- Зарплаты после увеличения: ----------");
    employees.forEach(employee ->
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + ": " + employee.getSalary()));

    System.out.println("------------- Сотрудник с минимальной зарплатой: ----------");
    Optional<Employee> lowestSalaryEmployee = EmployeeGenerator.getEmployeeWithLowestSalary(employees);
    if (lowestSalaryEmployee.isPresent()) {
        Employee employee = lowestSalaryEmployee.get();
        System.out.println(employee.getLastName() + " " + employee.getFirstName() + ": " + employee.getSalary());
    } else {
        System.out.println("Нет сотрудников.");
    }

    System.out.println("------------- Сотрудник с максимальной зарплатой: ----------");
    Optional<Employee> highestSalaryEmployee = EmployeeGenerator.getEmployeeWithHighestSalary(employees);
    if (highestSalaryEmployee.isPresent()) {
        Employee employee = highestSalaryEmployee.get();
        System.out.println(employee.getLastName() + " " + employee.getFirstName() + ": " + employee.getSalary());
    } else {
        System.out.println("Нет сотрудников.");
    }
}


