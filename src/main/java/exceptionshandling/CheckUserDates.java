package exceptionshandling;

import exceptions.WrongAgeValueException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckUserDates {

    private static final Logger LOGGER = LoggerFactory.getLogger(CheckUserDates.class);

    public boolean checkAge(int age) throws WrongAgeValueException {
        if (age <= 0 || age >= 150) {
            LOGGER.error("Возраст не соответствует человеческим критериям {}", age);
            throw new WrongAgeValueException("Возраст не соответствует человеческим критериям");
        }
        return true;
    }

    public boolean checkHumanAge(int age) {

        try {

            if (age <= 0 || age >= 150) {
                LOGGER.error("Возраст не соответствует человеческим критериям {}", age);
                throw new WrongAgeValueException("Возраст не соответствует человеческим критериям");
            }
        } catch (WrongAgeValueException exception) {
            LOGGER.error(exception.getMessage());
            return false;
        }
        return true;
    }
}