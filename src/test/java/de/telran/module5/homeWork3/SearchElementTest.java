package de.telran.module5.homeWork3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchElementTest {

@Test
    void findRecesElementsTest1() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] result = SearchElement.findRecesElements(array1, array2);

        assertArrayEquals(new int[0], result);
    }

 @Test
    void findRecesElementsTest2() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int[] result = SearchElement.findRecesElements(array1, array2);

        assertArrayEquals(new int[]{3, 4, 5}, result);
    }

    @Test
    void findRecesElementsTest3() {
        int[] array1 = {};
        int[] array2 = {};

        int[] result = SearchElement.findRecesElements(array1, array2);

        assertArrayEquals(new int[0], result);
    }
}