package de.telran.homeWorksWithNik.homeWork1.task6;

public class CatShowColor {
    public static void main(String[] args) {
        CatGetSetColor catColor = new CatGetSetColor();
        catColor.setColor(CatColor.BLACK);
        System.out.println( "Наша кошка имеет цвет: " + catColor.getColor());

        catColor.setColor(CatColor.GRAY);
        System.out.println("Наша кошка полиняла и теперь у нее цвет: " + catColor.getColor());
    }
}
