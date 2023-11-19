package de.telran.module1.homeWork2.box;

public class Extendet {
    public static void main(String[] args) {

        MyBox myBox = new MyBox(23,13, 6, 23456);

        System.out.println("Обем коробки " + myBox.volumeBox() + " единиц кубических");
        System.out.println( "Потребуется " + myBox.hovBoxesNeed() + " коробок");
    }
}
