package de.telran.myNewsGroup.module3.homeWork6.filter;

public class FilterContainsWord implements Filter<String> {

    private String word;

    public FilterContainsWord(String word) {
        this.word = word;
    }

    @Override
    public boolean apply(String string) {
        return string.contains(word);
    }
}
