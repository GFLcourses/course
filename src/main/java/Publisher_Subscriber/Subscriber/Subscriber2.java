package Publisher_Subscriber.Subscriber;

public class Subscriber2 implements Subscriber {

    @Override
    public void message(String message) {
        System.out.println("Новое уведомление = " + message + " для подписчика = " + this.getId());
    }

    @Override
    public String getId() {
        return "subscriber-2";
    }
}