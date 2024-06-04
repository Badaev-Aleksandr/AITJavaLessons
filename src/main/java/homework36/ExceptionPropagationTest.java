package homework36;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ExceptionPropagationTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionPropagationTest.class);

    public static void main(String[] args) {
        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();

        try {
            exceptionPropagation.method1();
        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        } finally {
            LOGGER.info("Завершение программы");
        }
    }
}
