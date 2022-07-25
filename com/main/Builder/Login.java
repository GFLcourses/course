package com.main.Builder;

public class Login {
    private final String login;
    private final String password;
    private final Long timestamp;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Login(LoginBuilder loginBuilder) {
        this.login = loginBuilder.login;
        this.password = loginBuilder.password;
        this.timestamp = loginBuilder.timestamp;

    }

    @Override
    public String toString() {
        return "Login{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public static class LoginBuilder {
        private String login;
        private String password;
        private Long timestamp;

        public LoginBuilder setLogin(String login) {
            this.login = login;
            return this;
        }

        public LoginBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public LoginBuilder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Login build(){
            return new Login(this);
        }


    }
}
