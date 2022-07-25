import Builder.Pizza;
import SingleTone.SingleTone;

public class Main {
    public static void main(String[] args) {
        SingleTone singleTone = SingleTone.getInstance();
        System.out.println(singleTone.getDbConnection());

        Pizza pizza = new Pizza.Builder().cheese(30).sausage(30).olives(15).build();
        System.out.println(pizza);
    }
}
