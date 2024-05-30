package exceptionshandling;
/*
Обработка непроверяемого исключения
 Напишите программу, которая пытается получить доступ к элементу массива с недопустимым индексом и обрабатывает исключение.
**Задание:**
1. Создайте класс `ArrayAccessExample`.
2. В методе `main` напишите код, который пытается получить доступ к 10-му элементу массива из трех элементов.
3. Обработайте `ArrayIndexOutOfBoundsException` с помощью блока `try-catch`.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayAccessExample {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayAccessExample.class);

    public static void main(String[] args) {
        taskInt();
        taskString();

    }
    public static void taskInt(){
        int[] numbers = {1, 2, 3};
        int element = 10;
        try {
            LOGGER.info("Получаем элемент по индексу {}", element);
            int result = numbers[element];
        } catch (ArrayIndexOutOfBoundsException exception) {
            LOGGER.error(exception.getMessage());
        } finally {
            LOGGER.info("Завершение работы программы");
        }
    }
    public static void taskString(){
        String[] names= new String[3];
        names[0]= "John";
        names[1] = "Jane";
        names[2] = "Doe";
        try {
            System.out.println(names[9]);
        }catch (ArrayIndexOutOfBoundsException exception){
            LOGGER.error(exception.getMessage());
        }finally {
            LOGGER.info("Завершение работы");
        }
    }
}
