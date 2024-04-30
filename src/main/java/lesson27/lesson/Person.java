package lesson27.lesson;

/*
Создайте класс `Person` с защищенным атрибутом `name` и методом `display()`,
который выводит имя. Создайте класс `Student`, который наследует `Person`,
добавляет новый атрибут `studentId` и переопределяет `display()` для показа `name` и `studentId`.
 */
public class Person {
    private String name;

    public void display() {
        System.out.println("Name: " + name);
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
