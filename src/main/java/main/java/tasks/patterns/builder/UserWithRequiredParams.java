package main.java.tasks.patterns.builder;

import lombok.Getter;

@Getter
public class UserWithRequiredParams {
    //required params
    private final String login;
    private final String password;

    //optional param
    private Long timestamp;

    public UserWithRequiredParams(UserWithRequiredParamsBuilder userBuilder) {
        this.login = userBuilder.login;
        this.password = userBuilder.password;
        this.timestamp = userBuilder.timestamp;
    }

    @Override
    public String toString() {
        return "User{"
                + "login='" + login + "'"
                + ", password='" + password + "'"
                + (timestamp != null ? (", timestamp='" + timestamp + "'") : (""))
                + '}';
    }

    public static class UserWithRequiredParamsBuilder {
        //required params
        private final String login;
        private final String password;

        //optional param
        private Long timestamp;

        public UserWithRequiredParamsBuilder(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public UserWithRequiredParamsBuilder setTimestamp (Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public UserWithRequiredParams build() {
            return new UserWithRequiredParams(this);
        }
    }
}
