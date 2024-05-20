package lesson30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    public void checkAddTwoPositiveNumberPositive(){
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.add(20,5));
    }
    @Test
    public void checkAddTwoNegativeNumberPositive(){
        Calculator calculator = new Calculator();
        assertEquals(-70, calculator.add(-20,-50));
    }
    @Test
    public void checkAddTwoZeroNumberPositive(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(-0,0));
    }
}
