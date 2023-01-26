package ru.itsjava.homeWork.oop.homeWork7Testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    //CTRL+ALT+C
    public static final String DEFAULT_NAME = "Ivan";
    public static final int DEFAULT_AGE = 17;
    public static final String NEW_NAME = "Igor";
    public static final int NEW_AGE = 18;

    @DisplayName("корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

//        assertEquals(DEFAULT_NAME, actualPerson.getName());
//        assertEquals(DEFAULT_AGE, actualPerson.getAge());

        // Проверяет сразу по всем полям и может показать ошибку сразу во всех полях, в отличие от метода выше
        assertAll("actualPerson",
                () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));
    }

    @DisplayName("корректно изменять имя")
    @Test
    public void shouldHaveCorrectUpdatePerson() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setName(NEW_NAME);
        actualPerson.setAge(NEW_AGE);
        assertAll("actualPerson",
                () -> assertEquals(NEW_NAME, actualPerson.getName()),
                () -> assertEquals(NEW_AGE, actualPerson.getAge()));
    }

    @DisplayName("корректно добавлять к возрасту 1 год")
    @Test
    public void shouldHaveCorrectBirthdayMethod() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.birthday();
        assertAll("actualPerson",
                () -> assertEquals(DEFAULT_AGE + 1, actualPerson.getAge()));
    }

    @DisplayName("корректно определять совершеннолетие")
    @Test
    public void shouldHaveCorrectTakeBeerMethod() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        if (DEFAULT_AGE < 18) {
            assertAll("actualPerson",
                    () -> assertEquals(false, actualPerson.takeBeer()));
        } else
            assertAll("actualPerson",
                    () -> assertEquals(true, actualPerson.takeBeer()));
    }

    @DisplayName("Корректно выводить сообщение ToString")
    @Test
    public void shouldHaveCorrectToStringMethod() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertAll("actualPerson",
                () -> assertEquals("Person(name=" + DEFAULT_NAME + ", age=" + DEFAULT_AGE + ")", actualPerson.toString()));

    }

    @DisplayName("Корректно выводить hashCode")
    @Test
    public void shouldHaveCorrectHashCodeMethod() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person otherPersonWithEqualFields = new Person(DEFAULT_NAME, DEFAULT_AGE);
        int expected = otherPersonWithEqualFields.hashCode();
        assertAll("actualPerson",
                () -> assertEquals(expected, actualPerson.hashCode()));
        // более корректно проверка будет выполнена в следующем тесте Equals, поскольку equals() использует hashCode()

    }

    @DisplayName("Корректно сравнивать методом Equals")
    @Test
    public void shouldHaveCorrectEqualsMethod() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person otherPerson = new Person(NEW_NAME, NEW_AGE);
        Person otherPersonWithEqualFields = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertAll("actualPerson",
                () -> assertEquals(false, actualPerson.equals(otherPerson)),
                () -> assertEquals(false, otherPerson.equals(actualPerson)),
                () -> assertEquals(true, actualPerson.equals(otherPersonWithEqualFields)),
                () -> assertEquals(true, otherPersonWithEqualFields.equals(actualPerson)),
                () -> assertEquals(true, actualPerson.equals(actualPerson)));
    }
}
