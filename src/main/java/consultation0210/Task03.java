package consultation0210;

import java.util.Scanner;

/*
Факториал натуральное числа
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = 1;
        for (int i = 2; i <= n; i++){
            res *= i;
        }
        System.out.println(res);
    }
}
