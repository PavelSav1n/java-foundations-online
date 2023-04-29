package ru.itsjava.annotations.junit;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import ru.itsjava.annotations.junit.myannotations.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

@RequiredArgsConstructor
public class MyJUnit {

    private final Object objTestClass; // объект необходимый для invoke() методов этого класса
    private int passCount = 0;
    private int failCount = 0;
    private final ArrayList<Method> testMethods = new ArrayList<>(); // список, куда попадут все @Test методы
    private final ArrayList<Method> beforeMethods = new ArrayList<>(); // список, куда попадут все @Before методы
    private final ArrayList<Method> beforeAllMethods = new ArrayList<>(); // список, куда попадут все @BeforeAll методы
    private final ArrayList<Method> afterMethods = new ArrayList<>(); // список, куда попадут все @After методы
    private final ArrayList<Method> afterAllMethods = new ArrayList<>(); // список, куда попадут все @AfterAll методы

    @SneakyThrows
    public void start() {

        sortAllMethodsByAnnotation(); // сортируем по спискам методы в зависимости от их аннотаций

        // @BeforeAll execution:
        for (Method elemMethod : beforeAllMethods) {
            displayNameAnnotation(elemMethod); // Если есть @DisplayName -- будет выведено в консоль
            elemMethod.invoke(objTestClass);
        }

        // @Test execution
        for (Method elemMethod : testMethods) {
            if (beforeMethods.size() > 0) { // проверяем, есть ли @Before методы. Если есть, выполняем сначала их
                for (Method elemBeforeMethod : beforeMethods) {
                    displayNameAnnotation(elemBeforeMethod);
                    elemBeforeMethod.invoke(objTestClass);
                }
            }
            try {
                displayNameAnnotation(elemMethod);
                elemMethod.invoke(objTestClass);
                System.out.println(elemMethod.getName() + " PASSED!");
                passCount++;
            } catch (InvocationTargetException e) {
                System.out.println(elemMethod.getName() + " FAILED!");
                failCount++;
            }
            if (afterMethods.size() > 0) { // проверяем, есть ли @After методы. Если есть, выполняем сначала их
                for (Method elemAfterMethod : afterMethods) {
                    displayNameAnnotation(elemAfterMethod);
                    elemAfterMethod.invoke(objTestClass);
                }
            }
        }

        // @AfterAll execution
        for (Method elemMethod : afterAllMethods) {
            displayNameAnnotation(elemMethod);
            elemMethod.invoke(objTestClass);
        }

        printResults();

    }

    private void displayNameAnnotation(Method method) {
        if (method.isAnnotationPresent(DisplayName.class)) {
            System.out.print("\"" + method.getAnnotation(DisplayName.class).name() + "\" is executing: ");
        }
    }

    public void sortAllMethodsByAnnotation() {
        for (Method elemMethod : objTestClass.getClass().getDeclaredMethods()) {
            if (elemMethod.isAnnotationPresent(BeforeAll.class)) {
                beforeAllMethods.add(elemMethod);
            } else if (elemMethod.isAnnotationPresent(Test.class)) {
                testMethods.add(elemMethod);
            } else if (elemMethod.isAnnotationPresent(Before.class)) {
                beforeMethods.add(elemMethod);
            } else if (elemMethod.isAnnotationPresent(AfterAll.class)) {
                afterAllMethods.add(elemMethod);
            } else if (elemMethod.isAnnotationPresent(After.class)) {
                afterMethods.add(elemMethod);
            }
        }
    }

    private void printResults() {
        System.out.println("=================================");
        System.out.println("Пройденных тестов: " + passCount);
        System.out.println("Проваленных тестов: " + failCount);
        System.out.println("=================================");
    }
}
