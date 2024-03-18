package de.telran.javaPro.lections.lesson_24_03_18.emploers;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SimpleEmploee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jonn", "Smith", 23, 40);
        Employee employee2 = new Employee("Jane", "Smith", 45, 30);
        Employee employee3 = new Employee("Inna", "Smith", 32, 20);
        Employee employee4 = new Employee("Mark", "Smith", 47, 40);
        Employee employee5 = new Employee("Jonn", "Smith", 23, 40);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);

        Employee.EmploueeAgeComparator ageComparator = new Employee.EmploueeAgeComparator();
        employees.sort(ageComparator);

        System.out.println("Сотрудники отсортированные по возрасту :");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Employee.EmploueerSurnameNameComparator surnameNameComparator = new Employee.EmploueerSurnameNameComparator();
        employees.sort(surnameNameComparator);

        System.out.println("Сотрудники отсортированные сначала по фамилии, потом по имени :");
        for (Employee empl : employees) {
            System.out.println(empl);
        }



        Collections.sort(employees);

        System.out.println("Сотрудники отсортированные  natural order by name, surname, age, workingHoursInMonth - Comparable :");
        for (Employee empl : employees) {
            System.out.println(empl);
        }

        Employee.FirstLetterComparator firstLetterComparator= new Employee.FirstLetterComparator();
        employees.sort(firstLetterComparator);

        System.out.println("Сотрудники отсортированные  по первой  букве имени :");
        for (Employee empl : employees) {
            System.out.println(empl);
        }

        Employee.LastLetterComparator lastLetterComparator = new Employee.LastLetterComparator();
        employees.sort(lastLetterComparator);

        System.out.println("Сотрудники отсортированные  по  последней букве имени :");
        for (Employee empl : employees) {
            System.out.println(empl);
        }
        /**
         * Для списка Employee написать методы getFirstByName(list), getLastByName(list),
         * которые получали бы первого и последнего по имени сотрудника.
         */

        Employee firstEmployee = EmployeeUtils.getFirstByName(employees);
        if (firstEmployee != null) {
            System.out.println("Первый сотрудник по имени: " + firstEmployee);
        } else {
            System.out.println("Список сотрудников пуст!");
        }

        Employee lastEmployee = EmployeeUtils.getLastByName(employees);
        if (lastEmployee != null) {
            System.out.println("Последний сотрудник по имени: " + lastEmployee);
        } else {
            System.out.println("Список сотрудников пуст!");
        }

        /**
         * Для списка Employee реализовать
         * а) сортировку по имени в обратном порядке z-a
         * b) сортировку по рабочим часам и возрасту в обратном порядке
         */
        Employee.EmploueerNameReversComparator reversComparator = new Employee.EmploueerNameReversComparator();
        employees.sort(reversComparator);

        System.out.println("Сотрудники отсортированные  по имени в обратном порядке :");
        for (Employee empl : employees) {
            System.out.println(empl);
        }

        Employee.EmploueerWorkingHoursMonthAndAgeRewersComparator workingHoursMonthAndAgeRewersComparator = new Employee.EmploueerWorkingHoursMonthAndAgeRewersComparator();
        employees.sort(workingHoursMonthAndAgeRewersComparator);

        System.out.println("Сотрудники отсортированные  по рабочим часам и возрасту в обратном порядке:");
        for (Employee empl : employees) {
            System.out.println(empl);
        }

    }
}
