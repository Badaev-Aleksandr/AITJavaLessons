package lesson38;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankOperations {
    public static void main(String[] args) {

        try {
            BankAccount bankAccount = new BankAccount(0, "1224544787353");
            bankAccount.deposit(250);
            bankAccount.deposit(300);
            bankAccount.deposit(-20);

            bankAccount.withdraw(500);
            bankAccount.withdraw(100);
        } catch (IllegalArgumentException | InsufficientFundsException exception) {
            log.error(exception.getMessage());
        } finally {
            log.info("Operation was ended");
        }
    }
}
