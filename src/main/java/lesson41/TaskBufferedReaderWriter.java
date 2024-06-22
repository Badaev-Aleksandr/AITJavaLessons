package lesson41;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Напишите программу, которая считывает содержимое текстового файла input.txt и записывает его в
файл output.txt с использованием буферизированных потоков (BufferedReader и BufferedWriter).
 */
@Slf4j
public class TaskBufferedReaderWriter {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/output.txt"))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            log.info("ok");
        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
