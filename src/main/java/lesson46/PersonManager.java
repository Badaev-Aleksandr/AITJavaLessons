package lesson46;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Terminator", 200));
        personList.add(new Person("SpiderMan", 35));
        personList.add(new Person("Loki", 30));
        personList.add(new Person("Tor", 2000));
      //  personList.add(null);

        long ageSum = personList.stream().mapToInt(Person::getAge).sum();
        System.out.println(ageSum);

        int agesum = 0;
        for (Person person : personList) {
            agesum += person.getAge();
        }
        System.out.println(agesum);

    }
}
