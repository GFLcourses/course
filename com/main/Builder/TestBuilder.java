package com.main.Builder;

public class TestBuilder {
    public static void main(String[] args) {
        Login login = new Login.LoginBuilder().setLogin("test").setPassword("some pass").build();
        System.out.println(login.toString());
    }
}
