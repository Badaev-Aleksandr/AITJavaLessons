package homework41;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class PatientsTestsFileWriter {
    public static void main(String[] args) {
        String answer = "";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        do {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/patients1_tests.txt", true));

                System.out.println("Введите результаты медицинских анализов пациента");
                System.out.println("ФИО пациента: ");
                String name = bufferedReader.readLine();
                System.out.println("тип анализа: ");
                String analyseType = bufferedReader.readLine();
                System.out.println("значение анализа: ");
                String analyseResult = bufferedReader.readLine();
                System.out.println("дата проведения: ");
                String analyseDate = bufferedReader.readLine();

                String date = name + ", " + analyseType + ", " + analyseResult + ", " + analyseDate;
                bufferedWriter.write(date);
                bufferedWriter.newLine();
                System.out.println("Будут еще вводиться анализы? (Y/N)");
                answer = bufferedReader.readLine();

            } catch (FileNotFoundException exception) {
                log.error(exception.getMessage(), exception);
            } catch (IOException exception) {
                log.error(exception.getMessage(), exception);
            }
        } while (answer.equalsIgnoreCase("Y"));
        try {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            bufferedReader.close();
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }

    }
}
