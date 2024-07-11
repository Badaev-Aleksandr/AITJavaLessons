package lesson45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamApi3 {
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("Audi");
        list.add("BMW");
        list.add("Golf");
        list.add("Honda");
        list.add("Ford");
        list.add("Mazda");

        System.out.println(list.stream().count());

        List<Integer> elementsInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> sum = elementsInt.stream().reduce((y, x) -> y + x);
        System.out.println(sum.get());

        Optional<Integer> minInt = elementsInt.stream().min(Integer::compareTo);
        System.out.println(minInt.get());

        Optional<Integer> resultFindFirst = elementsInt.stream().filter(x -> x > 5).findFirst();
        System.out.println(resultFindFirst.get());

        //Найдите минимальное значение в списке целых чисел.
        List<Integer> numbers = Arrays.asList(-3, 1, 4, 1, 5, 9, 12);
        Optional<Integer> minInteger = numbers.stream().min(Integer::compareTo);
        System.out.println(minInteger.get());

        //Найдите максимальное значение в списке целых чисел.
        Optional<Integer> maxInteger = numbers.stream().max(Integer::compareTo);
        System.out.println(maxInteger.get());

        //посчитать количество элементов в списке
        long i = numbers.stream().count();
        System.out.println(i);

        //пропустите первые два элемента в списке и выведите оставшиеся
        numbers.stream().skip(2).forEach(System.out::print);
        System.out.println("\n-----");
        //Возьмите только первые три элемента из списка
        numbers.stream().limit(3).forEach(System.out::print);
        System.out.println("\n");

        //Отсортировать список элементов авто по алфавиту
        List<String> carList = list.stream().sorted().toList();
        System.out.println(carList);

        //проверьте все ли числа в списке положительные
        boolean result = numbers.stream().allMatch(x -> x > 0);
        System.out.println(result);

        //проверьте есть ли хотя бы одно четное число
        boolean result2 = numbers.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(result2);

        //Найдите первое четное число в списке
        Optional<Integer> first = numbers.stream().filter(x -> x % 2 == 0).findFirst();
        System.out.println(first.get());

        //Обьедините два списка строк в один и выведите все элементы
        List<String> list1 = Arrays.asList("apple", "banana");
        List<String> list2 = Arrays.asList("cherry", "date");
        List<String> list3 = Stream.concat(list1.stream(), list2.stream()).toList();
        System.out.println(list3);

        //Разделите список строк на два списка: один с длинной строк меньше 5, другой с длиной 5 и больше
        List<String> words = Arrays.asList("apple", "banana", "fig", "date");
        Map<Boolean, List<String>> collected = words.stream().collect(Collectors.partitioningBy(word -> word.length() < 5));
        System.out.println(collected);



    }
}
