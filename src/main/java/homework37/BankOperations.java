package homework37;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankOperations {

    public static void main(String[] args) throws InsufficientFundsException, IllegalArgumentException {
        try {
            BankAccount bankAccount = new BankAccount("1234567890");
            bankAccount.deposit(6000);
            bankAccount.withdraw(5000);
            bankAccount.withdraw(1000);
        } catch (InsufficientFundsException exception) {
            log.error("{}{}", exception.getMessage(), exception.getShortage());
        } catch (IllegalArgumentException exception) {
            log.error(exception.getMessage());
        } finally {
            log.info("Completion of the operation");
        }


    }
}
