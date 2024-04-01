package homework22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/*
    Задача 1: Уникальные объекты недвижимости
Цель: Написать программу, которая будет использовать HashSet для хранения уникальных объектов недвижимости.
Каждый объект недвижимости должен быть представлен классом Property,
содержащим минимум два поля: address (адрес) и type (тип, например, квартира, дом, коммерческая недвижимость).

    Задачи:
1. Создать класс Property с полями address и type.
2. Реализовать hashCode и equals для обеспечения уникальности объектов Property в HashSet на основе их адреса и типа.
3. Создать HashSet и добавить в него несколько объектов недвижимости, включая дубликаты.
4. Вывести содержимое HashSet на экран, чтобы продемонстрировать, что дубликаты были успешно исключены.

Задача 2: Фильтрация по типу недвижимости
Цель: Используя HashSet, написать метод, который фильтрует набор объектов недвижимости по заданному типу и
возвращает новый HashSet с объектами указанного типа.

Задачи:
1. Использовать класс Property из задачи 1.
2. Написать метод filterByType, который принимает HashSet<Property> и String type, и возвращает HashSet<Property>,
содержащий только объекты недвижимости заданного типа.
3. Продемонстрировать работу метода filterByType, создав исходный HashSet с различными типами недвижимости и
выводя результаты фильтрации.

Задача 3: Сравнение наборов недвижимости
Цель: Написать программу, которая сравнивает два HashSet объектов недвижимости и определяет,
какие объекты присутствуют в первом наборе, но отсутствуют во втором.

Задачи:
1. Использовать класс Property из задачи 1.
2. Создать два HashSet<Property> с разными объектами недвижимости.
3. Написать метод compareSets, который принимает два HashSet<Property> и возвращает HashSet<Property>,
содержащий объекты, которые есть в первом наборе, но отсутствуют во втором.
4. Продемонстрировать работу метода compareSets, выводя результат на экран.
 */
public class Property {

    private String address;
    private String type;

    public Property(String address, String type) {
        this.address = address;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(address, property.address) && Objects.equals(type, property.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, type);
    }

    public static void filterByType(HashSet<Property> object, String type) {
        boolean checkType = false;
        for (Property address : object) {
            if (address.getType().equalsIgnoreCase(type)) {
                System.out.println(address);
                checkType = true;
            }
        }
        if (!checkType) {
            System.out.println("Not found");
        }
    }

    public static void compareSets(HashSet<Property> objectOne, HashSet<Property> objectTwo) {
        HashSet<Property> differenceObject = new HashSet<>(objectOne);
        differenceObject.removeAll(objectTwo);
        for (Property address : differenceObject) {
            System.out.println(address);
        }
    }
    public static void mergingObjects(HashSet<Property> objectOne, HashSet<Property> objectTwo){
        HashSet<Property> unionObject = new HashSet<>(objectOne);
        unionObject.addAll(objectTwo);
        for (Property address : unionObject) {
            System.out.println(address);
        }
    }
}
