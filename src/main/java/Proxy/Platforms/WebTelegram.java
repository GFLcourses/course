package Proxy.Platforms;

import Proxy.Telegram;

public class WebTelegram implements Telegram {
    @Override
    public String Login() {
        return "Login from Web Browser";
    }
}
