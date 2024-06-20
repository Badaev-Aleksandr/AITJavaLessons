package lesson40;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class TextAnalyser {
    public static void main(String[] args) {
        String textFilePath = "src/main/resources/text.txt";
        Map<String, Integer> textToAnalyse = new HashMap<>();
        try (InputStream inputStream = new FileInputStream(textFilePath)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                char character = (char) data;
                textToAnalyse.put(new String(Character.toChars(character)), textToAnalyse.getOrDefault(character, 0) + 1);
            }
        } catch (FileNotFoundException exception) {
            log.error("Path: {} Exception: {}", textFilePath, exception.getMessage());
        } catch (IOException exception) {
            log.error("Error open file {}. Exception: {}", textFilePath, exception.getMessage());
        }
        textToAnalyse.forEach((character, count) -> {
            System.out.println(character + " - " + count);
        });


    }
}
