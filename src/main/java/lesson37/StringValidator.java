package lesson37;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringValidator {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringValidator.class);

    public void validateStringLength(String stringToValidate) throws InvalidStringLengthException {
        if (stringToValidate.length() < 5) {
            throw new InvalidStringLengthException("String length is less than 5");
        }
        LOGGER.info("String length is greater than 5 = " + stringToValidate.length());
    }
}
