package exceptionshandling;

import exceptions.WrongAgeValueException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        CheckUserDates checkUserDates = new CheckUserDates();
        try {
            checkUserDates.checkAge(160);
        } catch (WrongAgeValueException exception) {
            LOGGER.error(exception.getMessage());
        }
        checkUserDates.checkHumanAge(300);
    }
}
