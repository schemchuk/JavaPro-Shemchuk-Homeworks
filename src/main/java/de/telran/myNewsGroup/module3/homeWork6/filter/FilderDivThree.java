package de.telran.myNewsGroup.module3.homeWork6.filter;

public class FilderDivThree implements Filter<Integer> {
//    private List<Integer> num;
//
//    public FilderDivThree(List<Integer> num) {
//        this.num = num;
//    }

    @Override
    public boolean apply(Integer num) {
        return num % 3 == 0;
    }
}
