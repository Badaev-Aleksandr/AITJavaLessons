package consultation0217;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
      boolean  validInput = false;

        while (!validInput) {

            System.out.println("Введите целое число от 0 до 100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Ошибка: Введено не верное значение.");
                scanner.next();
            }

        }// Закрытие контроля ввода 1
    }
}
