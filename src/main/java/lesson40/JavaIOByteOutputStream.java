package lesson40;

import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Slf4j
public class JavaIOByteOutputStream {
    public static void main(String[] args) {
        String text = "Hello Java 2024!!! JavaIOByteOutputStream";
        byte[] bytes = text.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bytes);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        } finally {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println(byteArrayOutputStream.toByteArray());
        for (byte b : byteArrayOutputStream.toByteArray()) {
            System.out.print((char) b);
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream("fileOutput.txt")) {
            //записываем наш файл в текстовый документ
            byteArrayOutputStream.writeTo(fileOutputStream);
        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);

        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }

    }
}
