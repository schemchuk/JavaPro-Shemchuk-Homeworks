package de.telran.javaPro.lections.lesson_24_03_18.emploers;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String name;
    private String surname;
    private int age;
    private int workingHoursInMonth;

    public Employee(String name, String surname, int age, int workingHoursInMonth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingHoursInMonth = workingHoursInMonth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingHoursInMonth() {
        return workingHoursInMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workingHoursInMonth='" + workingHoursInMonth + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
        } else if (result == 0) {
            result = this.age - o.age;
        } else {
            result = this.workingHoursInMonth - o.workingHoursInMonth;
        }
        return result;
    }

    public static class EmploueeAgeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee employee1, Employee employee2) {
            return Integer.compare(employee1.getAge(), employee2.getAge());

        }
    }

    public static class EmploueerSurnameNameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee employee1, Employee employee2) {
            int result = employee1.surname.compareTo(employee2.surname);
            if (employee1.surname == employee2.surname) {
                result = employee1.name.compareTo(employee2.name);

            }
            return result;
        }
    }

    public static class FirstLetterComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Character.compare(EmployeeUtils.getFirstLetterByName(e1), EmployeeUtils.getFirstLetterByName(e2));
        }
    }

    public static class LastLetterComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            //return Character.compare(o1.getLastByName(), o2.getLastByName());
            return Character.compare(EmployeeUtils.getLastLetterByName(o1), EmployeeUtils.getLastLetterByName(o2));
        }
    }

    public static class EmploueerNameReversComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee employee1, Employee employee2) {
            int result = employee2.name.compareTo(employee1.surname);

            return result;
        }
    }

    public static class EmploueerWorkingHoursMonthAndAgeRewersComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee employee1, Employee employee2) {
            int result = employee2.workingHoursInMonth - employee1.workingHoursInMonth;
            if (employee1.workingHoursInMonth == employee2.workingHoursInMonth) {
                result = employee2.age -employee1.age;

            }
            return result;
        }
    }

}



