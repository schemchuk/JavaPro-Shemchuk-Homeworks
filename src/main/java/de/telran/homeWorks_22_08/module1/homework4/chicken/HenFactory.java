package de.telran.homeWorks_22_08.module1.homework4.chicken;

public class HenFactory {
    public Hen getHen(String country){
        switch (country.toLowerCase()) {
            case "polska":
                return new PolskaHen();
            case "ukraine":
                return new UkrainianHen();
            case "moldova":
                return new MoldovaHen();
            case "germany":
                return new GermahyHen();
            default: return null;

        }
    }
}
