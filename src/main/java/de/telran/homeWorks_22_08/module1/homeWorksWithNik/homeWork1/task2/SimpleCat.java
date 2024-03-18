package de.telran.homeWorks_22_08.module1.homeWorksWithNik.homeWork1.task2;

public class SimpleCat {
    public static void main(String[] args) {
       CatExempl catExempl = new CatExempl();

       catExempl.eat(150.0);
        System.out.println("Съеденное количество корма: " + catExempl.getEatenFood());
       catExempl.pee();
        System.out.println("Съеденное количество корма: " + catExempl.getEatenFood());

        catExempl.pee();
        catExempl.pee();
        System.out.println("Съеденное количество корма: " + catExempl.getEatenFood());
    }
}
// Метод, параметры, return
//Создать в классе Cat метод, который будет возвращать сумму съеденной еды текущей кошки
//Создать в классе Cat метод “сходить в туалет” pee(), который будет уменьшать вес кошки и что-нибудь печатать.
//Рекомендации: протестируйте верную работу метода возврата съеденной еды:
//создайте кошку
//покормите кошку кормом весом 150.00
//вызовите метод pee() несколько раз
//распечатайте значение съеденного корма, в консоль должно напечататься 150.00