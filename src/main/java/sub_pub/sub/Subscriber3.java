package sub_pub.sub;

public class Subscriber3 implements Subscriber {

    @Override
    public void message(String message) {
        System.out.println("Новое уведомление = " + message + " для подписчика = " + this.getId());
    }

    @Override
    public String getId() {
        return "subscriber-3";
    }
}