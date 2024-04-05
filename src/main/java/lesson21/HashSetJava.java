package lesson21;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetJava {
    public static void main(String[] args) {
        HashSet<String> hashSetCars = new HashSet<>();
        hashSetCars.add("BMW");
        hashSetCars.add("Audi");
        hashSetCars.add("VW");

        //попытка добавить дубликат,
        //сохраняются лишь уникальные элементы
        hashSetCars.add("Audi");

        // Проверка наличия элемента
        if(hashSetCars.contains("Audi")) {
            System.out.println("Найден элемент");
        }

        //Удаление элемента
        hashSetCars.remove("VW");

        System.out.println();

        //Итерация по элементам
        for (String car: hashSetCars){
            System.out.println(car);
        }
        //Удаление через Iterator
        Iterator<String> iterator = hashSetCars.iterator();
        while (iterator.hasNext()){
            String car = iterator.next();
            if (car.equalsIgnoreCase("Audi")){
                iterator.remove();
                System.out.println("removed!!!");
            }
        }
        for (String car: hashSetCars){
            System.out.println(car);
        }
    }
}
