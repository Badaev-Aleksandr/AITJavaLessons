package lesson42;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@Slf4j
public class MedicalAnalysisWriter {
    private static final String FILE_PATH = "src/main/resources/analysis_database.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String answer = "";
        do {
            System.out.println("ФИО пациента:");
            String name = scanner.nextLine();
            System.out.println("тип анализа: ");
            String analyseType = scanner.nextLine();
            System.out.println("значение анализа: ");
            String analyseResult = scanner.nextLine();
            System.out.println("дата проведения: ");
            String analyseDate = scanner.nextLine();

            String date = name + ", " + analyseType + ", " + analyseResult + ", " + analyseDate;

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH,true))) {
                bufferedWriter.write(date);
                bufferedWriter.newLine();
                System.out.println("Будут еще записи? (Y/N)");
                answer = scanner.nextLine();

            } catch (IOException exception) {
                log.error(exception.getMessage(), exception);
            }
        } while (answer.equalsIgnoreCase("Y"));
    }
}
