package lesson38;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        if (isBankAccountValid(accountNumber))
            this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            log.error("Amount can't be negative or 0. Amount: {}", amount);
            throw new IllegalArgumentException("Amount can't be negative. Amount: " + amount);
        }
        balance += amount;
        log.info("Deposit successful. Amount: {}, balance: {}", amount, balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            log.error("Amount can't be negative or 0. Amount: {}", amount);
            throw new IllegalArgumentException("Amount can't be negative or 0. Amount: " + amount);
        }
        if (amount > balance) {
            double shortage = amount - balance;
            log.error("Insufficient funds. Shortage: {}", shortage);
            throw new InsufficientFundsException(shortage);
        }

        balance -= amount;
        log.info("Withdraw successful. Amount: {}, Balance: {}", amount, balance);
    }

    public static boolean isBankAccountValid(String accountNumber) {
        log.info("Validate Bank account {}", accountNumber);
        accountNumber = accountNumber.trim(); //обрезаем пробелы
        if (accountNumber.length() != 10) {
            log.error("Length is wrong {}", accountNumber);
            throw new IllegalArgumentException("Length is wrong " + accountNumber);
        }
        for (int i = 0; i < accountNumber.length(); i++) {
            if (!Character.isDigit(accountNumber.charAt(i))) {
                log.error("Character {} is wrong: {}", accountNumber.charAt(i), accountNumber);
                throw new IllegalArgumentException("Character is wrong:" +accountNumber);
            }
        }
        log.info("Bank account {} is valid", accountNumber);
        return true;
    }
}
