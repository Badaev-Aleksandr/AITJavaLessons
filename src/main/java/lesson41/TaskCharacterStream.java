package lesson41;

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
public class TaskCharacterStream {
    /*
    Напишите программу, которая считывает содержимое текстового файла input.txt и записывает его в
    файл output.txt с использованием символьных потоков (FileReader и FileWriter).
     */
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src/main/resources/input.txt");
             FileWriter fileWriter = new FileWriter("src/main/resources/output.txt")) {
            int data;
            while ((data = fileReader.read()) != -1) {
                fileWriter.write(data);
            }

        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
