package homework31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsWorkTest {
    private TestsWork testsWork;
    private ArrayList arrayList;

    @BeforeEach
    public void setUpOne() {
        testsWork = new TestsWork();
    }
    @BeforeEach
    public void setUpTwo(){
        arrayList = new ArrayList<>();
    }


    @Test
    @DisplayName("1. Проверка позитивных чисел на наибольшее число ")
    void checkPositiveNumberPositive() {
        assertEquals(6, testsWork.max(5, 6));
    }

    @Test
    @DisplayName("1. Проверка негативных чисел на наибольшее число")
    void checkNegativeNumberPositive() {
        assertEquals(-1,testsWork.max(-10, -1));
    }
    @Test
    @DisplayName("1. Проверка смешанных чисел на наибольшее число")
    void checkMixNumberPositive() {
        assertEquals(11,testsWork.max(-10, 11));
    }
    @Test
    @DisplayName("1. Проверка ноля и позитивного числа на наибольшее число")
    void checkZeroPositiveNumberPositive() {
        assertEquals(20,testsWork.max(0, 20));
    }
    @Test
    @DisplayName("1. Проверка ноля и негативного числа на наибольшее число")
    void checkZeroNegativeNumberPositive() {
        assertEquals(0,testsWork.max(-99, 0));
    }
    @Test
    @DisplayName("1. Проверка равных чисел на наибольшее число")
    void checkEqualsNumberPositive() {
        assertEquals(0,testsWork.max(0, 0));
    }
    @Test
    @DisplayName("3. Проверка строки на верхний регистр")
    void checkTextLowerCasePositive(){
        assertEquals("HELLO WORLD",testsWork.stringTextToUpperCase("Hello World"));
    }
    @Test
    @DisplayName("3. Проверка метода при передаче null в качестве аргумента")
    void checkNullTextPositive(){
        assertEquals(null,testsWork.stringTextToUpperCase(null));
    }
    @Test
    @Disabled
    @DisplayName("4. Тестирование метода отложено до реализации в проекте!")
    void checkAddTwoPositiveNumberPositive(){
        assertEquals(10, testsWork.add(7, 3));
    }
    @Test
    @DisplayName("тестирование метода на isEmpty, класса ArrayList")
    void testIsEmptyArrayListPositive(){
        assertEquals(true, arrayList.isEmpty());
    }
    @Test
    @DisplayName("2. тестирование метода на add, класса ArrayList")
    void testAddToArrayListPositive(){
        assertEquals(true, arrayList.add("Hello"));
    }

    @Test
    @DisplayName("2. тестирование метода на remove, класса ArrayList")
    void testRemoveForArrayListNegative(){
        assertEquals(false, arrayList.remove("Hello"));
    }
    @Test
    @DisplayName("2. тестирование метода на contains, класса ArrayList")
    void testEqualsArrayListNegative(){
        assertEquals(false, arrayList.contains("Hello"));
    }
    @Test
    @DisplayName("7. Проверка, что метод корректно формирует приветствие для разных имён")
    void testGreetings(){
        assertEquals("Hallo Alex",testsWork.greetings("Alex"));
    }
}
