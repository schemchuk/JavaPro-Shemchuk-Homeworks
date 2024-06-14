package de.telran.myNewsGroup.module7.homeWork1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class UseReflection {

    /*
    . Создать список ArrayList. Наполнить данными.
    Через рефлексию вывести информацию о размере внутреннего массива,
     увеличить размер внутреннего массива вызовом приватного метода grow().
     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(5);
        names.add("Opanas");
        names.add("Havrusha");
        names.add("Hrysha");
        names.add("Mysha");
        names.add("Omelyan");

        Class<?> myClass = names.getClass();

        try {
            Field elementsField = myClass.getDeclaredField("elementData");
            elementsField.setAccessible(true);

            Object[] elementData = (Object[]) elementsField.get(names);
            System.out.println("Размер внутреннего массива до увеличения: " + elementData.length);

            Method growMethod = myClass.getDeclaredMethod("grow", int.class);
            growMethod.setAccessible(true);
            growMethod.invoke(names, 10);

            elementData = (Object[]) elementsField.get(names);
            System.out.println("Размер внутреннего массива после увеличения: " + elementData.length);
        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
