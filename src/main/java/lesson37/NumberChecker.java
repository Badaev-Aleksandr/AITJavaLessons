package lesson37;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberChecker {

    private static final Logger LOGGER = LoggerFactory.getLogger(NumberChecker.class);

    public void checkNumber(String numberToCheck) {
        LOGGER.info("Checking number: " + numberToCheck);
        try {
            int result = Integer.parseInt(numberToCheck);
            LOGGER.info("Result of checking number: " + result);
        } catch (NumberFormatException exception) {
            LOGGER.error(exception.getMessage());
            throw new NumberFormatException("Invalid number: " + numberToCheck);
        }
        finally {
            LOGGER.info("Завершено: "+ numberToCheck);
        }
    }

    public void checkNumber2(String numberToCheck) throws NumberFormatException{
        LOGGER.info("Checking number: " + numberToCheck);
        int result = Integer.parseInt(numberToCheck);
        LOGGER.info("Checking result: " + result);

    }
}
