package de.telran.myNewsGroup.module7.homeWork1.annotation;

import lombok.Data;

@Data
public class Student {
    /*
    Имеется класс Student с полями name, surname, age.
     Создать аннотацию @StudentInfo и соответствующий инжектор через рефлексию,
чтобы с их помощью иметь возможность инициализировать переменные типа Student. Например:


public class School {
    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    private Student student1;
    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Student student2;
}
     */

    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
