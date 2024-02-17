package lesson08;

import java.util.Scanner;
/*
Написать программу, которая просит ввести натуральное число, и переспрашивает пока не будет введено правильно
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        // выполняем следующий код:
        do {
            // вывести сообщение
            System.out.println("Введите натуральное число");
            // считать значение
            n = scanner.nextInt();
            // это все пока введенное число меньше или равно нулю
        } while (n <= 0);
        System.out.println("Спасибо");
    }
}

