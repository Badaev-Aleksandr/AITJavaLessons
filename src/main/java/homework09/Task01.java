package homework09;
/*
Цель: Разработать программу на Java, которая использует циклы и условные операторы
 для выполнения арифметических операций с вводимыми пользователем числами.
 Программа должна предложить пользователю выбрать операцию (сложение, вычитание, умножение, деление)
 и ввести два числа, с которыми будет проведена операция. После вывода результата программа должна спросить пользователя,
 хочет ли он продолжить выполнение операций. Если пользователь отвечает утвердительно,
 программа должна снова предложить выбрать операцию и ввести числа.
 Часть 1: Ввод данных
1.Запросить у пользователя выбор операции.
2.Запросить у пользователя ввод двух чисел.
Часть 2: Выполнение операции
1.Использовать условные операторы (if, else if, else) для определения выбранной операции.
2.Выполнить выбранную арифметическую операцию с введенными числами.
3.Вывести результат операции.
Часть 3: Цикл выполнения
1.Использовать цикл (while или do-while), чтобы повторять выполнение операций, пока пользователь не решит выйти.
2.После вывода результата спросить пользователя, хочет ли он продолжить выполнение операций.
3.Если пользователь отвечает утвердительно, повторить процесс. Если отрицательно — завершить программу.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в Калькулятор операций ");
        boolean resultTrue = true;

        while (resultTrue) {

            while (resultTrue) {

                System.out.println("Выберите операцию (сложение (+), вычитание (-), умножение (*), деление (/))");
                String operators = scanner.next();
                boolean add = operators.equals("+");
                boolean sub = operators.equals("-");
                boolean multiplication = operators.equals("*");
                boolean division = operators.equals("/");

                if (add || sub || multiplication || division) {
                    if (add) {
                        System.out.println("Введите два числа ");
                        double number = scanner.nextDouble();
                        double numberOne = 0;
                        double numberTwo;
                        numberOne = numberOne + number;
                        number = scanner.nextDouble();
                        numberTwo = number;
                        double sum = numberOne + numberTwo;
                        System.out.println(numberOne + " + " + numberTwo + " = " + sum);
                        resultTrue = false;
                    } else if (sub) {
                        System.out.println("Введите два числа ");
                        double number = scanner.nextDouble();
                        double numberOne = 0;
                        double numberTwo;
                        numberOne = number - numberOne;
                        number = scanner.nextDouble();
                        numberTwo = number;
                        double sum = numberOne - numberTwo;
                        System.out.println(numberOne + " - " + numberTwo + " = " + sum);
                        resultTrue = false;
                    } else if (multiplication) {
                        System.out.println("Введите два числа ");
                        double number = scanner.nextDouble();
                        double numberOne = 0;
                        double numberTwo;
                        numberOne = number + numberOne;
                        number = scanner.nextDouble();
                        numberTwo = number;
                        double sum = numberOne * numberTwo;
                        System.out.println(numberOne + " * " + numberTwo + " = " + sum);
                        resultTrue = false;
                    } else if (division) {
                        while (resultTrue) {
                            System.out.println("Введите два числа ");
                            double number = scanner.nextDouble();
                            double numberOne = 0;
                            double numberTwo;
                            if (number != 0) {
                                numberOne = number + numberOne;
                                number = scanner.nextDouble();
                                if (number != 0) {
                                    numberTwo = number;
                                    double sum = numberOne / numberTwo;
                                    System.out.println(numberOne + " / " + numberTwo + " = " + sum);
                                    resultTrue = false;
                                } else
                                    System.out.println("На ноль делить нельзя! ");
                            } else System.out.println("Ноль не может участвовать в делении! ");
                        }
                    }
                } else {
                    System.out.println("Вы ввели не корректное значение! Введите один из знаков: (+) (-) (*) (/) ");
                }
            }
            resultTrue = true;
            boolean resultYes = false;
            while (resultTrue) {
                System.out.println("Хотите ли ВЫ продолжить выполнение операций? Введите: YES или NO");
                String answer = scanner.next();
                boolean resultFalse = false;

                while (resultTrue) {

                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.println("Хорошо мы продолжим вычисления");
                        resultTrue = false;
                        resultYes = true;

                    } else if (answer.equalsIgnoreCase("no")) {
                        resultTrue = false;

                    } else {
                        System.out.println("Вы ввели не корректное значение!");
                        resultTrue = false;
                        resultFalse = true;
                    }
                }
                if (resultFalse) {
                    resultTrue = true;
                }
            }
            if (resultYes) {
                resultTrue = true;
            }
        }
        System.out.println(" До новых встреч ");
        System.out.println(" На создание этой программы ушло 7 часов");
        scanner.close();
    }
}



