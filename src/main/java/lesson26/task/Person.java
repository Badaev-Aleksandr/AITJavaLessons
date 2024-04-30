package lesson26.task;
/*
Создайте класс `Person`, который будет содержать базовые характеристики, такие как имя и возраст.
От этого класса наследуйте два подкласса: `Student` и `Teacher`. В классе `Student` должны быть поля для класса
(года обучения) и оценок. В классе `Teacher` должны быть поля для предмета, который он преподает, и стаж работы.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
