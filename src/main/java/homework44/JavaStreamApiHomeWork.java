package homework44;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreamApiHomeWork {
    public static void main(String[] args) {
        //выводим на экран все элементы
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");
        items.stream().forEach(System.out::println);
        //преобразуем все слова в верхний регистр
        List<String> itemsUpperCaseList = items.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(itemsUpperCaseList);

        //Находим количество элементов в списке, которые длиннее трех символов

        long i = items.stream().filter(x -> x.length() > 3).count();
        System.out.println(i);

        //Находим первый элемент, который начинается на "c"
        Optional<String> resultFindFirst = items.stream().filter(x -> x.startsWith("c")).findFirst();
        System.out.println(resultFindFirst);

        //Проверить, содержит ли список хотя бы одно отрицательное число
        List<Integer> numbers = Arrays.asList(12,-1, 2, 3, 4);
        boolean checkNegativeNumber = numbers.stream().anyMatch(x -> x < 0);
        System.out.println(checkNegativeNumber);

        //Отфильтруйте список чисел, оставив только четные
        List<Integer> positiveNumbers = numbers.stream().filter(x -> x % 2 == 0).sorted().toList();
        System.out.println(positiveNumbers);


    }
}
