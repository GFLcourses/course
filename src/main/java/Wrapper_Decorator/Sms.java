package Wrapper_Decorator;

public class Sms implements Notify{
    Notify notify;

    public Sms(Notify notify) {
        this.notify = notify;
    }

        

    @Override
    public void notifyEvent() {

    }
}
