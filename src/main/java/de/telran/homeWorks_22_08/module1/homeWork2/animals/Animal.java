package de.telran.homeWorks_22_08.module1.homeWork2.animals;

import de.telran.homeWorks_22_08.module1.homeWork2.humans.Eartlhing;

public class Animal extends Eartlhing {
    public String type = "Chord";
    public String tClass = "Mammals";

    public void setType(String type) {
        this.type = type;
    }

    public void settClass(String tClass) {
        this.tClass = tClass;
    }

    public String getType() {
        return type;
    }

    public String gettClass() {
        return tClass;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", tClass='" + tClass + '\'' +
                ", galaxi='" + galaxi + '\'' +
                ", system='" + system + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
