package de.telran.module4.homeWork1.util;

public class UtilClass<T extends Number, U extends Number> {

    public T add(T num1, U num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            // Если оба числа Integer, возвращаем Integer
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double || num2 instanceof Double) {
            // Если хотя бы одно из чисел Double, возвращаем Double
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }

    public T sub(T num1, U num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            // Если оба числа Integer, возвращаем Integer
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double || num2 instanceof Double) {
            // Если хотя бы одно из чисел Double, возвращаем Double
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }

    public T mult(T num1, U num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            // Если оба числа Integer, возвращаем Integer
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double || num2 instanceof Double) {
            // Если хотя бы одно из чисел Double, возвращаем Double
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }

    public T div(T num1, U num2) {
        if (num2.doubleValue() == 0.0) {
            // Обработка деления на ноль
            throw new ArithmeticException("Division by zero");

        }
        if (num1 instanceof Integer && num2 instanceof Integer) {
            // Если оба числа Integer, возвращаем Double
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else if (num1 instanceof Double || num2 instanceof Double) {
            // Если хотя бы одно из чисел Double, возвращаем Double
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }

    public T sqr(T num1) {
        if (num1 instanceof Integer ) {
            // Если число Integer, возвращаем Integer
            return (T) Integer.valueOf(num1.intValue() * num1.intValue());
        } else if (num1 instanceof Double ) {
            // Если число Double, возвращаем Double
            return (T) Double.valueOf(num1.doubleValue() * num1.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }
}
