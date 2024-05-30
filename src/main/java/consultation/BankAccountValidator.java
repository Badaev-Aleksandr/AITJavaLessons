package consultation;
/*
Напишите программу, которая проверяет, является ли введённый номер банковского счёта корректным.
Номер счёта должен быть строкой, состоящей из 10 цифр. Если номер счёта не соответствует этим условиям,
программа должна выбрасывать и обрабатывать исключение.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class BankAccountValidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccountValidator.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String accountNumber = scanner.nextLine();

        isBankAccountValid(accountNumber);
    }

    public static boolean isBankAccountValid(String accountNumber) {
        LOGGER.info("Validiere Bank account {}", accountNumber);
        accountNumber = accountNumber.trim(); //обрезаем пробелы
        if (accountNumber.length() != 10) {
            LOGGER.error("Length is wrong {}", accountNumber);
            return false;
        }
        for (int i = 0; i < accountNumber.length(); i++) {
            if (!Character.isDigit(accountNumber.charAt(i))) {
                LOGGER.error("Character {} is wrong: {}", accountNumber.charAt(i), accountNumber);
                return false;
            }
        }
        LOGGER.info("Bank account {} is valid", accountNumber);
        return true;
    }

}
