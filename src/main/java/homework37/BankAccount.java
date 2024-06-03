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
        LOGGER.info("Checking number: {}", accountNumber);
        if (accountNumber.length() == 10) {
            try {
                int checkingValidity = Integer.parseInt(accountNumber);
                this.accountNumber = String.valueOf(checkingValidity);
                LOGGER.info("Account number {} is ok", accountNumber);
            } catch (NumberFormatException exception) {
                LOGGER.error(exception.getMessage());
                throw new NumberFormatException("Invalid account number: " + accountNumber);
            }
        } else {
            LOGGER.error("Invalid account number: {}", accountNumber);
            throw new IllegalArgumentException("Invalid account number, less than 10 characters: " + accountNumber);
        }

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
        if (amount == 0) {
            LOGGER.error("Error! You cannot withdraw 0 from your balance!");
            throw new IllegalArgumentException("Attempt to withdraw 0");
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
