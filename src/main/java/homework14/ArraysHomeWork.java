package homework14;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysHomeWork {

    /*
  Задача 1: Список хобби
  Задание: Создайте массив строк, который содержит список хобби (например, "рисование", "программирование", "велоспорт").
   Выведите все хобби из массива на экран.
   */
    public static String[] myHobby = {"swim", "programming", "drone", "split"};

    public static void main(String[] args) {
        System.out.println("---------------1----------------");
        System.out.println("My Hobby: " + Arrays.toString(myHobby)); // Arrays.toString() ---> Выводит в одну строку!

        /*
Задача 2: Поиск хобби
Задание: Дан массив хобби (как в задаче 1). Напишите программу, которая ищет в массиве заданное хобби
и выводит на экран сообщение о том, есть ли оно в списке.
         */
        System.out.println("---------------2----------------");
        System.out.print("Enter hobby name: ");
        Scanner scanner = new Scanner(System.in);
        String hobby = scanner.next();   // Вводим название хобби

        int counter = 0;
        for (int i = 0; i < myHobby.length; i++) {
            if (hobby.equalsIgnoreCase(myHobby[i])) {  // Сравниваем введенное хобби со списком хобби
                counter = 1; //счетчик если есть совпадение
                break; // прерываем поиск если нашли совпадение
            }
        }
        if (counter == 1) {
            System.out.println("We have this hobby on the list");
        } else System.out.println("We have NOT this hobby on the list");
        System.out.println("---------------3----------------");
        /*
        Задача 3: Любимое хобби
        Задание: Используя массив хобби (как в задаче 1), попросите пользователя ввести номер своего любимого хобби
        из списка. Выведите на экран название выбранного хобби.
         */
        int cycle = 0;
       do {
           System.out.println("Enter the number 1-4 of your favorite hobby from the list: ");
           while (!scanner.hasNextInt()) {
               System.out.println("You did not enter a number");
               System.out.println("Pleas enter a number:");
               scanner.next();
           }
           int hobbyNumber = scanner.nextInt();
           if (hobbyNumber > 0 && hobbyNumber < 5) {
               System.out.println("Your favorite hobby number " + hobbyNumber + " is: " + myHobby[hobbyNumber - 1]);
               cycle = 1;
           } else {
               System.out.println("Your number does not match the number of our numbers Hobby in the list!");
           }
       }while (cycle==0);
        System.out.println("---------------4----------------");
            /*
            Задача 4: Добавление хобби
            Задание: Напишите программу, которая позволяет добавить новое хобби в существующий массив хобби.
            Поскольку размер массива в Java фиксирован, вам нужно будет создать новый массив большего размера
            и скопировать в него элементы из старого массива, добавив новое хобби.
            */
        String[] newMyHobby = {"running", "shooting", "hunting", "snowboard"};
        String[] newListHobby = new String[myHobby.length + newMyHobby.length];
        System.arraycopy(myHobby, 0, newListHobby, 0, myHobby.length);
        System.arraycopy(newMyHobby, 0, newListHobby, myHobby.length, newMyHobby.length);
        System.out.println("My new Hobby is: " + Arrays.toString(newListHobby));
        System.out.println("---------------5----------------");
            /*
         Задача 5: Рейтинг хобби
         Задание: Создайте два массива: один для хобби (как в задаче 1) и один для рейтинга каждого хобби (целые числа).
         Напишите программу, которая выводит хобби и их рейтинги в виде списка.
             */
        int[] reting = new int[8];

    }
}




