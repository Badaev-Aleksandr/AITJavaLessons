package homework33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeatherDate {

    // Задание 1
    public static Stream<Double> calculateAverageTemperature() {
        return Stream.of(15.0, 10.0, 22.0, -10.0, 0.0, -25.0);
    }

    // Задание 2
    public boolean checkForFrostWarnings(List<Double> temperatures) {
        if (temperatures == null || temperatures.isEmpty()) {
            throw new IllegalArgumentException("Temperature list must not be null or empty");
        } else {
            for (Double temp : temperatures) {
                if (temp < 0) {
                    return true;
                }
            }
            return false;
        }
    }
// Метод преобразования String в Double
    public List<Double> stringToDouble(String temperatures) {
        if (temperatures == null || temperatures.isEmpty()) {
            return List.of();
        }
        String[] tempArray = temperatures.split(",\\s*");
        return Arrays.stream(tempArray)
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }

    public String evaluatePrecipitationLevels(List<Double> precipitationLevels) {
        if (precipitationLevels == null || precipitationLevels.isEmpty()) {
            throw new IllegalArgumentException("Precipitation levels list must not be null or empty");
        }

        double result = 0;
        for (Double lvl : precipitationLevels) {
            result += lvl;
        }
        double average = result / precipitationLevels.size();

        if (average < 20) {
            return "Низкий";

        } else if (average <= 50) {
            return "Средний";

        } else {
            return "Высокий";
        }
    }
}
