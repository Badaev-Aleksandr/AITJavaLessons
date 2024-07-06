package lesson43;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationDatabaseReader {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReservationDatabaseReader.class);

    public static void main(String[] args) {
        File file = Path.of("src", "main", "resources", "booking.txt").toFile();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            List<Booking> reservationBookingArray = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] reservationDataArray = line.split(",");
                //checkIn позже checkOut
                if (LocalDate.parse(reservationDataArray[3]).isAfter(LocalDate.parse(reservationDataArray[4]))) {
                    LOGGER.error("Reservation Date {} is after Reservation Date of Booking Date {}. Line in booking.txt {}",
                            reservationDataArray[3], reservationDataArray[4], line);
                } else {
                    Booking bookingToSave = new Booking(reservationDataArray[0].trim(), Integer.parseInt(reservationDataArray[1]),
                            reservationDataArray[2].trim(), reservationDataArray[3].trim(), reservationDataArray[4].trim());
                    reservationBookingArray.add(bookingToSave);
                }
            }
            for (Booking booking : reservationBookingArray) {
                System.out.println(booking);
            }
        } catch (FileNotFoundException exception) {
            LOGGER.error(exception.getMessage());

        } catch (NumberFormatException exception) {
            LOGGER.error("Format of age is wrong, it must be a number! " + exception.getMessage());
        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        }
    }

}
