package Wrapper_Decorator;

public class Email extends Sms{
    public Email(Notify notify) {
        super(notify);
    }

    public void notifyEvent() {
        notify.notifyEvent();
        System.out.println("Notify by Email");
    }
}
