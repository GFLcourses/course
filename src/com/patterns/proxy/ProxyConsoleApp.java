package com.patterns.proxy;

public class ProxyConsoleApp {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("parameters of the printer");

        PrinterProxy proxy = new PrinterProxy(printer);
        proxy.print("parameters of the printer");
    }
}
