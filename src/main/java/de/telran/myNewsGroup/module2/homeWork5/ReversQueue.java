package de.telran.myNewsGroup.module2.homeWork5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Имеется очередь Queue. Написать метод, возвращающий очередь Queue, в которой элементы расположены в обратном порядке.
 */
public class ReversQueue {
    public static Queue<Integer> reversQueue(Queue<Integer> myQueue) {
        Stack<Integer> stack = new Stack<>();

        while (!myQueue.isEmpty()){
            stack.push(myQueue.remove());
        }

        Queue<Integer> reversQueue = new LinkedList<>();

        while (!stack.isEmpty()) {
            reversQueue.add(stack.pop());
        }
        return reversQueue;
    }

    public static void main(String[] args) {
        Queue<Integer> originQueue = new LinkedList<>();


        originQueue.add(1);
        originQueue.add(2);
        originQueue.add(3);

        System.out.println("Исходная очередь: " + originQueue);

        Queue<Integer> toReversQueue = reversQueue(originQueue);
        System.out.println("Обратная очередь: " + toReversQueue);
    }
}


