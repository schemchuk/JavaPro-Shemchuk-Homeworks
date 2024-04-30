package de.telran.myNewsGroup.module3.homeWork6.filter;

import java.util.Arrays;
import java.util.List;

public class SimpleCollections {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "Sum 123",
                "Sum 456",
                "Sum 123",
                "Num 123",
                "Num 456",
                "Num 123"
        );


        FilteredObjects filteredObjects = new FilteredObjects<>(strings);

        List<String> mycollection = filteredObjects.applyFilter(new FilterContainsWord("123"));
        System.out.println("Строки содержат '123' :  " + mycollection);

        System.out.println();

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        FilteredObjects<Integer> myFilterList = new FilteredObjects<>(integerList);
        List<Integer> divThree = myFilterList.applyFilter(new FilderDivThree());
        System.out.println(divThree);

        System.out.println();

        Cat cat1= new Cat(true);
        Cat cat2 = new Cat(true);
        Cat cat3 = new Cat(false);
        Cat cat4 = new Cat(true);
        Cat cat5 = new Cat(false);
        List<Cat> myCats = Arrays.asList(cat1,cat2,cat3,cat4,cat5);

        FilteredObjects<Cat> myCatList = new FilteredObjects<>(myCats);
        List<Cat> hundryCats = myCatList.applyFilter(new FilterCatIsHundry());

        System.out.println(hundryCats);
    }
}
