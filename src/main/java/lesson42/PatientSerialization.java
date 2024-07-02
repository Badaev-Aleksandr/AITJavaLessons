package lesson42;

import lombok.extern.slf4j.Slf4j;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class PatientSerialization {
    private static final String FILE_PATH = "src/main/resources/patient.txt";

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        Patient patientOne = new Patient("Иванов Иван", 40, "гастрит", LocalDate.of(2024, 05, 20));
        Patient patientTwo = new Patient("Петров Петр", 30, "перелом", LocalDate.of(2024, 04, 10));

        patients.add(patientOne);
        patients.add(patientTwo);
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            // Передаем лист пациентов для сериализации
            objectOutputStream.writeObject(patients);

        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        } finally {
            log.info("Serialization was successful");
        }
    }
}

