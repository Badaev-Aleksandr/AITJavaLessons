package homework35;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class DrinksApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(DrinksApp.class);
    private static String[] drinks = {"Caffe", "Tee", "Juice"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Select drink number please");
        System.out.println("{1} = Caffe; {2} = Tee; {3} = Juice");
        String value = scanner.nextLine();

        drinkMachine(value);

    }

    public static void drinkMachine(String number) {
        try {
            int numberDrink = Integer.parseInt(number) - 1;

            if (numberDrink < 0 || numberDrink > drinks.length) {
                throw new ArrayIndexOutOfBoundsException("Invalid drink number");
            } else {
                LOGGER.info("Drink {} is being prepared", drinks[numberDrink]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            LOGGER.error("Invalid drink number");
            LOGGER.error(exception.getLocalizedMessage());
        } catch (NumberFormatException numberFormatException) {
            LOGGER.error("Entering a non-integer number");
            LOGGER.error(numberFormatException.getLocalizedMessage());
        } catch (Exception e) {
            LOGGER.error("An unknown exception occurred");
            LOGGER.error(e.getLocalizedMessage());
        } finally {
            LOGGER.info("program completed");
            scanner.close();
        }
    }
}

