import Builder.Pizza;
import Facade.Facade;
import Facade.service.impl.DataAnalyzerGeneric;
import Facade.service.impl.WebPageParser;
import Proxy.Colt;
import Proxy.Gun;
import Proxy.MachineGun;
import SingleTone.SingleTone;

public class Main {
    public static void main(String[] args) {
//        singleToneCheck();
//        builderCheck();
//        proxyCheck();
        facadeCheck();
    }

    private static void facadeCheck() {
        System.out.println(new Facade(new WebPageParser(), new DataAnalyzerGeneric()).getAnalyzedData("https://google.com/"));
    }

    private static void proxyCheck() {
        Gun gun = new Colt();

        System.out.println("Shoot from colt");
        gun.shoot();
        System.out.println();

        gun = new MachineGun(gun);

        System.out.println("Shoot from machine gun");
        gun.shoot();
    }

    private static void singleToneCheck() {
        SingleTone singleTone = SingleTone.getInstance();
        System.out.println(singleTone.getDbConnection());
    }

    private static void builderCheck() {
        Pizza pizza = new Pizza.Builder().cheese(30).sausage(30).olives(15).build();
        System.out.println(pizza);
    }
}
