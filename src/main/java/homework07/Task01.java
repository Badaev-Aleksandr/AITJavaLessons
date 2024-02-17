package homework07;

import java.util.Scanner;

public class Task01 {
    /*
    Напишите программу, которая запросит ввести ваш возраст, и напишет, кем вы являетесь: ребенком, подростком,
взрослым либо стариком.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        if (age < 10) {
            System.out.println("Вы ребенок");
        } else if (age < 18) {
            System.out.println("Вы подросток");
        } else if (age < 65) {
            System.out.println("Вы взрослый");
        } else
            System.out.println("Вы пожилой");
    }
}
