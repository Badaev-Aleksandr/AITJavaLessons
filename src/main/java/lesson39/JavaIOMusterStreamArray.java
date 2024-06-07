package lesson39;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class JavaIOMusterStreamArray {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("passwords.txt")) {
            byte[] data = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(data)) != -1) {
                String text = new String(data, 0, bytesRead);
                System.out.print(text);
            }
        } catch (IOException exception) {
            log.error(exception.getMessage());
        }

    }
}
