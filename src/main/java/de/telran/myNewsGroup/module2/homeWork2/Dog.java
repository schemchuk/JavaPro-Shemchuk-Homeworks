package de.telran.myNewsGroup.module2.homeWork2;

import java.util.Iterator;
import java.util.LinkedList;

public class Dog {
    private String name;
    private int age;

    public  Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void removeDogByAde(LinkedList<Dog> dogs, int age){
        Iterator<Dog> iterator = dogs.iterator();
        while (iterator.hasNext()){
            Dog dog = iterator.next();
            if (dog.getAge() == age){
                iterator.remove();
            }
        }
    }

}
