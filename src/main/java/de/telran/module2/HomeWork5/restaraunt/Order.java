package de.telran.module2.HomeWork5.restaraunt;

public class Order {
    private String menu;
    private int ordersNum;

    public String getMenu() {
        return menu;
    }

    public int getOrdersNum() {
        return ordersNum;
    }

    public Order(String menu, int ordersNum) {
        this.menu = menu;
        this.ordersNum = ordersNum;
    }

    @Override
    public String toString() {
        return  menu + '\'' +
                " номер: " + ordersNum +
                '}';
    }
}
