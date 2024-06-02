package lesson37;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker();
        StringValidator stringValidator = new StringValidator();
        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();
        try {
           // exceptionPropagation.method1();
            stringValidator.validateStringLength("123456");
            numberChecker.checkNumber2("444456");
            numberChecker.checkNumber("123Y");
        } catch (NumberFormatException |  InvalidStringLengthException exception) {
            LOGGER.error(exception.getMessage());
        } finally {
            LOGGER.info("End of program");
        }


    }
}
