package de.telran.module2.array;


public class DynamicIntArray {
    private static final int DEFAULT_CAPACITY = 10; // Начальный размер массива по умолчанию
    private static final int PROCENT_CHANGE = 50;   // % изменения размера массива при автоматическом увеличении

    private int length;     // Реальный размер хранимых данных
    private int capacity;   // Размер массива
    private int[] arr;      // Массив int размером capacity

    // Конструктор по умолчанию
    public DynamicIntArray() {
        this(DEFAULT_CAPACITY);
    }

    // Конструктор с параметром capacity
    public DynamicIntArray(int initialCapacity) {
        if (initialCapacity <= 0) {
            System.out.println("Не может существовать такого массива");
        }
        length = 0;
        capacity = initialCapacity;
        arr = new int[capacity];
    }

    // Метод для добавления элемента в конец
    public void add(int element) {
        // ensureCapacity(); // Проверка и увеличение размера массива при необходимости
        arr[length] = element;
        length++;
    }

    // Метод для добавления массива элементов в конец
    public void add(int[] elements) {
        for (int element : elements) {
            add(element);
        }
    }

    // Метод для вставки элемента по индексу
    public void insert(int index, int element) {
        if (index < 0 || index > length) {
            System.out.println("Не может быть такого индекса елемента");
        }

        ensureCapacity(); // Проверка и увеличение размера массива при необходимости

        // Смещение элементов вправо, начиная с конца массива
        for (int i = length; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = element;
        length++;
    }

    // Метод для удаления элемента по индексу
    public void delete(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        // Смещение элементов влево, начиная с удаляемого элемента
        for (int i = index; i < length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        length--;
    }

    // Метод для получения значения элемента по индексу
    public int get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return arr[index];
    }

    // Приватный метод для проверки и увеличения размера массива при необходимости
    private void ensureCapacity() {
        if (length == capacity) {
            // Если массив заполнен, увеличиваем его размер на PROCENT_CHANGE процентов
            int newCapacity = capacity + capacity * PROCENT_CHANGE / 100;
            int[] newArr = new int[newCapacity];

            // Копируем старые элементы в новый массив
            System.arraycopy(arr, 0, newArr, 0, length);

            arr = newArr;
            capacity = newCapacity;
        }
    }


}