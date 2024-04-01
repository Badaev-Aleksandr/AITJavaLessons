package homework22;

import java.util.HashSet;

public class TestProperty {
    public static void main(String[] args) {
        System.out.println("---------------Task1---------------");
        System.out.println("Выводим на экран адреса объектов с 1 дубликатом");
        HashSet<Property> realEstateOne = new HashSet<>();
        HashSet<Property> realEstateTwo = new HashSet<>();
        realEstateOne.add(new Property("Friedrich-Stein-Straße 21", "Apartment house"));
        realEstateOne.add(new Property("Gottlieb-Daimler-Straße 39", "Apartment"));
        realEstateOne.add(new Property("Carl-Benz-Straße 2", "Hospital"));
        realEstateOne.add(new Property("Carl-Benz-Straße 2", "Hospital"));
        realEstateOne.add(new Property("Max-Planck-Straße 44", "Hospital"));

        realEstateTwo.add(new Property("Max-Planck-Straße 44", "Hospital"));
        realEstateTwo.add(new Property("Carl-Benz-Straße 2", "Hospital"));
        realEstateTwo.add(new Property("Am Entensee 9-5", "Apartment"));
        realEstateTwo.add(new Property("Weingartenweg 15", "Apartment house"));
        realEstateTwo.add(new Property("Bergstraße 3", "Commercial real estate"));
        for (Property address : realEstateOne) {
            System.out.println(address);
        }
        System.out.println("---------------Task2---------------");
        System.out.println("Фильтрация по типу недвижимости: ");
        Property.filterByType(realEstateOne, "apartment");

        System.out.println("---------------Task3---------------");
        System.out.println("Программа, которая сравнивает два HashSet объектов недвижимости и определяет,\n" +
                "какие объекты присутствуют в первом наборе, но отсутствуют во втором. ");
        Property.compareSets(realEstateOne, realEstateTwo);

        System.out.println("---------------Task4---------------");
        System.out.println("Объединение двух HashSet и исключение повторяющихся объектов");
        Property.mergingObjects(realEstateOne,realEstateTwo);
    }
}
