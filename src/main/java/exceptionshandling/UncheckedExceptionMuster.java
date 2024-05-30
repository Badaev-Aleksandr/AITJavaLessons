package exceptionshandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class UncheckedExceptionMuster {

    private static final Logger LOGGER = LoggerFactory.getLogger(UncheckedExceptionMuster.class);

    public static void main(String[] args) {
        List<String> itBigBosses = new ArrayList<>();
        itBigBosses.add("Apple");
        itBigBosses.add("Samsung");
        String result = "";
        try {
            result = itBigBosses.get(10);
        } catch (IndexOutOfBoundsException exception) {
            LOGGER.error(exception.getMessage());
            result = "Неправильный индекс";
        }finally {
            LOGGER.info(result);
        }

    }
}
