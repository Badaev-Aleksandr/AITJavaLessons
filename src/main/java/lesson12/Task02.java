package lesson12;

import java.util.Scanner;

public class Task02 {
    /*

     */
    public static void main(String[] args) {

        boolean result  = isEven(18);
        System.out.println(result);

    }

    public static boolean isEven (int number) {
       return number % 2 == 0;
    }
}



