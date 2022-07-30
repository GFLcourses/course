package com.patterns.builder;

public class User {
    private String login;
    private String password;
    private Long timestamp;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this.login, this.password, this.timestamp);
    }

    private User(Builder builder) {
        this.login = builder.login;
        this.password = builder.password;
        this.timestamp = builder.timestamp;
    }

    public static class Builder {
        private String login;
        private String password;
        private Long timestamp;

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public User build() {
            return new User(this);
        }

        private Builder() {}

        private Builder(String login, String password, Long timestamp) {
            this.login = login;
            this.password = password;
            this.timestamp = timestamp;
        }
    }
}
