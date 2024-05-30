package lesson36;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class DrinkAssistant {


    private static String[] drinks = {"Кофе", "Чай", "Сок"};
    private static final Logger LOGGER = LoggerFactory.getLogger(DrinkAssistant.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте номер напитка 1-кофе, 2-чай, 3-сок");
        int drinkNumber = 0;
        try {
            drinkNumber = Integer.parseInt(scanner.nextLine());
            String drink = drinks[drinkNumber - 1];
            LOGGER.info("Пользователь выбрал напиток {}",drink);
        } catch (NumberFormatException exception) {
            LOGGER.error("Неверный формат ввода напитка. Exception: {}", exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception) {
            LOGGER.error("Выход за пределы массива, неправильный номер напитка. Exception {}",exception.getMessage());
        }
        finally {
            LOGGER.info("Завершение работы программы");
            scanner.close();
        }

    }
}
