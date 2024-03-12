package de.telran.homeWorks_22_08.module1.homeWorksWithNik.homeWork1.task7;


public class CatGetSetColor implements Cloneable{

    private CatColor color;

    public CatColor getColor() {
        return color;
    }

    public void setColor(CatColor color) {
        this.color = color;
    }

    public CatGetSetColor deepCopy() {
        try {
            CatGetSetColor cloneCat = (CatGetSetColor) super.clone();
            cloneCat.color = this.color.deepCopy();
            return cloneCat;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}






