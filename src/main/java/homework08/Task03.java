package homework08;

import java.sql.PreparedStatement;
import java.util.Scanner;

/*
Пользователь вводит число, посчитать сумму всех натуральных чисел, которые идут до него включительно.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println(res);
    }
}
