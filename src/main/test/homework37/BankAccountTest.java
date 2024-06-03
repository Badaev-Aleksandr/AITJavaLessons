package homework37;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {
    private LogCaptor logCaptor = LogCaptor.forClass(BankAccount.class);
    BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

    @Test
    void testExceptionDeposit() {
        // Проверка на добавления ноля к балансу
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(0
            );
        });
    }

    @Test
    void testExceptionWithdraw() {
        bankAccount.deposit(1000);
        //Проверка на снятие суммы больше чем на счету
        assertThrows(InsufficientFundsException.class, () -> {
            bankAccount.withdraw(2000);
        });

        // Проверка на снятие ноля с баланса
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(0);
        });
    }

    //Проверка на Logger
    @Test
    void testConstructorValidNumberAccount() {
        BankAccount bankAccountValid = new BankAccount("1234567890");
        logCaptor.setLogLevelToInfo();
        assertTrue(logCaptor.getInfoLogs().contains("Checking number: 1234567890"));
        assertTrue(logCaptor.getInfoLogs().contains("Account number 1234567890 is ok"));
    }

    //Проверка конструктора на исключение входящих чисел
    @ParameterizedTest
    @ValueSource(strings = {"123456789O", "l234567890", "123456789l"})
    void testBankAccountConstructorException(String input) {
        assertThrows(NumberFormatException.class, ()->{
            new BankAccount(input);
        });
    }
    //Проверка конструктора на исключение количества чисел должно быть 10
    @ParameterizedTest
    @ValueSource(strings = {"1564jdd", "5k9ahd599", "6456565ddddd"})
    void testBankAccountConstructorIllegalArgumentException(String input){
        assertThrows(IllegalArgumentException.class, ()-> {
           new BankAccount(input);
        });
    }
}

