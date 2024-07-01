package homework41;

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
    private static final String FILE_PATH = "src/main/resources/patient_database_hm.txt";

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient patient1 = new Patient("Alice", 32, "ARVI", LocalDate.of(2024, 5, 13));
        Patient patient2 = new Patient("Tod", 45, "blood cancer", LocalDate.of(2024, 5, 20));
        Patient patient3 = new Patient("Sven", 56, "new coronavirus infection", LocalDate.of(2024, 5, 26));

        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

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

