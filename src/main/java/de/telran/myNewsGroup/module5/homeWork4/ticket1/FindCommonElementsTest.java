package de.telran.myNewsGroup.module5.homeWork4.ticket1;

import de.telran.myNewsGroup.module5.homeWork3.ticket1.FindCommondElements;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindCommonElementsTest {

    @Test
    public void testfindCommonElements() {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        List<Integer> experted = List.of(1,7);

        List<Integer> result = FindCommondElements.findCommonElements(array1,array2);

        assertEquals(experted, result);
    }
}
