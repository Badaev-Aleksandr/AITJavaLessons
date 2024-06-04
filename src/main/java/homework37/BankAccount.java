package homework37;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    private double balance;
    private String accountNumber;

    public BankAccount() {
    }

    public BankAccount(String accountNumber) throws IllegalArgumentException {
        if (isBankAccountValid(accountNumber)) {
            this.accountNumber = accountNumber;
        } else {
            throw new IllegalArgumentException("Invalid account number: " + accountNumber);
        }
    }

    public boolean isBankAccountValid(String accountNumber) {
        LOGGER.info("Checking number: {}", accountNumber);
        if (accountNumber.length() != 10) {
            LOGGER.error("Invalid account number: {}", accountNumber);
            return false;
        } else {
            for (int i = 0; i < accountNumber.length(); i++) {
                if (!Character.isDigit(accountNumber.charAt(i))) {
                    LOGGER.error("Character [{}] is wrong: {}", accountNumber.charAt(i), accountNumber);
                    return false;
                }
            }
        }
        LOGGER.info("Bank account {} is valid", accountNumber);
        return true;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        LOGGER.info("Replenishment of balance");
        if (amount <= 0) {
            LOGGER.error("Amount is negative: {}", amount);
            throw new IllegalArgumentException("Negative amount!!!");
        }
        balance += amount;
        LOGGER.info("The balance has been replenished by: {}", amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException {
        LOGGER.info("Withdrawing funds from your balance");
        if (amount <= 0) {
            LOGGER.error("Error! You cannot withdraw {} from your balance!", amount);
            throw new IllegalArgumentException("Attempt to withdraw: " + amount);
        }
        if (amount > balance) {
            LOGGER.error("Insufficient funds on balance");
            throw new InsufficientFundsException("You are trying to withdraw from your balance: " + amount +
                    " You are lacking: ", amount - balance);
        }
        balance = balance - amount;
        LOGGER.info("You have withdrawn from balance: {}", amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
