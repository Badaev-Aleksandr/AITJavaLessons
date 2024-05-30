package homework33;

import com.sun.jdi.connect.Connector;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeatherDate {

    // Задание 1
    public double calculateAverageTemperature(List<Double> temperatures) {
        if (temperatures == null || temperatures.isEmpty()){
            throw new IllegalArgumentException("Temperature list must not be null or empty");
        }
        double sum = 0;
        for (Double temperature: temperatures){
            sum+=temperature;
        }
      return sum/temperatures.size();
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
    public List<Double> stringToDouble(String argument) {
        String nullArgument = "";
        if (argument.equalsIgnoreCase("null")){
             nullArgument = argument = null;
        }
        if (nullArgument == null || argument.isEmpty()) {
            return List.of();
        }
        String[] tempArray = argument.split(",\\s*");
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
