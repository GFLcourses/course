import builder.BuilderTest;
import dto.DTO;
import singleton.MySingleton;

public class Main {

public static void main(String[] arg) {

	DTO test = new DTO("login", "password", 123L);
        System.out.println(test.toString());

	System.out.println(MySingleton.getInstance());

	BuilderTest builderTest = BuilderTest.newBuilder()
                .setLogin("login2")
                .setPassword("password2")
                .setTimestamp(345L)
                .build();

        System.out.println(builderTest.toString());

}

}