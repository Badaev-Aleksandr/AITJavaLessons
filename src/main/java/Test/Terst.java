package Test;

import java.util.Scanner;

public class Terst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().trim().toLowerCase();
        String reversWord = reversString(str);
        System.out.println(reversWord);
        boolean palindrom = isPalindrom(str, reversWord);
        System.out.println(palindrom);
    }
    //reversString

    public static String reversString(String word) {

        return new StringBuilder(word).reverse().toString();

    }

    //isPalindrom
    public static boolean isPalindrom(String normWord, String reversWord) {
        boolean palindrom;
        if (normWord.equalsIgnoreCase(reversWord)) {
            palindrom = true;
        } else palindrom = false;
        return palindrom;

    }


}
