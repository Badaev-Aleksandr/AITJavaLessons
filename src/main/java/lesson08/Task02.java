package lesson08;

import java.util.Scanner;
/*
Посчитать сумму всех вводимых чисел пока не будет введен 0
 */
public class Task02 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько угодно чисел чтобы посчитать сумму (0 для остановки)");
        int sum =0;
        int n = scanner.nextInt();
        // пока N не равно 0
        while (n != 0){
            // прибавляем N к сумме
            sum += n;
            // считываем новое значение для N
            n = scanner.nextInt();

        }
        System.out.println("Ответ: "+ sum);
    }
}