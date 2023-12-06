package de.telran.module2.HomeWork5.restaraunt;

import java.util.LinkedHashSet;

public class RestarauntWork {
    private LinkedHashSet<Order> orders = new LinkedHashSet<>();
    // добавление заказа
    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Додан заказ: " + order);
    }

    //обработка заказа

    public void processOrders(){
        for (Order order : orders){
            System.out.println("Ваш заказ " + order + " готов");
        }
    }
}
