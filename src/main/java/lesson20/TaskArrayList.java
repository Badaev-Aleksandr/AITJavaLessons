package lesson20;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskArrayList {
    public static void main(String[] args) {
        /*
         **Задание**: Создайте `ArrayList` для строк
         *  и добавьте в него следующие элементы:
         * "Java", "Python", "C++".
         * Выведите содержимое списка на экран.
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        //Простой вариант вывода листа на Экран
        System.out.println(list);
        /*
         **Задание**: Имея `ArrayList` с элементами "Red", "Green", "Blue", "Yellow", удалите
         * "Green" и "Yellow" из списка. Выведите итоговый список на экран.
         */
        ArrayList<String> elements = new ArrayList<>();
        //Добавление в лист
        elements.add("Red");
        elements.add("Green");
        elements.add("Blue");
        elements.add("Yellow");
        //Удаление с листа
        elements.remove(1);
        elements.remove("Yellow");
        //вывод на экран всех оставшихся элементов
        System.out.println(elements);

        /*
         **Задание**: Дан `ArrayList` с элементами 1, 2, 3, 4, 5. Выведите на экран третий элемент списка.
         */
        ArrayList<Integer> element = new ArrayList<Integer>();
        element.add(1);
        element.add(2);
        element.add(3);
        element.add(4);
        element.add(5);
        System.out.println(element.get(2));
        /*
         **Задание**: Имея `ArrayList` с элементами "Monday", "Tuesday", "Wednesday",
         * замените "Wednesday" на "Sunday". Выведите итоговый список на экран.
         */
        ArrayList<String> weekDay = new ArrayList<>();
        weekDay.add("Monday");
        weekDay.add("Tuesday");
        weekDay.add("Wednesday");

        weekDay.set(2, "Sunday");
        System.out.println(weekDay);
        /*
        **Задание**: Создайте `ArrayList` с элементами 4, 1, 3, 5, 2.
        Выведите на экран минимальный и максимальный элементы
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        int numberMin = numbers.get(0);
        int numberMax = numbers.get(0);
        for (Integer number : numbers) {

            if (number > numberMax) {
                numberMax = number;
            }
            if (number < numberMin) {
                numberMin = number;
            }
        }
        System.out.println("numberMax: " + numberMax + " " + " numberMin: " + numberMin);

        /*
        Создайте ArrayList с именем "names" и добавьте в него следующие имена: "Alice", "Bob", "Charlie", "David".
        Выведите на экран содержимое списка "names" с использованием цикла for-each.
        Добавьте новое имя "Eva" в конец списка "names".
        Вставьте имя "Frank" на позицию с индексом 2 в списке "names".
        Удалите имя "David" из списка.
        Проверьте, существует ли имя "Charlie" в списке "names", и выведите соответствующее сообщение.
        Очистите список "names" от всех элементов.
         */
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        for (String name: names){
            System.out.println(name);
        }
        names.add("Eva");
        names.add(2,"Frank");
        names.remove("David");
        boolean checkName = false;
        for (String findName: names){
            if (findName.equalsIgnoreCase("Charlie")){
                System.out.println("Charlie's name is on the list");
                checkName = true;
            }
        }
        if (!checkName){
            System.out.println("Charlie's name is not on the list");
        }
        names.clear();
    }
}
