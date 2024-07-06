package lesson43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class JavaStreamAPI {

    private static List<String> capitals = new ArrayList<>();
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        //фильтрация и вывод данных
        capitals.add("Berlin");
        capitals.add("London");
        capitals.add("Paris");
        capitals.add("New York");

        capitals.stream().filter(capital -> capital.startsWith("B")).forEach(System.out::println);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        //сложить все числа в списке
        int resultSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(resultSum);

        //поиск столицы с самым длинным названием
        Optional<String> resultCapitals = capitals.stream().max(Comparator.comparingInt(String::length));
        System.out.println(resultCapitals.get());
    }
}
