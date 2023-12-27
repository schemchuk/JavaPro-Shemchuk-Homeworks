package de.telran.module3.homeWork2.employee;

import com.github.javafaker.Faker;

import java.util.*;


import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@AllArgsConstructor
@Getter
@Setter
public class EmployeeGenerator {
    public static List<Employee> generateEmployees(int numberOfEmployees) {
        Faker faker = new Faker();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            String lastName = faker.name().lastName();
            String firstName = faker.name().firstName();
            String middleName = faker.name().lastName();
            String position = faker.job().position();
            String department = faker.job().field();
            double salary = faker.number().randomDouble(2, 800, 2000);

            Employee employee = new Employee(lastName, firstName, middleName, position, department, salary);
            employees.add(employee);
        }

        return employees;
    }

    // Вывожу среднюю з\п
    public static double calculateAverageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    // з\п больше 1000
    public static List<Employee> getEmployeesWithSalaryMoreThousand(List<Employee> employees, double threshold) {
        return employees.stream()
                .filter(employee -> employee.getSalary() > threshold)
                .toList();
    }

    //Сотрудники маркетинга. З\п увеличить на 15%
    public static void increaseMarketingSalaries(List<Employee> employees) {
        employees.stream()
                .filter(employee -> "Marketing".equals(employee.getDepartment()))
                .map(employee -> {
                    employee.setSalary(employee.getSalary() * 1.15);
                    return employee;
                })
                .collect(toList());
    }

    // Получить сотрудника с самой низкой зп
    public static Optional<Employee> getEmployeeWithLowestSalary(List<Employee> employees) {
        return employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
    }

    // Получить сотрудника с самой высокой зп
    public static Optional<Employee> getEmployeeWithHighestSalary(List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
    }
}



