package homework16;


/*
Цель задания:
Понять и применить механизм Varargs для создания функций, способных принимать переменное количество аргументов.
 */
public class Methods {
    public static void main(String[] args) {
        System.out.println("-----------------Task01-----------------");
        sum();
        System.out.println("-----------------Task02-----------------");
        statistics();
    }

    /*
 1. Базовый Уровень: Создание функции суммирования.

    Создайте функцию sum, которая принимает переменное количество целочисленных аргументов и возвращает их сумму.
    Продемонстрируйте работу функции, передав ей различное количество аргументов.
     */
    public static void sum(int... numberN) {
        while (true) {
            if (numberN.length == 0) {
                System.out.println("You did not enter a value! ");
                break;
            }
            int sum = 0;
            for (int i : numberN) {
                sum += i;
            }
            System.out.println("The sum of all numbers is: " + sum);
            break;
        }
    }
   /*
   2. Средний Уровень: Статистический Анализатор.

Реализуйте функцию statistics, принимающую переменное количество вещественных чисел (double) и
выводящую на экран базовую статистику: минимальное значение, максимальное значение, среднее значение.
Для расчета используйте Varargs. Обеспечьте обработку случая, когда аргументы не передаются
(выведите соответствующее сообщение).
Дополнительно:
Попробуйте добавить в свою программу обработку ошибок, например, проверку на отрицательные числа при
суммировании или при расчете статистики.
    */

    public static void statistics(double... numberN) {
        while (true) {
            if (numberN.length == 0) {
                System.out.println("You did not enter a value! ");
                break;
            }
            double numberMin = numberN[0];
            double numberMax = numberN[0];
            double numberAverage = 0;
            int counter = 0;
            for (double number : numberN) {
                if (number < 0) {
                    System.out.println("Error!!! You entered a negative value!");
                    counter++;
                    break;
                } else {

                    if (number < numberMin) {
                        numberMin = number;
                    }
                    if (number > numberMax) {
                        numberMax = number;
                    }
                    numberAverage += number;
                }
            }
            numberAverage = numberAverage / numberN.length;
            if (counter == 0) {
                System.out.println("The minimum value is: " + numberMin);
                System.out.println("The maximum value is: " + numberMax);
                System.out.println("The average value is: " + numberAverage);
                break;
            }
            break;
        }
    }
}

