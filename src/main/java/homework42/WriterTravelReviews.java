package homework42;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class WriterTravelReviews {
    private static final String FILE_PATCH = "src/main/resources/reviews.txt";
    private static final String FILE_PATCH2 = "src/main/resources/reviews_object.ser";

    public static void main(String[] args) {
        String answer = "";
        BufferedReader bufferedReader = null;
        List<Review> reviews = new ArrayList<>();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATCH, true));
             FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATCH2);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Запишите отзыв о путешествиях ");
            System.out.println("Введите ваше имя: ");
            String travelerName = bufferedReader.readLine();
            LocalDate visitDate = null;
            do {
                System.out.println("Страна посещения: ");
                String country = bufferedReader.readLine();
                System.out.println("Напишите ваш отзыв: ");
                String reviewText = bufferedReader.readLine();
                while (visitDate == null) {
                    System.out.println("Дата посещения в формате-> yyyy-mm-dd: ");
                    try {
                        visitDate = LocalDate.parse(bufferedReader.readLine());
                        if (visitDate.isAfter(LocalDate.now())) {
                            throw new IllegalArgumentException("Дата посещения не валидная!");
                        }
                    } catch (DateTimeParseException exception) {
                        log.error(exception.getMessage(), exception + "Дата посещения не валидная! {}", visitDate);
                    } catch (IllegalArgumentException exception) {
                        log.error(exception.getMessage(), exception + "Дата посещения не валидная! {}", visitDate);
                        visitDate = null;
                    }
                }

                String date = travelerName + "," + country + "," + reviewText + "," + visitDate;
                bufferedWriter.write(date);
                bufferedWriter.newLine();
                Review review = new Review(travelerName, country, reviewText, visitDate.toString());
                reviews.add(review);
                objectOutputStream.writeObject(reviews);
                log.info("Запись объектов в количестве " + reviews.size()+ " в файл reviews_object.ser успешно выполнено");

                System.out.println("Хотите написать еще отзыв? Y/N");
                answer = bufferedReader.readLine();
            } while (answer.equalsIgnoreCase("Y"));
        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (DateTimeParseException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
        try {
            bufferedReader.close();
        } catch (
                IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
