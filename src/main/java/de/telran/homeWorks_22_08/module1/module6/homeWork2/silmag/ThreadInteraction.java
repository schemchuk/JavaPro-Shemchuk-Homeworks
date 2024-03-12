package de.telran.homeWorks_22_08.module1.module6.homeWork2.silmag;
public class ThreadInteraction {
    private int shelfCapacity;
    private int itemsInStock = 0;

    public ThreadInteraction(int shelfCapacity) {
        this.shelfCapacity = shelfCapacity;
    }

    public synchronized void supplierItem() {
        while (itemsInStock >= shelfCapacity) {
            try {
                System.out.println("Полки ломятся от товара. Поставщик ждет");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        itemsInStock++;
        System.out.println("Добавлен 1 товар. Сейчас в наличии: " + itemsInStock + " товаров");
        notifyAll();
    }

    public synchronized void purchasedGoods(String customerName) {
        while (itemsInStock == 0) {
            try {
                System.out.println(customerName + " Ждет пока соизволят доставить товар");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        itemsInStock--;
        System.out.println(customerName + " купил 1 товар. В наличии: " + itemsInStock + " товаров");
        notifyAll();
    }
}