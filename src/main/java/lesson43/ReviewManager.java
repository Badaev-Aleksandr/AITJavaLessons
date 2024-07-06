package lesson43;

import homework42.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ReviewManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReviewManager.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//считываем через сканнер

        try (FileWriter writer = new FileWriter("reviews.txt", true)) {//добавляем записи в файл
            boolean addMore = true;//создали переменную
            System.out.print("Введите имя путешественника: ");
            String travelerName = scanner.nextLine();
            LocalDate visitDate = null;
            while (addMore) {
                System.out.print("Введите страну посещения: ");
                String country = scanner.nextLine();
                System.out.print("Введите отзыв: ");
                String reviewText = scanner.nextLine();

                while (visitDate == null) {
                    System.out.println("Введите  дату посещения: yyyy-mm-dd ");
                    try {
                        visitDate = LocalDate.parse(scanner.nextLine());
                        if (visitDate.isAfter(LocalDate.now())) {
                            throw new IllegalArgumentException("дата посещения не валидная. " + visitDate);
                        }
                    } catch (DateTimeParseException exception) {
                        LOGGER.warn("дата посещения не валидная.", visitDate);
                        System.err.println("дата посещения не валидная. " + visitDate);
                    } catch (IllegalArgumentException exception) {
                        LOGGER.warn("дата посещения не валидная. {}", visitDate);
                        visitDate = null;
                    }

                }

                //форма/последовательность записи
                Review review = new Review(travelerName, country, reviewText, String.valueOf(visitDate));
                writer.write(review + "\n");

                System.out.print("Хотите добавить еще отзывы? (да/нет): ");
                String response = scanner.nextLine();
                addMore = response.equalsIgnoreCase("да");
            }
        } catch (DateTimeParseException exception) {
            LOGGER.warn(exception.getMessage());

        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

}
