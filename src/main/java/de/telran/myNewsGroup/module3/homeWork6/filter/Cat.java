package de.telran.myNewsGroup.module3.homeWork6.filter;

public class Cat {
    boolean isHundry;

    public Cat(boolean isHundry) {
        this.isHundry = isHundry;
    }

    public boolean isHundry() {
        return isHundry;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isHundry=" + isHundry +
                '}';
    }

    public void setHundry(boolean hundry) {
        isHundry = hundry;
    }
}
