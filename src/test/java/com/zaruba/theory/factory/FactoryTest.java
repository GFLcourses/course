package com.zaruba.theory.factory;

import com.zaruba.theory.singleton.impl.MySingleton;
import com.zaruba.theory.singleton.impl.MySingleton2;
import com.zaruba.theory.singleton.impl.MySingleton3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    public static final String SINGLETON_FIRST = "This is MySingleton";
    public static final String SINGLETON_SECOND = "This is MySingleton2";
    public static final String SINGLETON_THIRD = "This is MySingleton3";
    public static final String SERVICE_IS_EMPTY = "Service is empty";
    public static final String NEW_SERVICE = "new Service";


    @DisplayName("JUnit test for results of creating singleton by factory")
    @Test
    public void shouldBeSuccess() {

        assertEquals(new SingletonFactory().getSingleton(MySingleton.getInstance()), SINGLETON_FIRST);
        assertEquals(new SingletonFactory().getSingleton(MySingleton2.getInstance()), SINGLETON_SECOND);
        assertEquals(new SingletonFactory().getSingleton(MySingleton3.getInstance()), SINGLETON_THIRD);

        assertNotNull(new SingletonFactory().getSingleton(() -> System.out.println(NEW_SERVICE)));

    }

    @DisplayName("JUnit test for results of creating singleton which throws exception")
    @Test
    public void shouldThrowException() {

        Exception exception = assertThrows(RuntimeException.class,
                () -> new SingletonFactory().getSingleton(null));

        assertTrue(exception.getMessage().contains(SERVICE_IS_EMPTY));

    }


}
