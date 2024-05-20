package de.telran.myNewsGroup.module5.homeWork4.ticket2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class RemoveDuplicateTest {

    @Test
    void removeDuplicates() {
        int[] input = {0, 3, -2, 4, 3, 2};
        int[] expected = {0, 3, -2, 4, 2};

        int[] result = RemoveDuplicates.removeDuplicates(input);

        assertArrayEquals(expected,result);
    }
}