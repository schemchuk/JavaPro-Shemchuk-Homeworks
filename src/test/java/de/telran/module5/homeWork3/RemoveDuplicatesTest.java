package de.telran.module5.homeWork3;

import de.telran.homeWorks_22_08.module1.module5.homeWork3.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicatesWithDuplicates() {
        int[] inputArray = {0, 3, -2, 4, 3, 2};
        int[] expectedArray = {0, 3, -2, 4, 2};
        int[] resultArray = RemoveDuplicates.removeDuplicates(inputArray);
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testRemoveDuplicatesWithoutDuplicates() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] resultArray = RemoveDuplicates.removeDuplicates(inputArray);
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testRemoveDuplicatesWithEmptyArray() {
        int[] inputArray = {};
        int[] expectedArray = {};
        int[] resultArray = RemoveDuplicates.removeDuplicates(inputArray);
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testRemoveDuplicatesWithSingleElement() {
        int[] inputArray = {5};
        int[] expectedArray = {5};
        int[] resultArray = RemoveDuplicates.removeDuplicates(inputArray);
        assertArrayEquals(expectedArray, resultArray);
    }
}
