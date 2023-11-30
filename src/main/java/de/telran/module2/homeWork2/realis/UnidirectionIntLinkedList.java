package de.telran.module2.homeWork2.realis;

public class UnidirectionIntLinkedList {
    //Инициация переменной и класса для хранения
    private int size;
    private Node head;

    //конструктор с инициализацией первичных значений
    public UnidirectionIntLinkedList() {
        size = 0;
        head = null;
    }

    //описание класса Node
    private static class Node {
        int item;
        Node next;
        //создание связки с предыдущим и последующим узлом

        public Node(int item) {
            this.item = item;
            this.next = null;
        }
    }
    // методы
    // добавлеие в конец списка

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    //добавление по индексу

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Индекс не попадает в заданные рамки");

            Node newNode = new Node(value);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node curent = head;
                for (int i = 0; i < index - 1; i++) {
                    curent = curent.next;
                }
                newNode.next = curent.next;
                curent.next = newNode;
            }
            size++;
        }
    }

    //Добавление в начало списка

    public void addFirst(int value) {
        add(0, value);
    }
// Добавление в конец списка

    public void addLast(int value) {
        add(size, value);
    }

//вщзвращение по указанному индексу

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс не попадает в заданные рамки");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }


//устанавливает значение по указанному индексу

    public int set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс не попадает в заданные рамки");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        int oldValue = current.item;
        current.item = value;
        return oldValue;
    }

}