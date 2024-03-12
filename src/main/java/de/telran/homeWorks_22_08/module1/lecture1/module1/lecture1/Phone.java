package de.telran.homeWorks_22_08.module1.lecture1.module1.lecture1;
//    .Класс Phone.
//    Создайте класс Phone, который содержит переменные number, model и weight.
//    Создайте три экземпляра этого класса.
//    Выведите на консоль значения их переменных.
//    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//    Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//    Вызвать эти методы для каждого из объектов.
public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getNumber() {
        return number;
    }
}
