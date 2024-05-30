package logging;

/*
Упражнение 1: Логирование действий пользователя
**Задача:** Создайте простое консольное приложение для логирования действий пользователя. Приложение должно запросить
у пользователя ввести его имя, возраст и любимый цвет, после чего залогировать эти данные.

**Требования:**
- Используйте уровень `INFO` для логирования факта ввода данных.
- Используйте уровень `DEBUG` для логирования детальной информации о каждом введённом параметре.
- В случае возникновения ошибок ввода данных используйте уровень `ERROR` для логирования исключений.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class UserInteraction {
    private static Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = LoggerFactory.getLogger(UserInteraction.class);

    public static void main(String[] args) {

        LOGGER.info("new user: ");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        LOGGER.debug("User added name: {}",name);

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        LOGGER.debug("User added age: {}",age);
        if (age<=0){
            LOGGER.error("Invalid age: {}",age);
        }

        System.out.println("Enter your favorite color: ");
        String color = scanner.nextLine();
        LOGGER.debug("User added color: {}",color);

        scanner.close();
    }
}
