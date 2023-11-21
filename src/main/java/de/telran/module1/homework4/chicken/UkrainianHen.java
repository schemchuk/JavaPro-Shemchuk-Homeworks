package de.telran.module1.homework4.chicken;

public class UkrainianHen extends Hen{

    @Override
    int getCountOfEggsPerMonf() {
        return 25;
    }
    @Override
    public String getDescription() {
        return "My country is Ukraine. I get " + getCountOfEggsPerMonf() + " eggs a month";
    }
}
