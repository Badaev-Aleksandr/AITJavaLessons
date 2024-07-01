package homework41;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PatientDeserialization {
    private static final String FILE_PATCH = "src/main/resources/patient_database_hm.txt";

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATCH);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            List<Patient> patients = (ArrayList<Patient>) objectInputStream.readObject();

            patients.forEach(System.out::println);


        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        } catch (ClassNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
