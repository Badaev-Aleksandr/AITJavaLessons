package logges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class LogesTest {

        private static Scanner scanner = new Scanner(System.in);
        private static final Logger LOGGER = LoggerFactory.getLogger(LogesTest.class);

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


