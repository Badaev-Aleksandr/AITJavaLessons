package lesson37;

public class Calculator {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException();
        }
        return dividend / divisor;
    }
}
