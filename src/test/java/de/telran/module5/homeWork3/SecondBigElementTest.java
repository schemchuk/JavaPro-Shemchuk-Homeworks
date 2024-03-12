package de.telran.module5.homeWork3;

import de.telran.homeWorks_22_08.module1.module5.homeWork3.SecondBigElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondBigElementTest {

    @Test
    public void testFindSecondBigWithValidArray() {
        int[] array = {-1, 4, 0, 2, 7, -3};
        int result = SecondBigElement.findSecondBig(array);
        assertEquals(4, result);
    }

    @Test
    public void testFindSecondBigWithArrayLessThanTwoElements() {
        int[] array = {-1};
        int result = SecondBigElement.findSecondBig(array);
        assertEquals(-1, result);
    }

    @Test
    public void testFindSecondBigWithArrayEqualsTwoElements() {
        int[] array = {-1, 4};
        int result = SecondBigElement.findSecondBig(array);
        assertEquals(-1, result);
    }

    @Test
    public void testFindSecondBigWithDescendingOrderArray() {
        int[] array = {7, 4, 2, 1, 0, -3};
        int result = SecondBigElement.findSecondBig(array);
        assertEquals(4, result);
    }
}