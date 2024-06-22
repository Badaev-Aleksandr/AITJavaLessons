package lesson41;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

@Slf4j
public class PersonDeserializing {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/person.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Person personJackieChan = (Person) objectInputStream.readObject();
            log.info("person Jackie Chan: {}", personJackieChan);

        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        } catch (ClassNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
