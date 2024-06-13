package homework39;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class JavaStreamTask {
    public static void main(String[] args) {

        InputStream inputStreamOne = null;
        InputStream inputStreamTwo = null;
        try {
            inputStreamOne = new FileInputStream("poem.txt");
            symbolSearch(inputStreamOne);

        } catch (IOException exception) {
            log.error(exception.getMessage());
        }
        try {
            inputStreamTwo = new FileInputStream("poem_copy_exception.txt");
            inputStreamOne = new FileInputStream("poem.txt");
           //  проверяем файлы на идентичность
            if (identical(inputStreamOne, inputStreamTwo)) {
                log.info("Files are identical");
            } else {
                log.error("The files are not identical.");
            }
        } catch (IOException exception) {
            log.error(exception.getMessage());
        } finally {
            try {
                if (inputStreamOne != null) {
                    inputStreamOne.close();
                }
                if (inputStreamTwo != null) {
                    inputStreamTwo.close();
                }

            } catch (IOException | NullPointerException exception) {
                log.error(exception.getMessage());
            }
        }
    }

    public static void symbolSearch(InputStream inputStreamOne) throws IOException {
        Map<Character, Integer> symbolMap = new HashMap<>();

        int data;
        //запускаем цикл чтения файла на поиск символов в тесте
        while ((data = inputStreamOne.read()) != -1) {
            char character = (char) data;
            symbolMap.put(character, symbolMap.getOrDefault(character, 0) + 1);

            // Выводим внутренности файла на экран
            System.out.print((char) data);
        }
        System.out.println(" ");
        // вывод на экран количество встречающихся символов в файле
        for (Map.Entry<Character, Integer> symbol : symbolMap.entrySet()) {
            log.info("Symbol {}, quantity {}", symbol.getKey(), symbol.getValue());
        }

    }

    public static boolean identical(InputStream inputStreamOne, InputStream inputStreamTwo) throws IOException {
        int data1;
        int data2;
        int position = 0;
        boolean mismatch = false;
        // запускаем цикл сравнения двух файлов по каждому символу
        while ((data1 = inputStreamOne.read()) != -1 && (data2 = inputStreamTwo.read()) != -1) {
            position++;
            if (data1 != data2) {
                log.error("Mismatch in position {}", position);
                mismatch = true;
            }
        }
        if (!mismatch) {
            return true;
        }
        return false;
    }
}
