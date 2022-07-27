package main.java.tasks.dto;

import java.util.Objects;

public class DTO {
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
        {return false;}
        DTO dto = (DTO) obj;
        return Objects.equals(login, dto.login) && Objects.equals(password, dto.password) && Objects.equals(timestamp, dto.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, timestamp);
    }

    @Override
    public String toString() {
        return "DTO{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
