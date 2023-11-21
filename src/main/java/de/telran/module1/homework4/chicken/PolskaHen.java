package de.telran.module1.homework4.chicken;

public class PolskaHen extends Hen{

    @Override
    int getCountOfEggsPerMonf() {
        return 30;
    }
    @Override
    public String getDescription() {
        return "My country is Poland. I get " + getCountOfEggsPerMonf() + " eggs a month";
    }
}
