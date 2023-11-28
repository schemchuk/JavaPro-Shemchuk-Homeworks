package de.telran.module1.homework6.printer;

public class SimplePrinter {
    public static void main(String[] args) {
        Printer printer = Printer.getInstance();
        printer.checkPrinterStatus();
    }
}
//