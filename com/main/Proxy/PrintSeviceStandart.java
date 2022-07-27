package com.main.Proxy;

public class PrintSeviceStandart implements PrintService{
    @Override
    public String print(String param) {
        System.out.println("do something in standart class");
        System.out.println("get input parameter: " + param);
        return "some success result";
    }
}
