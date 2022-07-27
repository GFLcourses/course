package main.java.tasks.patterns.builder;

public class TestBuilder {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setLogin("Jojo")
                .setPassword("123")
                .setTimestamp(121L)
                .build();
        User user2 = new User.UserBuilder()
                .setLogin("Lala")
                .build();

        System.out.println(user);
        System.out.println(user2);

        UserWithRequiredParams user3 = new UserWithRequiredParams
                .UserWithRequiredParamsBuilder("Michael", "qwerty")
                .setTimestamp(542L)
                .build();

        UserWithRequiredParams user4 = new UserWithRequiredParams
                .UserWithRequiredParamsBuilder("Lilly", "lilly")
                .build();

        System.out.println(user3);
        System.out.println(user4);
    }
}
