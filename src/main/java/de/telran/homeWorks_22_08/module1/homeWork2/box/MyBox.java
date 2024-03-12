package de.telran.homeWorks_22_08.module1.homeWork2.box;

 public class MyBox {
     private double length;
     private double width;
     private double height;
    public double bulkProductWolume;


     public MyBox(double length, double width, double height, double bulkProductWolume) {
         this.length = length;
         this.width = width;
         this.height = height;
         this.bulkProductWolume = bulkProductWolume;
     }

     public double volumeBox() {
        return width * length * height;

    }

    public int hovBoxesNeed() {
        double boxes = bulkProductWolume / volumeBox();

        //   Удачно списано мной. Округление вверх и преобразование в целое число
        int roundedBoxes = (int) Math.ceil(boxes);

        return roundedBoxes;

    }

     public double getLength() {
         return length;
     }

     public double getWidth() {
         return width;
     }

     public double getHeight() {
         return height;
     }
 }