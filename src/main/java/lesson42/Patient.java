package lesson42;

import java.io.Serializable;
import java.time.LocalDate;

public class Patient implements Serializable {
    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    private String diagnosis;
    private LocalDate lastVisit;

    public Patient(String name, int age, String diagnosis, LocalDate lastVisit) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.lastVisit = lastVisit;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", diagnosis='" + diagnosis + '\'' +
                ", lastVisit=" + lastVisit +
                '}';
    }
}
