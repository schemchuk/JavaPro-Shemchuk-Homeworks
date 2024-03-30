package de.telran.myNewsGroup.module2.nomework6.priorityTopQueue;

import de.telran.myNewsGroup.module2.nomework6.priorityQueue.Product;

import java.util.ArrayList;
import java.util.List;

public class ShowTopQueue {
    public static void main(String[] args) {
        /**
         *  Дан список из n товаров. У каждого товара есть название и цена.
         *  Написать метод для получения списка топ-k самых дешевых товаров, где k - входной параметр.
         */

        ProductUtil productUtil = new ProductUtil();
        List<TopProduct> topProducts = new ArrayList<>();

        topProducts.add(new TopProduct("Milk", 2.5));
        topProducts.add(new TopProduct("Bread", 1.0));
        topProducts.add(new TopProduct("Eggs", 1.2));
        topProducts.add(new TopProduct("Cheese", 3.1));
        topProducts.add(new TopProduct("Meat", 5.5));

        int k = 3;

        List<TopProduct> topProductList = productUtil.getTopKPodukts(topProducts, k);

        System.out.println("Топ (к = " + k + ") самых дешевых продуктов:");
        for (TopProduct topProduct : topProductList) {
            System.out.println(topProduct);
        }

    }
}
