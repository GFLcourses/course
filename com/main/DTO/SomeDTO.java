package com.main.DTO;

import java.util.Objects;

public class SomeDTO {
        private String login;
        private String password;
        private Long timestamp;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            com.main.DTO.SomeDTO someDTO = (com.main.DTO.SomeDTO) o;
            return Objects.equals(login,someDTO.login) &&
                    Objects.equals(password,someDTO.password) &&
                    Objects.equals(timestamp,someDTO.timestamp);
        }

        @Override
        public int hashCode() {
            return Objects.hash(login,password,timestamp);
        }
}
