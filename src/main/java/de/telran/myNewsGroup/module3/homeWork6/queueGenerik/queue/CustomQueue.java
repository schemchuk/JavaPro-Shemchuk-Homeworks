package de.telran.myNewsGroup.module3.homeWork6.queueGenerik.queue;

import java.util.ArrayDeque;

public class CustomQueue<T> {
    /**
     * . Переделать класс CustomQueue (пакет lesson20240325.queue) так, чтобы этот класс мог хранить данные любого типа
     */

    private ArrayDeque<T> deque = new ArrayDeque<>();


    public void enqueue(T  data){
        deque.add(data);
    }

    public T dequeue(){
        return deque.removeFirst();
    }

    public static void main(String[] args) {
        CustomQueue myQueue = new CustomQueue();
        myQueue.enqueue("Add");
        myQueue.enqueue(1);
        myQueue.enqueue("Cat");

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }


}
