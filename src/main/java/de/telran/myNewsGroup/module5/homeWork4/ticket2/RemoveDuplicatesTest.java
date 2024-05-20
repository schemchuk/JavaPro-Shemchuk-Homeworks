package de.telran.myNewsGroup.module5.homeWork4.ticket2;

import org.testng.annotations.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        int[] input = {0, 3, -2, 4, 3, 2};
        int[] expected = {0, 3, -2, 4, 2};

        int[] result = RemoveDuplicates.removeDuplicates(input);

        assertArrayEquals(expected,result);
    }
}
