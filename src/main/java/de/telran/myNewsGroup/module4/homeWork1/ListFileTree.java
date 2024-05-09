package de.telran.myNewsGroup.module4.homeWork1;

import java.io.*;
import java.util.Scanner;

public class ListFileTree {

    public static void main(String args[]) {
        String s;
        while (true) {
            System.out.println("Enter full path ('quit' to exit): ");
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();

            if (s.equals("quit")) break;
            File f = new File(s);
            if (!f.exists()) {
                System.out.println("\nNot found: " + s);
                continue;
            }

            if (!f.isDirectory()) {
                System.out.println("\nNot directory: " + s);
                continue;
            }

            list(s);
        }
    }

    public static void list(String szDir) {
        File f = new File(szDir);
        String[] sDirList = f.list();

        int i;
        for (i = 0; i < sDirList.length; i++) {
            File f1 = new File(szDir + File.separator + sDirList[i]);

            if (f1.isDirectory()) {
                System.out.println("Переходим в каталог: " + f1.getAbsolutePath());
                list(f1.getAbsolutePath());
            } else if (f1.isFile() && f1.getName().toLowerCase().endsWith(".txt")) {
                System.out.println("Читаем файл: " + f.getAbsolutePath());
                printFileContent(f1);
            }

        }
    }
    public static void printFileContent(File f) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
