package lesson41;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

@Slf4j
public class ListPersonSerialization {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Mustermann", 32, true, "address: Berlin", "234525gf"));
        people.add(new Person("Bulenging", 45, false, "address: Bonn", "525gf112"));

        log.info("People was added");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/people.txt"));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/people.txt"))) {

            objectOutputStream.writeObject(people);
            ArrayList<Person> deserializedPerson = (ArrayList<Person>) objectInputStream.readObject();

            for (Person person : deserializedPerson) {
                System.out.println(person);
            }
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        } catch (ClassNotFoundException e) {
            log.error(e.getMessage(), e);
        }
    }
}
