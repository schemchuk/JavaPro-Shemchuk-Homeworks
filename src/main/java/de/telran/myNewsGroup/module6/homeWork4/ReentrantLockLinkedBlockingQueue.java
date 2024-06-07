package de.telran.myNewsGroup.module6.homeWork4;


    /**
     * Переписать класс ReentrantLockLinkedBlockingQueue (См. код в репозитории) так, чтобы
     *
     *
     *
     * очередь была на основе массива (ArrayDeque)
     *
     * размер очереди задавался через параметр size в конструкторе
     *
     * при попытки положить элемент в заполненную очередь поток-продьюсер ожидал бы освобождение места
     */

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockLinkedBlockingQueue<T> {

    private final Queue<T> queue;
    private final int maxsize;
    private final ReentrantLock lock = new ReentrantLock(true);

    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public ReentrantLockLinkedBlockingQueue(int size) {
        this.queue = new ArrayDeque<>(size);
        this.maxsize = size;
    }


    public void put(T t) throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == maxsize) {
                notFull.await();
            }
            queue.add(t);
            notEmpty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public T take() throws InterruptedException {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                notEmpty.await();
            }
            T data = queue.poll();
            notFull.signal();
            return data;
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw e;
        } finally {
            lock.unlock();
        }
    }


    public int size() {
        lock.lock();
        try {
            int size;
            size = queue.size();
            return size;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockLinkedBlockingQueue queue = new ReentrantLockLinkedBlockingQueue(10);

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    queue.put((String.valueOf(i)));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Producer process: " + i);
            }
        });

        Thread consumer = new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                String data = null;
                try {
                    data = (String) queue.take();
                } catch (InterruptedException e) {
                   Thread.currentThread().interrupt();
                }
                System.out.println("Consumer process: " + data);
            }
        });

        producer.start();
        consumer.start();
    }
}








