package exceptionshandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionMuster {
    private static final Logger LOGGER = LoggerFactory.getLogger(CheckedExceptionMuster.class);

    public static void main(String[] args) {
        try {
            File file = new File("testfile.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException exception) {
            LOGGER.error(exception.getMessage());
        }
    }
}
