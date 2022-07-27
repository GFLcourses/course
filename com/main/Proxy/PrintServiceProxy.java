package com.main.Proxy;

public class PrintServiceProxy implements PrintService{
    private final PrintService printService;

    public PrintServiceProxy(PrintService printService) {
        this.printService = printService;
    }

    @Override
    public String print(String param) {
        System.out.println("do some logic in proxy");
        return printService.print(param);
    }
}
