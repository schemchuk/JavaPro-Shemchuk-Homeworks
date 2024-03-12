package de.telran.homeWorks_22_08.module1.homework4.chicken;

public class ShowFabrik {
    public static void main(String[] args) {
        HenFactory henFactory = new HenFactory();

        Hen polskaHen = henFactory.getHen("Polska");
        Hen ukrainianHen = henFactory.getHen("Ukraine");
        Hen moldovaHen = henFactory.getHen("Moldova");
        Hen germanyHen = henFactory.getHen("Germany");

        System.out.println(polskaHen.getDescription());
        System.out.println(ukrainianHen.getDescription());
        System.out.println(moldovaHen.getDescription());
        System.out.println(germanyHen.getDescription());
    }
}
