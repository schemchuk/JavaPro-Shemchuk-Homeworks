package de.telran.homeWorks_22_08.module1.homework4.storage;

public class TestStorage {
    public static void main(String[] args) {
        Storage storage = new Storage();

        //осторожно - работает грузчик
        storage.loadProducts();
        storage.unloadProducts();

        // Кладовщик во всей красе
        storage.acceptProducts();
        storage.releaseProducts();
        storage.determineStorageLocation();
        storage.createDoTask();
        storage.createDoPlacementTask();

        //Выход сборщика
        storage.placeProductsOnShelf();
        storage.pickProducts();
    }
}

// для работы с гитом
