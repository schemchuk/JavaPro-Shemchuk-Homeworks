package de.telran.myNewsGroup.module2.nomework6.priorityQueue;

import java.util.PriorityQueue;

public class ShopShow {
    public static void main(String[] args) {

        /**
         * С помощью PriorityQueue реализовать модель: в магазин завозятся продукты с двух разных складов.
         * У каждого продукта есть название и срок годности (пусть для простоты исчисляется в количестве оставшихся дней).
         * В магазин приходят покупатели и выбирают продукт с наибольшим оставшемся сроком годности.
         */

        PriorityQueue<Product> shoping = new PriorityQueue<>();
        PriorityQueue<Product> shoping2 = new PriorityQueue<>();

        shoping.add(new Product("Milk",5));
        shoping.add(new Product("Bread",3));
        shoping.add(new Product("Eggs", 10));

        shoping2.add(new Product("Cheese",12));
        shoping2.add(new Product("Meat",2));
        shoping2.add(new Product("Oranges",7));

        PriorityQueue<Product> store = new PriorityQueue<>(shoping);
        store.addAll(shoping2);

        while (!store.isEmpty()){
            Product product = store.poll();

            System.out.println("Покупатель купил " + product.getName() + " (срок годности: " + product.getExplirDate() + " дней)");
        }
    }
}
