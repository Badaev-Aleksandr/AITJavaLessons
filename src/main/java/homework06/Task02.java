package homework06;

import java.util.Scanner;

public class Task02 {
    /*
    Task02
    Проверка Чётных и Нечётных Чисел:
    Напишите программу, которая запрашивает у пользователя целое число и сообщает,
    является ли это число чётным или нечётным.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Добрый день! Введите ваше Имя пожалуйста ");
        String name = scanner.next();
        System.out.println(name + " Введите пожалуйста любое ЦЕЛОЕ число");
        int number = scanner.nextInt();
        System.out.println(name + "," + " Сейчас наша программа сообщит вам, является ли это число чётным или нечётным!");
        int result = (number / 2) * 2;
        if (number == result) {
            System.out.println(name + ", " + number + " Является чётным числом!");
        } else {
            System.out.println(number + " Является нечётным числом!");
        }
        System.out.println("Спасибо что воспользовались нашей программой!");
        scanner.close();
    }

}

