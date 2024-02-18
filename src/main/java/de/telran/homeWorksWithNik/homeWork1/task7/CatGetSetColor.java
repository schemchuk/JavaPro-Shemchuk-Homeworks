package de.telran.homeWorksWithNik.homeWork1.task7;

import lombok.Getter;
import lombok.Setter;


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






