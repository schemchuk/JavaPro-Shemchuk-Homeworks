package de.telran.homeWorksWithNik.homeWork1.task7;

public class CatShowColor {
    public static void main(String[] args) {

        CatGetSetColor originalCatColor = new CatGetSetColor();
        originalCatColor.setColor(CatColor.BLACK);

        CatGetSetColor copiCat = originalCatColor.deepCopy();

        System.out.println("Оригинальный цвет кошки: " + originalCatColor.getColor());
        System.out.println("Скопированная кошка имеет цвет: " + copiCat.getColor());
    }
}
