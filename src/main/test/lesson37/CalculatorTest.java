package lesson37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(20, 0);
        });
    }
    @Test
    void testDivideByOne(){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.divide(20,10));
    }
}
