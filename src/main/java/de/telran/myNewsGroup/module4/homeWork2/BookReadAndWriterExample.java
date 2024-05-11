package de.telran.myNewsGroup.module4.homeWork2;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * уровень сложности: Имеется несколько экземпляров класса Book
 * public class Book {
 *     private String title;
 *     private String author;
 *     private double price;
 *     private int bookCount;
 * }
 * Сохранить их в файл. Считать из файла.
 */
public class BookReadAndWriterExample {
    public static void main(String[] args) {
        Book book1 = new Book("Kateryna", "Schewchenko", 35, 3);
        Book book2 = new Book("Faust", "Geotches", 26, 6);

       ArrayList<Book> books = new ArrayList<>();
       books.add(book1);
       books.add(book2);

       try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
           outputStream.writeObject(books);
           System.out.printf("DONE, boss!\n");
       } catch (IOException e) {
           e.printStackTrace();
       }

       try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("books.dat"))) {
           ArrayList<Book> saveBooks = (ArrayList<Book>) inputStream.readObject();
           for (Book book : saveBooks) {
               System.out.println(book.getTitle() + " by " + book.getAuthor() + ", Price: " + book.getPrice() + ", Count: " + book.getBookCount());
           }
       } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
       }
    }
}
