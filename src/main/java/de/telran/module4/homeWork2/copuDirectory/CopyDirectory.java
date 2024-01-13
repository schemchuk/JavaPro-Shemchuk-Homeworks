package de.telran.module4.homeWork2.copuDirectory;

import java.io.*;
import java.util.Scanner;

public class CopyDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод пути к существующей папке  src/homeWork
        System.out.println("введите корректный путь: ");
        String sourcePath = scanner.nextLine();

        // Ввод имени новой папки
        System.out.print("Введите имя новой папки: ");
        String newFolderName = scanner.nextLine();

        // Формирование пути к новой папке
        String destinationPath = sourcePath + File.separator + newFolderName;

        // Создаем объекты для исходной и целевой директорий
        File sourceDirectory = new File(sourcePath);
        File destinationDirectory = new File(destinationPath);

        // Проверяем, существует ли исходная директория
        if (!sourceDirectory.exists()) {

            System.out.println("Исходная директория не существует.");
            return;
        }

        // Проверяем, является ли исходный объект директорией
        if (sourceDirectory.isDirectory()) {
            // Создаем целевую директорию, если она не существует
            if (!destinationDirectory.exists()) {
                destinationDirectory.mkdir();
                System.out.println("Целевая директория создана: " + destinationPath);
            }

            // Получаем список файлов и поддиректорий в исходной директории
            File[] content = sourceDirectory.listFiles();

            if (content != null) {
                // Копируем каждый файл или поддиректорию в целевую директорию
                for (File file : content) {
                    copyFileOrDirectory(file, new File(destinationDirectory, file.getName()));
                }
                System.out.println("Копирование завершено.");
            } else {
                System.out.println("Ошибка получения содержимого директории.");
            }
        } else {
            System.out.println("Исходный путь не является директорией.");
        }

        scanner.close(); // Закрываем Scanner после использования
    }


    private static void copyFileOrDirectory(File init, File whichCopy) {
        try {
            if (init.isDirectory()) {
                // Если исходный объект - директория, рекурсивно копируем её содержимое
                if (!whichCopy.exists()) {
                    whichCopy.mkdir();
                }
                File[] content = init.listFiles();
                if (content != null) {
                    for (File file : content) {
                        copyFileOrDirectory(file, new File(whichCopy, file.getName()));
                    }
                }
            } else {
                // Если исходный объект - файл, копируем его
                try (InputStream inputStream = new FileInputStream(init);
                     OutputStream outputStream = new FileOutputStream(whichCopy)) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, length);
                    }
                }
            }
            System.out.println("Копирование завершено");
        } catch (IOException exception) {
            System.out.println("Ошибка копирования: " + exception.getMessage());
        }
    }

}
