package de.telran.myNewsGroup.module3.homeWork6.filter;

public class FilterCatIsHundry implements Filter<Cat> {

    @Override
    public boolean apply(Cat cat) {
        return cat.isHundry();
    }
}
