package homework12;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для проверки на Палиндром : ");
        String normWord = scanner.next().toLowerCase().trim();
        String revWord = reverseString(normWord); //вызываем метод reverseString(вставляем переменную введенную из сканера)
        // И сохраняем в переменной типа String revWord. Метод reverseString перевернул нам слово и вернул в переменную
        // String revWord
        System.out.println(revWord);
        boolean checkWord = isPalindrome(normWord, revWord); //Вызвали метод isPalindrome(normWord, revWord)
        // вставляем в него два String которые он отправляет в метод где они обрабатываются, в данном случае сравниваются
        System.out.println(checkWord);
        scanner.close();
    }


    public static String reverseString(String word) { // (word <--- normWord)(reverseString(normWord)строка 21)
        return new StringBuilder(word).reverse().toString(); //return(возврат) возвращает нам
        // word в новом значении (перевернутом)(reverse()) в String
    }
    public static boolean isPalindrome(String normWord, String reversWord) {//метод boolean принимает два String
                                        //isPalindrome(normWord, revWord) строка 25
        if (normWord.equalsIgnoreCase(reversWord)) {//сравниваем два полученных слова
            return true;
        } else return false;
    }
}