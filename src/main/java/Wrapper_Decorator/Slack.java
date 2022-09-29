package Wrapper_Decorator;

public class Slack extends Sms{
    public Slack(Notify notify) {
        super(notify);
    }

    public void notifyEvent() {
        notify.notifyEvent();
        System.out.println("Notify by Slack");
    }
}
