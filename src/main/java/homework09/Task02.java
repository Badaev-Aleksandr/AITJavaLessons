package homework09;

import java.util.Scanner;

/*
Задание: Программа "Угадай число" (со звездочкой)
Цель: Разработать консольную игру, в которой пользователь должен
угадать случайно сгенерированное число в пределах от 1 до 100.
Программа должна давать подсказки после каждой попытки, сообщая,
больше или меньше введенное число, чем загаданное.
Игра продолжается до тех пор, пока число не будет угадано.
После угадывания, программа должна вывести количество попыток,
потраченных на угадывание, и предложить пользователю сыграть еще раз.

Шаги реализации:

1. Генерация случайного числа.
Использовать Math.random() для генерации случайного числа в заданном диапазоне (1-100).

2. Основной игровой цикл.
Использовать цикл (do-while или while), чтобы запросить у пользователя ввод числа до тех пор,
пока не будет угадано загаданное число.

3. Сравнение чисел и подсказки.
Использовать условные операторы для сравнения введенного числа с загаданным и вывода подсказок
 ("слишком большое", "слишком маленькое").

4. Подсчет попыток.
Вести подсчет числа попыток, которые пользователь сделал для угадывания числа.

5. Окончание игры и предложение повторить.
После угадывания числа вывести количество попыток и спросить пользователя, хочет ли он сыграть еще раз.
Если да, игра начинается заново с генерации нового случайного числа; если нет — программа завершается.

Дополнительные условия:
Обеспечить обработку ввода, чтобы программа принимала только числа и корректно реагировала на некорректный ввод
(например, буквы или символы).
Можно добавить функционал для ограничения максимального количества попыток.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        String a = "\uD83E\uDD29";
        String b = "\uD83E\uDD28";
        String c = "\uD83E\uDEE8";
        System.out.println("Добро пожаловать в игру --------Угадай Число-------- ");
        while (repeat) {
            int randomNumber = (int) (Math.random()*100) + 1;
            boolean cycle = true;
            int shot = 0;
            System.out.println("У Вас есть 7 попыток чтобы Угадать Число");
            System.out.println("Введите число чтобы угадать Загаданное число Компьютером от 0 до 100");
            while (cycle) {
                if (shot < 7) {
                    if (scanner.hasNextInt()) {
                        int answerOne = scanner.nextInt();

                        if (answerOne > randomNumber) {
                            System.out.println("слишком большое");
                            System.out.println("Попробуйте снова");
                            shot++;
                        }else if (answerOne < randomNumber) {
                            System.out.println("слишком маленькое");
                            System.out.println("Попробуйте снова");
                            shot++;
                        }else if (answerOne == randomNumber) {
                            System.out.println(a + " " + "Вы угадали" + " " + a);
                            System.out.println("Вы использовали " + shot + " Попыток чтобы угадать Число");
                            while (cycle) {
                                System.out.println("Хотите ли ВЫ продолжить Игру ? Введите: YES или NO" + b);
                                String answerTwo = scanner.next();
                                if (answerTwo.equalsIgnoreCase("yes")) {
                                    System.out.println("Хорошо мы продолжаем Игру" + " " + a);
                                    cycle = false;
                                } else if (answerTwo.equalsIgnoreCase("no")) {
                                    repeat = false;
                                    cycle = false;
                                } else {
                                    System.out.println(c + "Вы ввели не корректное значение!" + c);
                                }
                            }
                        }
                    } else {
                        System.out.println(c + "ERROR!!! Вы ввели не число" + c);
                        System.out.println("Введите число чтобы Играть !");
                        scanner.next();
                    }
                } else {
                    System.out.println("Упсс Вы превысили количество разрешенных попыток! Вы проиграли!");
                    while (cycle) {
                        System.out.println("Хотите ли ВЫ продолжить Игру ? Введите: YES или NO" + b);
                        String answerTwo = scanner.next();
                        if (answerTwo.equalsIgnoreCase("yes")) {
                            System.out.println("Хорошо мы продолжаем Игру" + " " + a);
                            cycle = false;
                        } else if (answerTwo.equalsIgnoreCase("no")) {
                            repeat = false;
                            cycle = false;
                        } else {
                            System.out.println(c + "Вы ввели не корректное значение!" + c);
                        }
                    }
                }
            }
        }
        System.out.println(" Спасибо за игру");
        System.out.println("До новых встреч ");
        scanner.close();
    }
}