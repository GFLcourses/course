package main.java.tasks.patterns.builder;

import lombok.Getter;

@Getter
public class User {
    private final String login;
    private final String password;
    private final Long timestamp;

    public User(UserBuilder userBuilder) {
        this.login = userBuilder.login;
        this.password = userBuilder.password;
        this.timestamp = userBuilder.timestamp;
    }

    @Override
    public String toString() {
        return "User{"
                + (login != null ? ("login='" + login + "'") : (""))
                + (password != null ? (", password='" + password + "'") : (""))
                + (timestamp != null ? (", timestamp='" + timestamp + "'") : (""))
                + '}';
    }

    public static class UserBuilder {
        private String login;
        private String password;
        private Long timestamp;

        public UserBuilder setLogin(String login) {
            this.login = login;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
