package de.telran.myNewsGroup.module2.nomework6.priorityQueue;

public class Product implements Comparable<Product>{
    private String name;
    private int explirDate;

    public Product(String name, int explirDate) {
        this.name = name;
        this.explirDate = explirDate;
    }


    public String getName() {
        return name;
    }

    public int getExplirDate() {
        return explirDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", explirDate=" + explirDate +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(o.explirDate,this.explirDate);
    }
}
