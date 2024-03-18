package de.telran.javaPro.lections.lesson_24_03_18.emploers;

import java.util.List;

public class EmployeeUtils {
    // Метод для получения первой буквы имени
    public static char getFirstLetterByName(Employee employee) {
        String name = employee.getName();
        if (name != null && !name.isEmpty()) {
            return name.charAt(0);
        }
        return '\0';
    }

    // Метод для получения последней буквы имени
    public static char getLastLetterByName(Employee employee) {
        String name = employee.getName();
        if (name != null && !name.isEmpty()) {
            return name.charAt(name.length() - 1);
        }
        return '\0';
    }

    // Метод для получения первого сотрудника по имени
    public static Employee getFirstByName(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return null;
        }

        Employee firstEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getName().compareTo(firstEmployee.getName()) < 0) {
                firstEmployee = employee;
            }
        }
        return firstEmployee;
    }

    // Метод для получения последнего сотрудника по имени
    public static Employee getLastByName(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return null;
        }

        Employee lastEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getName().compareTo(lastEmployee.getName()) > 0) {
                lastEmployee = employee;
            }
        }
        return lastEmployee;
    }
}
