package Wrapper_Decorator;

public class Skype extends Sms{
    public Skype(Notify notify) {
        super(notify);
    }

    public void notifyEvent() {
        notify.notifyEvent();
        System.out.println("Notify by Skype");
    }
}
