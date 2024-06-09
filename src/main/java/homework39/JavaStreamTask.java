package homework39;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class JavaStreamTask {
    public static void main(String[] args) {
        InputStream inputStreamOne = null;
        InputStream inputStreamTwo = null;
        try {
            inputStreamOne = new FileInputStream("poem.txt");
            symbolSearch_A_B_C(inputStreamOne);
        } catch (IOException exception) {
            log.error(exception.getMessage());
        }
        try {
            inputStreamTwo = new FileInputStream("poem_copy_exception.txt");
            inputStreamOne = new FileInputStream("poem.txt");
            // проверяем файлы на идентичность
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

    public static void symbolSearch_A_B_C(InputStream inputStreamOne) throws IOException {
        int counter_a = 0;
        int counter_b = 0;
        int counter_c = 0;
        char a = 'a';
        char b = 'b';
        char c = 'c';
        int data;
        //запускаем цикл чтения файла на поиск нужных нам символов в тесте
        while ((data = inputStreamOne.read()) != -1) {

            if (((char) data) == a) {
                counter_a++;
            }
            if (((char) data) == b) {
                counter_b++;
            }
            if (((char) data) == c) {
                counter_c++;
            }
            // Выводим внутренности файла на экран
            System.out.print((char) data);
        }
        System.out.println(" ");
        // вывод на экран количество встречающихся символов в файле a, b, c
        log.info("Character counter: 'a' = {}, 'b' = {}, 'c' = {}", counter_a, counter_b, counter_c);
    }

    public static boolean identical(InputStream inputStreamOne, InputStream inputStreamTwo) throws IOException {
        int data1;
        int data2;
        int position = 0;
        boolean identical = false;
        // запускаем цикл сравнения двух файлов по каждому символу
        while ((data1 = inputStreamOne.read()) != -1 && (data2 = inputStreamTwo.read()) != -1) {
            position++;
            if (data1 != data2) {
                log.error("Mismatch in position {}", position);
                identical = true;
            }
        }
        if (!identical) {
            return true;
        }
        return false;
    }
}
