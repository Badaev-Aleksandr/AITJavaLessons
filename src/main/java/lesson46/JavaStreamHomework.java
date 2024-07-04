package lesson46;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamHomework {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        fruits.stream().forEach(System.out::println);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        List<String> words = Arrays.asList("stream", "api", "java", "list");
        long countWord = words.stream().filter(x -> x.length() > 4).count();
        System.out.println("countWord " + countWord);

        List<String> tools = Arrays.asList("hammer", "jack", "wrench", "johny");
        String firstJElement = tools.stream().filter(x -> x.startsWith("j")).findFirst().orElse(null);
        System.out.println("firstJElement: " + firstJElement);

        List<Integer> numbers = Arrays.asList(5, 33, 1, 21, 8);
        List<Integer> filteredNumber = numbers.stream().filter(x -> x > 10).sorted().collect(Collectors.toList());
        System.out.println("filteredNumber: " + filteredNumber);

        List<String> animals = Arrays.asList("ant", "ant", "bear", "alligator");
        Map<Character, List<String>> animalsGroups = animals.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
        System.out.println("animalsGroups: " + animalsGroups);
        //второй вариант вывода на экран
        animalsGroups.forEach((kay, value) -> System.out.println(kay + ":" + value));

        List<Integer> values = Arrays.asList(2, 3, 5, 7, 11);
        long valueSum = values.stream().mapToInt(Integer::intValue).sum();
        System.out.println("valueSum: " + valueSum);

        List<Integer> stats = Arrays.asList(10, 20, 30, 40, 50);
        int minResult = stats.stream().min(Integer::compareTo).orElse(null);
        int maxResult = stats.stream().max(Integer::compareTo).orElse(null);
        System.out.println("minResult: " + minResult);
        System.out.println("maxResult: " + maxResult);

        IntSummaryStatistics intSummaryStatistics = stats.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("intSummaryStatistics: " + intSummaryStatistics);

        List<String> phrases = Arrays.asList("Java", "Stream", "API");
        String phrasesLine = phrases.stream().collect(Collectors.joining(" "));
        System.out.println("phrasesLine: " + phrasesLine);

        List<String> massages = Arrays.asList("hello", "world", "streams", "are", "cool");
        long massagesLength = massages.stream().mapToInt(String::length).sum();
        System.out.println("massagesLength: " + massagesLength);

        long massagesLineLength = massages.stream().collect(Collectors.joining()).length();
        System.out.println(massagesLineLength);


    }
}
