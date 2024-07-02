package lesson42;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Slf4j
public class PatientsDatabaseReader {

    private static final String FILE_PATH = "src/main/resources/patients.txt";

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {

            String line;
            //ФИО, возраст, диагноз, дата последнего визита.
            while ((line = bufferedReader.readLine()) != null) {
               // log.info(line);
                String[] patientDataArray = line.split(",");
                log.info("ФИО: {}, возраст: {}, диагноз: {}, дата последнего визита: {}", patientDataArray[0], patientDataArray[1], patientDataArray[2], patientDataArray[3]);
            }
        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
