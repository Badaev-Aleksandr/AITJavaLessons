package homework06;

import java.util.Scanner;

public class Task05 {
    /*
 Задание со звездочкой: Расписание уроков

Вы разрабатываете систему для школы, которая помогает определять,
идет ли в данный момент урок, перемена или пора обедать.

В школе есть следующий режим:
Уроки идут с 8:00 до 13:00.
Каждый урок длится 45 минут.
После каждого урока (кроме последнего) идет перемена длительностью 15 минут.
Обеденный перерыв начинается в 13:00 и длится ровно 30 минут.
Напишите программу, которая принимает в качестве входных данных текущее время
(часы и минуты) и выводит одно из следующих сообщений:

"Урок" - если сейчас идет урок.
"Перемена" - если сейчас перемена между уроками.
"Обед" - если сейчас обеденный перерыв.
"Свободное время" - если сейчас не уроки, перемены и не время обеда.
Указания:

Используйте логические операторы (&&, ||, !) для определения текущего статуса времени.
Учитывайте, что время представляется в 24-часовом формате.
Рассмотрите все возможные случаи и убедитесь,
что ваша программа корректно обрабатывает крайние случаи (например, ровно 8:00 или 13:00).
  */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите время чтобы определить режим в школе на данный период времени");
        System.out.println("Введите час");
        int hour = scanner.nextInt();
        System.out.println("Введите минуты");
        int minutes = scanner.nextInt();
        System.out.println("Вы ввели " + hour + ":" + minutes);
        scanner.close();
        boolean lesson = (hour >= 8 && hour <= 12) && (minutes >= 1 && minutes <= 44);
        boolean startLesson = hour == 8 && minutes == 0;
        boolean pause = (hour >= 8 && hour <= 11) && (minutes >= 46 && minutes <= 59);
        boolean pauseChangeFreeTime = hour == 12 && minutes == 45;
        boolean lessonChangePause = (hour >= 8 && hour <= 12) && (minutes == 45);
        boolean pauseChangeLesson = (hour >= 9 && hour <= 12) && (minutes == 0);
        boolean dinner = (hour == 13) && (minutes >= 1 && minutes <= 29);
        boolean pauseChangeDinner = hour == 13 && minutes == 0;
        boolean dinnerChangeFreeTime = hour == 13 && minutes == 30;
        boolean freeTime = (hour < 25 && minutes < 60) || hour >= 12 && (minutes >= 46 && minutes <= 59);

        if (startLesson) {
            System.out.println("Начало первого Урока");
        } else if (pauseChangeFreeTime) {
            System.out.println("Заканчивается последний Урок и начинается Свободное Время 15мин");
        } else if (lesson) {
            System.out.println("Урок");
        } else if (pause) {
            System.out.println("Перемена");
        } else if (lessonChangePause) {
            System.out.println("Сейчас заканчивается Урок и начинается Пауза 15мин");
        } else if (pauseChangeLesson) {
            System.out.println("Сейчас заканчивается Пауза и начинается Урок 45мин");
        } else if (pauseChangeDinner) {
            System.out.println("Заканчивается Свободное Время и начинается Обед 30мин");
        } else if (dinnerChangeFreeTime) {
            System.out.println("Обед заканчивается и начинается Свободное время");
        } else if (dinner) {
            System.out.println("Обед");
        } else if (freeTime) {
            System.out.println("Свободное время");
        } else {
            System.out.println("ERROR!!! Вы ввели не корректное ВРЕМЯ");
        }
    }
}