package homework37;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankOperations {

    public static void main(String[] args) throws InsufficientFundsException, IllegalArgumentException {
        try {
            BankAccount bankAccount = new BankAccount("2547895126");
            bankAccount.deposit(10000);
            bankAccount.withdraw(7000);
            bankAccount.withdraw(5000);
        } catch (InsufficientFundsException exception) {
            log.error("{}{}", exception.getMessage(), exception.getShortage());
        } catch (IllegalArgumentException exception) {
            log.error(exception.getMessage());
        } finally {
            log.info("Completion of the operation");
        }


    }
}
