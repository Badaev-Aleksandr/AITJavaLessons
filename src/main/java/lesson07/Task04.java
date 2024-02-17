package lesson07;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("Hello")) {
            System.out.println("Hello to you as well!");
        } else {
            System.out.println("Ah you mean like that!");
        }

    }
}

