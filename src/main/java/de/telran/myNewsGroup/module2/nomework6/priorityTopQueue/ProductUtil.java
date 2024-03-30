package de.telran.myNewsGroup.module2.nomework6.priorityTopQueue;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ProductUtil {
    public List<TopProduct> getTopKPodukts(List<TopProduct> topProducts, int k) {

        if (k > topProducts.size()) {
            throw new IllegalArgumentException("k should be less than or equal to the size of topProducts");
        }

        PriorityQueue<TopProduct> myTopProducts = new PriorityQueue<>(topProducts);

        List<TopProduct> topListProducts = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            TopProduct topProduct = myTopProducts.poll();
            if (topProduct != null) {
                topListProducts.add(topProduct);
            }
        }
        return topListProducts;
    }
}

