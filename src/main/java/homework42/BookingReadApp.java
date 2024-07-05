package homework42;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class BookingReadApp {
    private static final File file = Path.of("src", "main", "resources", "booking.txt").toFile();

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            List<Booking> bookingsDate = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //Читаем файл booking.txt и разбиваем на элементы разделенные запятой
                String[] arrayElement = line.split(",");
                Booking booking = new Booking(arrayElement[0].trim(), Integer.parseInt(arrayElement[1].trim()),
                        arrayElement[2].trim(), arrayElement[3].trim(), arrayElement[4].trim());
                if (LocalDate.parse(arrayElement[3]).isAfter(LocalDate.parse(arrayElement[4]))) {
                    log.error("Проверьте даты заезда и выезда!!! {}", booking);
                } else if (Integer.parseInt(arrayElement[1]) < 0) {
                    log.error("Проверить номер Отеля!!! Отрицательное значение Line in booking.txt {}", booking);
                } else {
                    bookingsDate.add(booking);
                }
            }
            for (Booking booking : bookingsDate) {
                System.out.println(booking);
            }

        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (NumberFormatException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
