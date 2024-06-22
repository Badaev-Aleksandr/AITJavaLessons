package lesson41;

import lombok.extern.slf4j.Slf4j;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@Slf4j
public class PersonSerializing {
    public static void main(String[] args) {

        Person person = new Person("Jacki Chan",70,true,"address","123");

        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/person.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
            log.info("Person serialized successfully");
        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
