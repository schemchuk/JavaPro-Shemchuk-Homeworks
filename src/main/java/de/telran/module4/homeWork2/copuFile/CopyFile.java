package de.telran.module4.homeWork2.copuFile;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        // Указываю путь к директории для файлов
        String directoryStudyInstruction = "/home/volodymyr/experiments/";
        String directoryNewStudyInstruction = "/home/volodymyr/experiments/";

        // Имена файлов
        String studyInstructionFileName = "studyInstruction.txt";
        String newStudyInstructionFileName = "newStudyInstruction.txt";

        /*  // Использую Scanner для ввода путей и имен файлов с клавиатуры
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к директории для файлов: ");
        String directoryStudyInstruction = scanner.nextLine();

        System.out.print("Введите путь к директории для нового файла: ");
        String directoryNewStudyInstruction = scanner.nextLine();

        System.out.print("Введите имя файла studyInstruction: ");
        String studyInstructionFileName = scanner.nextLine();

        System.out.print("Введите имя нового файла: ");
        String newStudyInstructionFileName = scanner.nextLine(); */


        //создаю файл
        File studyInstruction = new File(directoryStudyInstruction + studyInstructionFileName);
        if (!studyInstruction.exists()) {
            studyInstruction.createNewFile();
        }

        //записываю в файл studyInstruction посиьвольно
        try (FileWriter writer = new FileWriter(studyInstruction)) {
            String content = "Как повысить процент жиров у масле. \nУчебная инструкция. \nМиндурполитик ";
            writer.write(content);
        }


            // создаю новый файл newStudyInstruction
            File newStudyInstruction = new File(directoryNewStudyInstruction + newStudyInstructionFileName);
            if (!newStudyInstruction.exists()) {
                newStudyInstruction.createNewFile();
            }
            // копирую содержимое из studyInstruction в newStudyInstruction посимвольно
            try (FileReader reader = new FileReader(studyInstruction);
                 FileWriter writer = new FileWriter(newStudyInstruction)) {

                int character;

                while ((character = reader.read()) != -1) {
                    writer.write(character);
                }
            }
            System.out.println("Абсолютный путь к файлу newStudyInstruction: " + newStudyInstruction.getAbsolutePath());
            System.out.println("Абсолютный путь к файлу studyInstruction: " + studyInstruction.getAbsolutePath());

        // Закрываю если использовал Scanner
       // scanner.close();
        }
    }



// System.out.println("Абсолютный путь к файлу studyInstruction : " + studyInstruction.getAbsolutePath());