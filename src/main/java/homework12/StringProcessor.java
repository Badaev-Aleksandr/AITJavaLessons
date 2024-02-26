package homework12;

/*
Задание 2 (Сложное)
Тема: Расширенная работа с методами в Java.

Задание: Разработайте класс StringProcessor, который будет предоставлять статические методы для работы со строками:

1. Метод reverseString, который принимает строку и возвращает её в перевёрнутом виде.
2. Метод isPalindrome, который проверяет, является ли переданное слово палиндромом (читается одинаково в обоих направлениях).
 Метод должен возвращать булево значение.
 */
public class StringProcessor {

    public static void main(String[] args) {
        reverseString(new String("Дед"));
        boolean checkWord = isPalindrome();
        System.out.println(checkWord);
    }

    static String normWord;
    static String reverseWord;

    public static void reverseString(String word) {
        normWord = word;
        String sb = new StringBuilder(word).reverse().toString();
        System.out.println(sb);
        reverseWord = sb;
    }

    public static boolean isPalindrome() {
        if (normWord.equalsIgnoreCase(reverseWord)) {
            return true;
        } else return false;
    }
}