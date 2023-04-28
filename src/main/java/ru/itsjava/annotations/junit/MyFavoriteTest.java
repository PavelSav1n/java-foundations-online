package ru.itsjava.annotations.junit;

// Класс с пулом тестов для практики
public class MyFavoriteTest {

    @Test
    public void method1() {
    }
    @Test
    public void method2() {
    }
    @Test
    public void method3() {
        throw new RuntimeException();
    }
    @Test
    public void method4() {
        throw new RuntimeException();
    }

    public void noTestMethod() {
    }
}
