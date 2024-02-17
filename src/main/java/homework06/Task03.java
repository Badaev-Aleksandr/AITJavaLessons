package homework06;

import java.util.Scanner;

public class Task03 {
    /*
    Task03
    Калькулятор Оценок: Создайте программу,
    которая запрашивает у пользователя оценки по пяти предметам,
    затем рассчитывает и выводит средний балл.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добрый день! Введите ваше Имя пожалуйста ");
        String name = scanner.next();
        System.out.println("Введите пожалуйста вашу оценку по МАТЕМАТИКЕ ");
        int mathScore = scanner.nextInt();
        System.out.println("Введите пожалуйста вашу оценку по Химии ");
        int chemistryScore = scanner.nextInt();
        System.out.println("Введите пожалуйста вашу оценку по Информатике ");
        int informaticsScore = scanner.nextInt();
        System.out.println("Введите пожалуйста вашу оценку по Физике ");
        int physicsScore = scanner.nextInt();
        System.out.println("Введите пожалуйста вашу оценку по Спорту ");
        int sportScore = scanner.nextInt();
        System.out.println(name + " Сейчас вы увидите ваш средний балл ");
        double averageScore = (mathScore + chemistryScore + informaticsScore + physicsScore + sportScore) / 5d;
        System.out.println(averageScore);
        scanner.close();

    }

}

