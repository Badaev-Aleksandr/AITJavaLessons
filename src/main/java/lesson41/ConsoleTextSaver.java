package lesson41;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Напишите программу, которая считывает строки с консоли до ввода слова
"exit" и записывает их в файл output.txt.
 */
@Slf4j
public class ConsoleTextSaver {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fileWriter = new FileWriter("src/main/resources/output.txt")) {
            System.out.println("Введите текст или exit для завершения");
            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(line + "\r\n");
            }
            log.info("Ввод с консоли успешно");

        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
