package de.telran.module5.homeWork3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondSmallElementTest {

    @Test
    void testWithValidArray() {
        int[] array = {-1, 4, 0, 2, 7, -3};
        int expectedResult = -1;
        int result = SecondSmallElement.findeSecondSmallEl(array);
        assertEquals(expectedResult, result);
    }

    @Test
    void testWithArrayHavingLessThanTwoElements() {
        int[] array = {5};
        int expectedResult = -1;
        int result = SecondSmallElement.findeSecondSmallEl(array);
        assertEquals(expectedResult, result);
    }

    @Test
    void testWithSortedArray() {
        int[] array = {-5, -3, 0, 1, 2, 4};
        int expectedResult = -3;
        int result = SecondSmallElement.findeSecondSmallEl(array);
        assertEquals(expectedResult, result);
    }

    @Test
    void testWithArrayContainingDuplicates() {
        int[] array = {2, 2, 3, 1, 4, 0};
        int expectedResult = 1; // Second smallest element in the sorted array is 1
        int result = SecondSmallElement.findeSecondSmallEl(array);
        assertEquals(expectedResult, result);
    }

    @Test
    void testWithEmptyArray() {
        int[] array = {};
        int expectedResult = -1; // Array should have minimum two elements
        int result = SecondSmallElement.findeSecondSmallEl(array);
        assertEquals(expectedResult, result);
    }
}