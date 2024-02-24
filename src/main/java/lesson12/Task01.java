package lesson12;

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
