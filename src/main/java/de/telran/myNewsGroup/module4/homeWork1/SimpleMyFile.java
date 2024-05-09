package de.telran.myNewsGroup.module4.homeWork1;

import java.io.*;
//Имеется текстовый файл. Вывести:

public class SimpleMyFile {
    public static void main(String[] args) {
        String filePath = "src/main/java/de/telran/myNewsGroup/module4/homeWork1/redme.txt";

        File file = new File(filePath);

        //размер файла в байтах, КБ, МБ;
        long fileSizeInBytes = file.length();
        double fileSizeInKB = fileSizeInBytes / 1024.0;
       double fileSizeInMB = fileSizeInKB / 1024.0;

        System.out.println("Размер файла:");
        System.out.println("В байтах: " + fileSizeInBytes);
        System.out.println("В КБ: " + fileSizeInKB);
        System.out.println("В МБ: " + fileSizeInMB);

        //количество строк в файле;
        //количество символов в файле.

        int countChar = 0;
        int countLine = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null) {
                countLine++;
                countChar += line.length();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Количество строк в файле: " + countLine);
        System.out.println("Количество символов в файле: " + countChar);
    }
}
