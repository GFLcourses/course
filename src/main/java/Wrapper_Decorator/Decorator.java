package Wrapper_Decorator;

public class Decorator {
    public static void main(String[] args) {

        Notify notifyEmail = new Email(new NotifyImp());
        notifyEmail.notifyEvent();

        Notify notifySlack = new Slack(new NotifyImp());
        notifySlack.notifyEvent();


    }
}
