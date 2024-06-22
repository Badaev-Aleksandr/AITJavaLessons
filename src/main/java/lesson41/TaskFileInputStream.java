package lesson41;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Напишите программу, которая считывает содержимое файла input.txt
и записывает его в файл output.txt с использованием байтовых
потоков (FileInputStream и FileOutputStream).
 */
@Slf4j
public class TaskFileInputStream {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/input.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/output.txt")) {

            int date;
            while ((date = fileInputStream.read()) != -1) {
                fileOutputStream.write(date);
            }

        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
