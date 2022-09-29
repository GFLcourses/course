package Proxy;

import java.util.Scanner;

public class Proxy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите номер системы через которую хотите зайти : \n");
        System.out.println("1)Android\n2)IOS\n3)MaCOS\n4)Web\n5)Windows\n6)Linux");
        int choice = scanner.nextInt();
        TelegramLogin login = new TelegramLogin(choice);
        System.out.println(login.Login());
    }
}
