package ru.itsjava.annotations.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JUnitRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        MyFavoriteTest myFavoriteTest = new MyFavoriteTest();

        Method[] declaredMethods = MyFavoriteTest.class.getDeclaredMethods();

        System.out.println(Arrays.toString(declaredMethods));

        int passCount = 0;
        int failCount = 0;

        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(Test.class)) {
                System.out.print(method.getName());
                try {
                    method.invoke(myFavoriteTest);
                    System.out.println(" PASSED!");
                    passCount++;
                } catch (InvocationTargetException e) {
                    System.out.println(" FAILED!");
                    failCount++;
                }
            }
        }

        System.out.println("Пройденных тестов: " + passCount);
        System.out.println("Проваленных тестов: " + failCount);

    }
}
