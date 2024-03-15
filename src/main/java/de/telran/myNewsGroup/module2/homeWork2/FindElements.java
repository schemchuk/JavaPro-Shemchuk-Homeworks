package de.telran.myNewsGroup.module2.homeWork2;

import java.util.LinkedList;

public class FindElements {

    public static int findFirstIndex(LinkedList<Integer> linkedList, int element){
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) == element){
                return i;
            }
        }
        return -1;
    }

    public static  int findLastIndex(LinkedList<Integer> linkedList, int element){
        for(int i = (linkedList.size() - 1); i >= 0; i--) {
            if (linkedList.get(i) == element){
                return i;
            }
        }
        return -1;
    }
}
