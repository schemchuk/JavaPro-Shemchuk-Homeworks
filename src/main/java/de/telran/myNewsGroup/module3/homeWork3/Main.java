package de.telran.myNewsGroup.module3.homeWork3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * . Создать три функции:
 * f1 - умножает Integer на 10
 * f2 - преобразует Integer в String в формате "<<123>>"
 * f3 - считает число символов в String
 * Составить композитную функцию так, чтобы:
 * a) функции выполнялись последовательно друг за другом f1 -> f2 -> f3
 * Input:
 * 777
 * Output:
 * 8
 * b) в порядке f3 -> f1 -> f2
 * Input:
 * "Hello!"
 * Output:
 * "<<60>>"
 */
public class Main {
    public static void main(String[] args) {

        Function<Integer,Integer> f1 = s -> s * 10;
        Function<Integer, String> f2 = s -> "<<" + s + ">>";
        Function<String,Integer> f3 = s -> s.length();

        Function<Integer,Integer> compositeVariantA  = f1.andThen(f2).andThen(f3);
        int inputA = 123;
        int outputA = compositeVariantA.apply(inputA);
        System.out.println( "Output: " + outputA);

        Function<String, String> compositeVariantB = f2.compose(f1).compose(f3);
        String inputB = "Hello!";
       String outputB = compositeVariantB.apply(inputB);
        System.out.println(outputB);

        System.out.println("------reduce-----------");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Integer sum = reduce(list, Integer::sum, 0);

        System.out.println("Sum is: " + sum);

        Integer productOfNumbers = reduce(list,(a,b) -> a * b, 1);
        System.out.println("Product is: " + productOfNumbers);
    }

    /**
     *Написать метод reduce(), который на вход принимает список чисел, оператор двух аргументов и начальное значение. Метод накапливает результат применения оператора по всем данных, начиная с начального значения.
     * public static Integer reduce(List list, BinaryOperator operator, Integer basicValue)
     * Например, вызов reduce(list, Integer::sum, 0)) должен вернуть сумму всех чисел
     * reduce(list, (i, j) -> i * j, 1) должен вернуть произведение всех чисел
     */
    public static Integer reduce(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue){
        Integer result = basicValue;
        for (Integer number : list){
            result = (Integer) operator.apply(result,number);
        }

        return result;

    }
}

