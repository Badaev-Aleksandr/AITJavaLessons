package homework42;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DeserializeTourRoute {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeserializeTourRoute.class);

    public static void main(String[] args) {
        File file = Path.of("src", "main", "resources", "routes.ser").toFile();
        List<TourRoute> tourRouteList = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            while (true) {
                try {
                   TourRoute tourRoute = (TourRoute) objectInputStream.readObject();
                    tourRouteList.add(tourRoute);
                } catch (EOFException exception) {
                    break;
                }
            }

        } catch (FileNotFoundException exception) {
            LOGGER.error(exception.getMessage());

        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        } catch (ClassNotFoundException exception) {
            LOGGER.error(exception.getMessage());
        }
        for (TourRoute tourRoute : tourRouteList) {
            System.out.println(tourRoute);
        }
    }

}
