package lesson40;

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Slf4j
public class JavaIOOutput {
    public static void main(String[] args) {
        String text = "Java IO output";

        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            byte[] bytes = text.getBytes();
            //запись массива байтов
            fileOutputStream.write(bytes, 0, bytes.length);

            //запись одиночного байта
            fileOutputStream.write(bytes[1]);
            log.info("Written output to file: {}", text);

        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
