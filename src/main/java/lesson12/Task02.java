package lesson12;
 /*
    Создайте метод `isEven`, который принимает один
    целочисленный аргумент и возвращает `boolean` значение,
    которое указывает, является ли число четным.
     В `main`, проверьте несколько чисел
     и выведите результаты проверки.
     */

import java.util.Scanner;

public class Task02 {
    /*

     */
    public static void main(String[] args) {

        boolean result = isEven(18);
        System.out.println(result);

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;

        // Или    if (number % 2 == 0) {
        //            return true;
        //        } else {
        //            return false;
        //        }
    }
}



