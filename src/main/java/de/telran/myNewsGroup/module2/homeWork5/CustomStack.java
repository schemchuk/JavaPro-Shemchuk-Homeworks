package de.telran.myNewsGroup.module2.homeWork5;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomStack<T> {
    private LinkedList<T> stack;

    public CustomStack(){
        stack = new LinkedList<>();
    }

    public void push(T el) {
        if (size() >= stack.size()){
            throw new IllegalArgumentException("Maximum stack size exceeded ");
        }
        stack.addFirst(el);
    }
    public T pop() {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("The stack is empty");
        }
        return stack.removeFirst();
    }

    public T peek() {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("The stack is empty");
        }
        return stack.getFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {

            return stack.isEmpty();
        }


        public static void main (String[]args){
            CustomStack<Integer> customStack = new CustomStack<>();
            customStack.stack.push(1);
            customStack.stack.push(2);
            customStack.stack.push(3);

            System.out.println("Cостав коллекции: ");
            for (int i : customStack.stack){
                System.out.println(i);
            }


            System.out.println("Размер стека: " + customStack.size());
            System.out.println("Верхний элемент стека: " + customStack.peek());

            System.out.println("Извлекаем элементы из стека:");
            while (!customStack.isEmpty()) {
                System.out.println(customStack.stack.pop());
            }

            System.out.println("Размер стека: " + customStack.size());

        }


}

