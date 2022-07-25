package builder;

import java.util.*;

public class BuilderTest{
    private final String login;
    private final String password;
    private final Long timestamp;

    private BuilderTest(Builder builder){
        this.login = builder.login;
        this.password = builder.password;
        this.timestamp = builder.timestamp;
    }

    public String getLogin(){
        return this.login;
    }

    public String getPassword(){
        return this.password;
    }

    public Long getTimestamp(){
        return this.timestamp;
    }


    public static Builder newBuilder(){
        return new Builder();
    }

    public Builder toBuild(){
        return new Builder(this.login, this.password, this.timestamp);
    }

    public static class Builder{
        private String login;
        private String password;
        private Long timestamp;

        private Builder(){}

        private Builder(String login, String password, Long timestamp){
            this.login = login;
            this.password = password;
            this.timestamp = timestamp;
        }

        public Builder setLogin(String login){
            this.login = login;
            return this;
        }

        public Builder setPassword(String password){
            this.password = password;
            return this;
        }

        public Builder setTimestamp(Long timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public BuilderTest build(){
            return new BuilderTest(this);
        }

    }


    @Override
    public String toString(){
        return "BuilderTest : login = " + this.login + " , password = " + this.password + " , timestamp = " + timestamp + ".";
    }

    @Override
    public int hashCode(){
        return Objects.hash(login, password, timestamp);
    }

    @Override
    public boolean equals(Object object){
        if (object == this){
            return true;
        }
        if (object == null){
            return false;
        }
        if(this.getClass() != object.getClass()){
            return false;
        }
        BuilderTest builderTest = (BuilderTest) object;
        return Objects.equals(this.login, builderTest.login)
                && Objects.equals(this.password, builderTest.password)
                && Objects.equals(this.timestamp, builderTest.timestamp);
    }

}