package Builder;

public class Builder {
    public static void main(String[] args) {
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
        System.out.println(threeCheesePizza);
    }
}
