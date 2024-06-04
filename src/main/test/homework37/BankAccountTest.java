package homework37;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {
    private LogCaptor logCaptor = LogCaptor.forClass(BankAccount.class);
    BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

    //Проверка на добавления ноля к балансу
    @Test
    void testIllegalArgumentExceptionDeposit() {
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(0
            );
        });
    }

    //Проверка баланса на добавление суммы
    @Test
    void testDepositPositive() {
        bankAccount.deposit(1000);
        assertEquals(1000, bankAccount.getBalance());
    }

    //Проверка баланса после снятия суммы
    @Test
    void testWithdrawPositive() throws InsufficientFundsException {
        bankAccount.deposit(2000);
        bankAccount.withdraw(1000);
        assertEquals(1000,bankAccount.getBalance());
    }

    //Проверка на снятие ноля с баланса
    @Test
    void testIllegalArgumentExceptionWithdraw() {
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(0);
        });
    }

    //Проверка на снятие суммы больше чем на счету
    @Test
    void testInsufficientFundsExceptionWithdraw() {
        bankAccount.deposit(1000);
        assertThrows(InsufficientFundsException.class, () -> {
            bankAccount.withdraw(2000);
        });
    }

    //Проверка на Logger
    @Test
    void testConstructorValidNumberAccount() {
        BankAccount bankAccountValid = new BankAccount("1234567890");
        logCaptor.setLogLevelToInfo();
        assertTrue(logCaptor.getInfoLogs().contains("Checking number: 1234567890"));
        assertTrue(logCaptor.getInfoLogs().contains("Bank account 1234567890 is valid"));
    }

    //Проверка конструктора на исключение входящих чисел
    @ParameterizedTest
    @ValueSource(strings = {"123456789O", "l234567890", "123456789l"})
    void testBankAccountConstructorException(String input) {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(input);
        });
    }

    //Проверка валидации банковского номера позитивные номера
    @ParameterizedTest
    @ValueSource(strings = {"1679584603", "8527419630", "6402793825"})
    void testisBankAccountValidPositive(String input) {
        assertTrue(bankAccount.isBankAccountValid(input));
    }

    //Проверка валидации банковского номера негативные номера
    @ParameterizedTest
    @ValueSource(strings = {"167603", "85274AA19630", "64027938LGE25"})
    void testisBankAccountValidNegative(String input) {
        assertFalse(bankAccount.isBankAccountValid(input));
    }
}

