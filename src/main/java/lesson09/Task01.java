package lesson09;
/*
Создайте программу, которая использует цикл `while`
    для чтения неопределенного количества
    чисел с консоли (процесс останавливается,
    когда введено отрицательное число) и
    находит наибольшее и наименьшее из введенных чисел.

 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите множество чисел(более двух), для остановки процесса введите отрицательное число! ");
        int number = scanner.nextInt();

        if(number > 0){
            int min = number;
            int max = number;
            while (number >= 0){

                if(number > max){
                    max = number;
                }
                else if (number < min){
                    min = number;
                }
                System.out.println("Введите число: ");
                number = scanner.nextInt();
            }
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }
        System.out.println("Программа завершена");

        int num;
        int min = 0;
        int max = 0;
        boolean isFirst = true;
        do {

            System.out.println("Введите число: ");
            num = scanner.nextInt();
            if(isFirst) {
                min = num;
                max = num;
                isFirst =  false;
            }
            if(number > max){
                max = number;
            }
            else if (number < min){
                min = number;
            }
        }
        while (num >= 0);
        System.out.println("Программа завершена");
    }
}
