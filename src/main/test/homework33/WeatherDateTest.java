package homework33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherDateTest {
    private WeatherDate weatherManager;

    @BeforeEach
    void setUp() {
        weatherManager = new WeatherDate();
    }

    // Не получилось реализовать тестовый вариант!
    @ParameterizedTest
    @MethodSource("homework33.WeatherDate#calculateAverageTemperature")
    void calculateAverageTemperature(List<Double> temperatures) {
        double averageTemp = 0;
        for (Double temp : temperatures) {
            averageTemp = averageTemp + temp;
        }
        averageTemp = averageTemp / temperatures.size();

        assertEquals(2, averageTemp);
    }

    @ParameterizedTest
    @CsvSource({
            "'10.0, 22.0, 0.0' , false",
            "'-1.0, 5.0, 18.0', true",
            "'5.0, 5.0, 18.0', false",
            "'5.0, 5.0, -18.0', true",
    })
    void testCheckForFrostWarnings(String temperatures, boolean expectedResult) {

        // Использован метод для преобразования String данных в Double (Для меня немного не понятен нашел в интернете)
        List<Double> newTempList = weatherManager.stringToDouble(temperatures);

        assertEquals(expectedResult, weatherManager.checkForFrostWarnings(newTempList));
    }

    @ParameterizedTest
    @CsvSource({
            "'10.0, 15.0, 18.0', 'Низкий'",
            "'20.0, 25.0, 30.0', 'Средний'",
            "'50.0, 60.0, 70.0', 'Высокий'",
            "'15.0, 20.0, 55.0', 'Средний'",
            "'5.0, 10.0, 15.0', 'Низкий'",
            "'60.0, 70.0, 80.0', 'Высокий'"
    })
    void testeValuatePrecipitationLevels(String precipitationLevels,String expectedResult){

        List<Double> precipitationList = weatherManager.stringToDouble(precipitationLevels);

        assertEquals(expectedResult,weatherManager.evaluatePrecipitationLevels(precipitationList));

    }
}
