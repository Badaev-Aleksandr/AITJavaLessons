package homework31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
                            Задания для практики написания тестов с использованием JUnit:
 */
public class TestsWork {
    private static String studentName;
    private static int studentGrade;
    private int[] arrayNumber = {5, 3, 9, 1, 7};



    // 1. Тестирование максимального значения: Напишите тест для метода max(int a, int b), который возвращает наибольшее
    // из двух чисел. Убедитесь, что тест проверяет различные комбинации положительных и отрицательных чисел.
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else return b;
    }

    //2. Инициализация данных с @Before: Создайте класс для тестирования методов класса ArrayList. Используйте @Before
    // для создания нового списка перед каждым тестом.
    //--> В классе тест

    // 3. Тестирование на null: Напишите тесты для метода, который принимает строку и возвращает её в верхнем регистре.
    //Тест должен проверять поведение метода при передаче null в качестве аргумента.

    public String stringTextToUpperCase(String text) {
        if (text == null) {
            return null;
        } else
            return text.toUpperCase();
    }

    //4. Игнорирование теста с @Disable: Напишите тест для функции, которая сейчас не реализована, и используйте @Disable,
    //чтобы JUnit не выполнял этот тест. Добавьте комментарий, поясняющий причину игнорирования.

    public int add(int one, int two) {
        return one + two;
    }

    // 5. Реализация в классе Student


    //6. Сравнение массивов: Напишите тест, который проверяет метод, возвращающий массив после его сортировки.
    //Используйте assertArrayEquals для сравнения ожидаемого и фактического массива.


    //7. Положительный тест на корректные данные: Напишите тест для метода, который принимает имя пользователя и
    // возвращает приветствие. Тест должен проверять, что метод корректно формирует приветствие для разных имён.
    public String greetings(String name) {
        return "Hallo " + name;
    }
}
