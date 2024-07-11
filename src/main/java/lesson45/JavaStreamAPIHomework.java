package lesson45;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreamAPIHomework {
    public static void main(String[] args) {
        System.out.println("----------- 1 -------------------");
        //Используйте Stream API для вывода всех элементов списка на экран.
        List<String> items = Arrays.asList("APPLE", "banana", "wcherry", "DATE", "wcheese");
        items.stream().forEach(System.out::println);

        System.out.println("----------- 2 -------------------");
        //Преобразуйте все элементы списка в нижний регистр и соберите их в новый список.
        List<String> itemsLowerCase = items.stream().map(String::toLowerCase).collect(Collectors.toList());
        //String::toLowerCase --> x->x.toString.toLowercase()
        System.out.println(itemsLowerCase);

        System.out.println("----------- 3 -------------------");
        //сколько строк в списке содержат более трех символов.
        List<String> filteredItems = items.stream().filter(x -> x.length() > 3).toList();
        System.out.println(filteredItems.size());

        long result = items.stream().filter(x -> x.length() > 3).count();
        int resultInt = (int) items.stream().filter(x -> x.length() > 3).count();

        System.out.println(result);
        System.out.println(resultInt);

        System.out.println("----------- 4 -------------------");
        //первый элемент в списке, который начинается на букву "c".
        Optional<String> resultFindFirst =  items.stream().filter(x -> x.startsWith("c")).findFirst();
        System.out.println(resultFindFirst);

        System.out.println("----------- 5 -------------------");
        //содержит ли список целых чисел хотя бы одно отрицательное число.
        List<Integer> numbers = Arrays.asList(12, 1, 2, -3, 4, 5, 6);
        boolean resultNegativNumbers =  numbers.stream().anyMatch(x -> x < 0);
        System.out.println(resultNegativNumbers);

        System.out.println("----------- 6 -------------------");
        //Отфильтруйте список чисел, оставив только четные
        List<Integer> sortedList = numbers.stream().filter(x-> x % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}

