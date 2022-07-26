package Proxy.Platforms;

import Proxy.Telegram;

public class LinuxTelegram implements Telegram {
    @Override
    public String Login() {
        return "Login from Linux!";
    }
}
