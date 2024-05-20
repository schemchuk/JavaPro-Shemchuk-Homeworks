package de.telran.myNewsGroup.module5.homeWork4.ticket3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopKTaskTest {
    @Test
    public void testTopKWithPriorityQueue() {
        List<TopKTask.Item> items = Arrays.asList(new TopKTask.Item("Book", 100),
                new TopKTask.Item("Toy1", 50),
                new TopKTask.Item("Book", 40),
                new TopKTask.Item("Toy3", 12),
                new TopKTask.Item("Toy4", 32),
                new TopKTask.Item("Toy5", 23),
                new TopKTask.Item("Toy6", 25),
                new TopKTask.Item("Doll", 45));

        List<TopKTask.Item> expected = Arrays.asList(
                new TopKTask.Item("Toy1", 50),
                new TopKTask.Item("Doll", 45),
                new TopKTask.Item("Book", 40)
        );

        List<TopKTask.Item> result = TopKTask.topKWithPriorityQueue(items, 3);

    }

}