import Builder.Pizza;
import DTO.People;
import Facade.CarFactory;
import Facade.EngineFactory;
import Facade.FrameFactory;
import Facade.WheelFactory;
import Proxy.TelegramLogin;
import Singleton.Singleton;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        //DTO
        People p1 = new People("Vlad", 19, false);
        System.out.println(p1);

        //Singleton
        Singleton singleton = Singleton.getInstance(1111111);

        Singleton anotherSingleton = Singleton.getInstance(2222222);

        System.out.println(singleton);
        System.out.println(anotherSingleton);

        //Pattern Builder
        Pizza threeCheesePizza = new Pizza.Builder(30) // создание пиццы три сыра через билдер
                .setAlfredoSauce(100)
                .setMozzarella(200)
                .setParmesan(200)
                .setBergaderBlue(200)
                .build();

        Pizza pepperoni = new Pizza.Builder(60) // создание пиццы паперони через билдер
                .setAlfredoSauce(100)
                .setPepperoni(400)
                .setParmesan(150)
                .setSausage(200)
                .setTomatoPaste(100)
                .setOlives(100)
                .build();

        System.out.println(pepperoni);

        //Facade

        CarFactory audiR8 = new CarFactory("Audi R8",new EngineFactory("cylinder for Audi R8","Supply sustem for AudiR8","Cooling system for audiR8 ","Exhaust system for Audi R8")
                ,new FrameFactory("Doors class A1","Sport roof class B1","hood class A1","bumper class A1"),
                new WheelFactory("Falken wheels","Racing Hart CX312"));
        System.out.println(audiR8);

        //Proxy
        System.out.print("Ведите номер системы через которую хотите зайти : \n");
        System.out.println("1)Android\n2)IOS\n3)MaCOS\n4)Web\n5)Windows\n6)Linux");
        int choice = scanner.nextInt();
        TelegramLogin login = new TelegramLogin(choice);
        System.out.println(login.Login());
    }
}
