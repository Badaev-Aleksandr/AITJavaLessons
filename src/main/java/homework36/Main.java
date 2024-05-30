package homework36;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        StringValidator stringValidator = new StringValidator();

        try {
            stringValidator.StringValidator("Hell");
        }catch (InvalidStringLengthException exception){
            LOGGER.error(exception.getMessage());
        }finally {
            LOGGER.info("Завершение программы");
        }
    }
}
