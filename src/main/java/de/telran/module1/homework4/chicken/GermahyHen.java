package de.telran.module1.homework4.chicken;

public class GermahyHen extends Hen{
    @Override
    int getCountOfEggsPerMonf() {
        return 15;
    }
    @Override
    public String getDescription() {
        return "My country is Germany. I get " + getCountOfEggsPerMonf() + " eggs a month";
    }
}
