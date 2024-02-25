package homework12;

/*
Задание 1
Задание: Напишите программу на Java, которая демонстрирует работу с методами.
Ваша программа должна включать метод calculateArea, который принимает в качестве аргументов
значения типа double: длину и ширину прямоугольника, и возвращает значение его площади.
Также должен быть реализован метод calculatePerimeter, принимающий те же аргументы и
возвращающий периметр прямоугольника. Главный метод (main) должен считывать значения длины и ширины,
переданные пользователем, вызывать оба эти метода для расчета площади и периметра,
и выводить результаты расчетов на экран.
 */
public class JavaMethodsTask01 {
    public static void main(String[] args) {
        double p = calculatePerimeter(234,345);
        System.out.println(p);
        double s = calculateArea(345,566);
        System.out.println(s);
    }
    public static double calculateArea(double a, double b) {
        return a * b;
    }
    public static double calculatePerimeter(double a, double b) {
        return 2 * (a + b);
    }
}
