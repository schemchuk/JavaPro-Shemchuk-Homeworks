package de.telran.homeWorks_22_08.module1.module2.HomeWork5.restaraunt;

public class SimpleRestaraunt {
    public static void main(String[] args) {
        RestarauntWork restor = new RestarauntWork();
        restor.addOrder(new Order("Огурцы соленые",1) );
        restor.addOrder(new Order("Капуста квашенная",2));
        restor.addOrder(new Order("Томаты моченные",3));
        restor.addOrder(new Order("Щи! -с",4));
    }
}
