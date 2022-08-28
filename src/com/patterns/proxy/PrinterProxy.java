package com.patterns.proxy;

public class PrinterProxy implements PrintProvider {

    private final Printer printer;

    public PrinterProxy(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        System.out.println("additional logic of the proxy object");
        printer.print(message);
    }
}
