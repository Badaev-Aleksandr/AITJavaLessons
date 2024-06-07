package lesson39;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class JavaIOMuster {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("passwords.txt");
            int data;
            while ((data = inputStream.read()) != -1) {
                //log.info(new String(Character.toChars(data)));
                System.out.print(new String(Character.toChars(data)));
            }
        } catch (FileNotFoundException exception) {
            log.error("File not found", exception.getMessage());
        } catch (IOException e) {
            log.error("I/O error", e.getMessage());
        } finally {
            try {
                inputStream.close();
            } catch (IOException exception) {
                log.error(exception.getMessage());
            }
        }
    }
}
