package homework16;


import My.Methods.MyMethods;

/*
Цель задания:
Понять и применить механизм Varargs для создания функций, способных принимать переменное количество аргументов.
 */
public class Methods {
    public static void main(String[] args) {
        sum(22, 33, 55);
        statisticsOptionOne(1,2,3,0);
        statisticsOptionTwo(1,2,3,0,-5);


    }

    /*
 1. Базовый Уровень: Создание функции суммирования.

    Создайте функцию sum, которая принимает переменное количество целочисленных аргументов и возвращает их сумму.
    Продемонстрируйте работу функции, передав ей различное количество аргументов.
     */
    public static void sum(int... numberN) {
        int sum = 0;
        for (int i : numberN) {
            sum += i;
        }
        System.out.println("The sum of all numbers is: " + sum);

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

    public static void statisticsOptionOne(double... numberN) {
        if (numberN.length == 0) {
            System.out.println("You did not enter a value! ");
        } else {
            double numberMin = numberN[0];
            double numberMax = numberN[0];
            double numberAverage = 0;
            for (double number : numberN) {
                if (number < 0) {
                    System.out.println("Error!!! You entered a negative value!");
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
            if (checkNegativeNumber(numberN)) {
                System.out.println("The minimum value is: " + numberMin);
                System.out.println("The maximum value is: " + numberMax);
                System.out.println("The average value is: " + numberAverage);
            }
        }
    }

    // Метод для проверки на отрицательное число.
    public static boolean checkNegativeNumber(double... numberN) {
        boolean negativeNumber = true;
        for (double number : numberN) {
            if (number < 0) {
                negativeNumber = false;
            }
        }
        return negativeNumber;
    }

    // Второй вариант решения если есть отрицательное число то мы его не учитываем в вычислениях!
    public static void statisticsOptionTwo(double... numberN) {
        if (numberN.length == 0) {
            System.out.println("You did not enter a value! ");
        } else {
            double numberMin = numberN[0];
            double numberMax = numberN[0];
            double numberAverage = 0;
            int negativeNumber = 0;
            for (double number : numberN) {
                if (number < 0) {
                    System.out.println("There is a negative number! We exclude it from the Calculations");
                    negativeNumber += 1;
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
            numberAverage = numberAverage / (numberN.length - negativeNumber);
            System.out.println("The minimum value is: " + numberMin);
            System.out.println("The maximum value is: " + numberMax);
            System.out.println("The average value is: " + numberAverage);
        }
    }
}




