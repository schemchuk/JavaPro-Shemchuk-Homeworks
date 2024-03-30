package de.telran.myNewsGroup.module2.nomework6.priorityTopQueue;

public class TopProduct implements Comparable<TopProduct>{
    private String name;
    private double price;

    public TopProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TopProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(TopProduct o) {
        return Double.compare(this.price, o.price);
    }
}
