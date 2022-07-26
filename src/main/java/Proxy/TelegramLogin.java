package Proxy;

import Proxy.Platforms.*;

public class TelegramLogin implements Telegram{
        Telegram telegramAndroid = new AndroidTelegram();
        Telegram telegramIos = new IosTelegram();
        Telegram telegramMaCOS = new MacosTelegram();
        Telegram telegramWeb = new WebTelegram();
        Telegram telegramWindow = new WindowTelegram();
        Telegram telegramLinux = new LinuxTelegram();
        private final int choice;

    public TelegramLogin(int choice) {
        this.choice = choice;
    }



    @Override
    public String Login() {
        return switch (choice) {
            case 1 -> telegramAndroid.Login();
            case 2 -> telegramIos.Login();
            case 3 -> telegramMaCOS.Login();
            case 4 -> telegramWeb.Login();
            case 5 -> telegramWindow.Login();
            case 6 -> telegramLinux.Login();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
    }
}
