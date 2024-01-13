package de.telran.module4.homeWork2.copuDirectory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        //
        try {
            FileInputStream inputStream = new FileInputStream("target/file.txt");  //источник с ресурсами   ввода
            File directory = new File("src/backup/folder");
            if (!directory.exists()) directory.mkdir();

            try (FileOutputStream outputStream = new FileOutputStream("src/backup/folder/file.txt")) {   //источник с ресурсами вывода
                byte[] bytes = new byte[inputStream.available()];
                int length;

                while ((length = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, length);
                }
            } catch (IOException exception) {
                System.out.println("Output error");   //  обработка оибок вывода
            }
        } catch (IOException exception) {
            System.out.println("Input error");  //  обработка ошибок ввода
        }
    }
}