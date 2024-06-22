package lesson41;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 3L;

    private String name;
    private int age;
    private boolean education;
    private String address;
    private transient String password;

    public Person(String name, int age, boolean education, String address, String password) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.address = address;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", education=" + education +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
