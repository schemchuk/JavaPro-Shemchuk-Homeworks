package de.telran.homeWorks_22_08.module1.homework4.chicken;

public class MoldovaHen extends Hen{
    @Override
    int getCountOfEggsPerMonf() {
        return 20;
    }
    @Override
    public String getDescription() {
        return "My country is Moldova. I get " + getCountOfEggsPerMonf() + " eggs a month";
    }
}
