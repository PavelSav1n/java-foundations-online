package ru.itsjava.annotations.junit;

import ru.itsjava.annotations.junit.myannotations.*;

// Класс с пулом тестов для практики
public class MyFavoriteTest {

    @DisplayName(name = "Before All Method 1")
    @BeforeAll
    public void beforeAllMethod1() {
        System.out.println("beforeAllMethod1");
    }

    @BeforeAll
    public void beforeAllMethod2() {
        System.out.println("beforeAllMethod2");
    }

    @DisplayName(name = "Before Method 1")
    @Before
    public void beforeMethod1() {
        System.out.println("beforeMethod1");
    }

    @Before
    public void beforeMethod2() {
        System.out.println("beforeMethod2");
    }

    @DisplayName(name = "After Method 1")
    @After
    public void afterMethod1() {
        System.out.println("afterMethod1");
    }

    @After
    public void afterMethod2() {
        System.out.println("afterMethod2");
    }

    @DisplayName(name = "After All Method 1")
    @AfterAll
    public void afterAllMethod1() {
        System.out.println("afterAllMethod1");
    }

    @AfterAll
    public void afterAllMethod2() {
        System.out.println("afterAllMethod2");
    }

    @DisplayName(name = "Test Method 1")
    @Test
    public void testMethod1() {
    }

    @Test
    public void testMethod2() {
    }

    @Test
    public void testMethod3() {
        throw new RuntimeException();
    }

    @DisplayName(name = "Test Method 4")
    @Test
    public void testMethod4() {
        throw new RuntimeException();
    }

    public void noTestMethod() {
    }
}
