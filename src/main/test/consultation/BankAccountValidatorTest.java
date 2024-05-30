package consultation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"1234567","4567890123345","123456789l"})
    void isValid(String input){
        BankAccountValidator bankAccountValidator = new BankAccountValidator();
        assertFalse(bankAccountValidator.isBankAccountValid(input));
    }
    @Test
    void isValidPositive(){
        BankAccountValidator bankAccountValidator = new BankAccountValidator();
        assertTrue(bankAccountValidator.isBankAccountValid("1234567890"));
    }
}
