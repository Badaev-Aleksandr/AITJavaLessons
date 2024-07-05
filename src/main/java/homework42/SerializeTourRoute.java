package homework42;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SerializeTourRoute {
    private static final Logger LOGGER = LoggerFactory.getLogger(SerializeTourRoute.class);

    public static void main(String[] args) {
        File file = Path.of("src", "main", "resources", "routes.ser").toFile();
        List<TourRoute> tourRouteList = new ArrayList<>();
        tourRouteList.add(new TourRoute("Тропа в Дурбахе", "Германия", "Шварцвальд (Баден-Вюртемберг)", 1, 200));
        tourRouteList.add(new TourRoute("Кольцо Аннапурны", "Непал", "Бесисахар", 10, 1200));
        tourRouteList.add(new TourRoute("Лёйгавегюр и перевал Фиммвюрдухаулс", "Исландия", "Тоурсмёрк", 4, 450));
        tourRouteList.add(new TourRoute("Королевская тропа Кунгследен", "Швеция", "Хемаван", 8, 780));
        tourRouteList.add(new TourRoute("Ликийская тропа", "Турция", " Анталия", 24, 3244));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {

            //objectOutputStream.writeObject(tourRouteList);
            for (TourRoute tourRoute : tourRouteList) {
                objectOutputStream.writeObject(tourRoute);
            }

            LOGGER.info("Запись объектов в количестве " + tourRouteList.size() + " в файл routes.ser успешно выполнено");
        } catch (FileNotFoundException exception) {
            LOGGER.error(exception.getMessage());

        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        }
    }

}
