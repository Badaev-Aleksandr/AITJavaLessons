package lesson12;
/*
 * Напишите программу, которая принимает на вход расширение файла
 * (например, "pdf", "docx", "jpg")
 * и выводит тип файла (Документ, Изображение и т.д.).
 * Используйте `switch-case` для обработки разных расширений.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла которое вы хотите загрузить");
        String file = scanner.next().toLowerCase();
        String fileTyp = switch (file.trim()){
            case "pdf" -> "Документ";
            case "docx" -> "Файл Документ";
            case  "jpq" -> "Изображение";
            default -> "Не корректным ";

        };
        System.out.println(" Ваш введенный файл " + file + " Является " +fileTyp);

        scanner.close();
    }
}
