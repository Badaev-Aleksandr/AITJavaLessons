package homework07;

import java.util.Scanner;

public class Task02 {
    /*
    Напишите программу для тестирования знаний.
Программа должна задать три вопроса связанных с программированием.

Ответом на первый вопрос должно быть да/нет,
на второй вопрос один вариант ответа из трех (a, b, c),
на третий вопрос открытый ответ (надо ввести ответ вручную)

Если пользователь правильно ответил хотя бы на два вопроса, вывести сообщение "Вы хорошо знаете программирование!",
в противном случае вывести "Вам нужно учиться больше!".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java это язык программирования? введите 1.Да или 2.Нет");
        int questionOne = scanner.nextInt();
        System.out.print("Выберите правильный вариант: a (int = Hello);  b (boolean = 10); c (char = \"A\")");
        String questionTwo = scanner.next();
        System.out.println("Какая онлайн школа по программированию лучшая?");
        String questionThree = scanner.next();

        if ((questionOne == 1 && questionTwo.equals("c")) || (questionOne == 1 && questionThree.equals("AIT")) ||
                (questionTwo.equals("c") && questionThree.equals("AIT"))) {
            System.out.println("Вы хорошо знаете программирование!");
        } else {
            System.out.println("Вам нужно учиться больше");
        }
    }
}