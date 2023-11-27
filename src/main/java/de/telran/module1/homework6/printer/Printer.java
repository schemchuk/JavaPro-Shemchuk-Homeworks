package de.telran.module1.homework6.printer;

public class Printer {
    private static Printer instance;
    private boolean isStatusPrinter = true;

    private Printer() {}

    public static Printer getInstance() {
        if (instance == null){
            instance = new Printer();
        }
        return instance;
    }

    public void checkPrinterStatus() {
        if (isStatusPrinter) {
            System.out.println("Printer is working. Please wait.");
        } else {
            System.out.println("Printer is free. You can use it.");
        }
    }

}
