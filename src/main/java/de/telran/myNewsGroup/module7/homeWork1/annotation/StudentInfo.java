package de.telran.myNewsGroup.module7.homeWork1.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentInfo {

     String name();
     String surname();
     int age() default 16;
}
