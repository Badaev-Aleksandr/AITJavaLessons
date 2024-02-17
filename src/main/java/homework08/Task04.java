package homework08;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = 0;
        int sum = 0;
        while (n >= 1){
            res = n % 10;
            sum = sum + res;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
