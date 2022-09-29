import DTO.People;
import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        //DTO
        People p1 = new People("Vlad", 19, false);
        System.out.println(p1);

        //Singleton
        Singleton singleton = Singleton.getInstance(1111111);
        Singleton anotherSingleton = Singleton.getInstance(2222222);

        System.out.println(singleton);
        System.out.println(anotherSingleton);
    }
}
