package lesson24;

import java.util.HashMap;
import java.util.Map;
/*
    Создайте HashMap, который будет хранить имена студентов
    (тип String) и их оценки (тип Integer).
    Добавьте в HashMap данные трех студентов:
    Иван (оценка 5), Светлана (оценка 4) и Алексей (оценка 3).
     */

public class HashMapTask {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Иван", 5);
        studentGrades.put("Светлана", 4);
        studentGrades.put("Алексей", 3);
        /*
        Используя HashMap из предыдущего упражнения, получите и напечатайте оценку Светланы.
         */
        System.out.println("Оценка Светланы: " + studentGrades.get("Светлана"));

        /*
        Проверьте, содержится ли в вашем HashMap студент с именем Антон.
        Выведите соответствующее сообщение в зависимости от результата.
         */
        if (studentGrades.containsKey("Антон")) {
            System.out.println("Студент с именем Антон есть в HashMap.");
        } else {
            System.out.println("Студент с именем Антон отсутствует в HashMap.");
        }
        /*
        Удалите из HashMap запись для студента Алексей.
        Выведите содержимое HashMap после удаления.
         */
        // Удаляем студента по Имени (Key)
        System.out.println("Удаляем студента по Имени (Key)");
        studentGrades.remove("Алексей");
        System.out.println("Проверяем список после удаления");
        System.out.println(studentGrades);

        /*
        Напечатайте имена и оценки всех студентов из HashMap.
        Используйте для этого метод `entrySet()` и расширенный цикл `for`.
         */
        for (Map.Entry<String, Integer> student : studentGrades.entrySet()) {
            System.out.println("Name: " + student.getKey() + " Grade: " + student.getValue());
        }
        /*
        Измените оценку Светланы на 5 в вашем HashMap. Проверьте, была ли оценка изменена,
        и выведите содержимое HashMap после изменения.
         */
        studentGrades.replace("Светлана", 5);
        System.out.println(studentGrades);

        /*
        Напечатайте имена всех студентов, у которых оценка равна 5,
        используя HashMap `studentGrades`.
         */
        System.out.println("-------------------------------------------------");
        for (Map.Entry<String, Integer> student : studentGrades.entrySet()) {
            if (student.getValue() == 5) {
                System.out.println("Имя: " + student.getKey() + " Оценка: " + student.getValue());
            }
        }
        /*
        Очистите HashMap `studentGrades` от всех записей.
        Проверьте, пуст ли он после этого, и выведите соответствующее сообщение.
         */
        studentGrades.clear();
        if (studentGrades.isEmpty()) {
            System.out.println("HashMap studentGrades пуст после очистки.");
        } else {
            System.out.println("HashMap studentGrades не пуст после очистки.");
        }

    }
}
