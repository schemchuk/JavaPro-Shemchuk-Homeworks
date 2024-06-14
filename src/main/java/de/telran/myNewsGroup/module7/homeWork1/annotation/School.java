package de.telran.myNewsGroup.module7.homeWork1.annotation;

import java.lang.reflect.Field;

public class School {

    @StudentInfo(name = "Omelyan", surname = "Kosohlyad", age = 47)
    private Student student1;
    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    private Student student2;
    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Student student3;

    public static void main(String[] args) {
        School school = new School();
        System.out.println(school.student1);
        System.out.println(school.student2);
        System.out.println(school.student3);

        Injector.inject(school);

        System.out.println(school.student1);
        System.out.println(school.student2);
        System.out.println(school.student3);
    }
    static class Injector {
        public static void inject(Object instance) {
            Field[] fields = instance.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(StudentInfo.class)) {
                    StudentInfo annotation = field.getAnnotation(StudentInfo.class);
                    field.setAccessible(true); // should work on private fields
                    try {
                        Student student = new Student(annotation.name(), annotation.surname(), annotation.age());
                        field.set(instance, student);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
