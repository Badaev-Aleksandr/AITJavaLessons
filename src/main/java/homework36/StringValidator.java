package homework36;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringValidator {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringValidator.class);


    public void StringValidator(String str) throws InvalidStringLengthException {
        LOGGER.info("Проверка строки на количество символов");
        if (str.length() < 5) {
            LOGGER.error("Строка имеет менее 5 символов!!! Result: {}",str.length());
            throw new InvalidStringLengthException("Строка имеет менее 5 символов!!!");
        }
        LOGGER.info("В строке {} символов.",str.length());
    }

}
