package lesson38;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BankAccountTest {


    @ParameterizedTest
    @CsvFileSource(resources = "/deposit.csv",numLinesToSkip = 1)
    void testBalanceAddAmountFromCSV(double amount, double expectedBalance){

    }
}
