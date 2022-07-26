package Proxy.Platforms;

import Proxy.Telegram;

public class WindowTelegram implements Telegram {
    @Override
    public String Login() {
        return "Login from Windows!";
    }
}
