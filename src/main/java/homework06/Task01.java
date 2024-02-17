package homework06;

import java.util.Scanner;

public class Task01 {
    /*
    Task01: Калькулятор Суммы: Напишите программу,
    которая запрашивает у пользователя два числа и выводит их сумму.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добрый день! Введите ваше Имя пожалуйста ");
        String name = scanner.next();
        System.out.println(name + " Введите ДВА числа пожалуйста ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.println("Спасибо! Сейчас наша программа сложит ваши числа и выведет их на экран");
        int sum = numberOne + numberTwo;
        System.out.println(sum);
        System.out.println("Спасибо что выбрали наш Калькулятор");
        scanner.close();


    }
}