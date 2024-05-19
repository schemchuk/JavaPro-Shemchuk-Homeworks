package de.telran.myNewsGroup.module5.homeWork3.ticket2;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        int[] inputArray = {0, 3, -2, 4, 3, 2};
        int[] expected = {0, 3, -2, 4, 2};

        int[] result = RemoveDuplicates.reomveDuplicates(inputArray);

        assertArrayEquals(expected, result);
    }
}
