package de.telran.module1.homework4.storage;

public class Storage {
    public void loadProducts() {
        System.out.println("Грузчик: Загружает товар.");
    }
    public void unloadProducts() {
        System.out.println("Грузчик: Разгружает товар.");
    }

    public void acceptProducts() {
        System.out.println("Кладовщик: Принимает товар.");
    }

    public void releaseProducts() {
        System.out.println("Кладовщик: Отпускает товар.");
    }

    public void determineStorageLocation() {
        System.out.println("Кладовщик: Определяет место (ячейку) для хранения товара.");
    }

    public void createDoTask() {
        System.out.println("Кладовщик: Формирует задание на сборку товара со склада.");
    }

    public void createDoPlacementTask() {
        System.out.println("Кладовщик: Формирует задание на размещение товара на складе.");
    }

    public void placeProductsOnShelf() {
        System.out.println("Сборщик: Размещает товар на складе.");
    }

    public void pickProducts() {
        System.out.println("Сборщик: Собирает товар на складе.");
    }

}

// для работы с гитом

