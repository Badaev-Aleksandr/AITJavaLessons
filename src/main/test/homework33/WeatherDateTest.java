package homework33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WeatherDateTest {
    private WeatherDate weatherManager;

    public static Stream<Arguments> provideTemperatureData() {
        return Stream.of(
                Arguments.of(Arrays.asList(10.0, 20.0, 30.0), 20.0),
                Arguments.of(Arrays.asList(5.0, 10.0, 15.0), (5.0 + 10.0 + 15.0) / 3),
                Arguments.of(Arrays.asList(0.0, -5.0, -10.0), -5.0),
                Arguments.of(Arrays.asList(-2.0, -6.0, -12.0), (-2.0 + -6.0 + -12.0) / 3),
                Arguments.of(Arrays.asList(0.0, 1.0, -1.0), (0.0 + 1.0 + -1.0) / 3)
        );
    }

    public static Stream<Arguments> provideInvalidTemperatureData() {
        return Stream.of(
                Arguments.of((List<Double>) null),
                Arguments.of(Arrays.asList(), "")
        );
    }

    @BeforeEach
    void setUp() {
        weatherManager = new WeatherDate();
    }


    @ParameterizedTest(name = "{index} --> Temperatures: {0} - Average Temperature {1} " )
    @MethodSource("homework33.WeatherDateTest#provideTemperatureData")
    void testCalculateAverageTemperature(List<Double> temperatures, double expectedResult) {
        assertEquals(expectedResult, weatherManager.calculateAverageTemperature(temperatures), 0.01);
    }

    @ParameterizedTest
    @MethodSource("homework33.WeatherDateTest#provideInvalidTemperatureData")
    void testCalculateAverageTemperatureNullOrEmpty(List<Double> temperatures){
    assertThrows(IllegalArgumentException.class, ()-> {
        weatherManager.calculateAverageTemperature(temperatures);
    });
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
        List<Double> temperaturesList = weatherManager.stringToDouble(temperatures);

        assertEquals(expectedResult, weatherManager.checkForFrostWarnings(temperaturesList));
    }

    @ParameterizedTest
    @CsvSource({
            "null",
            "''"
    })
    void testCheckForFrostWarningsNullOrEmpty(String argument) {
        List<Double> temperaturesList = weatherManager.stringToDouble(argument);
        assertThrows(IllegalArgumentException.class, () -> {
            weatherManager.checkForFrostWarnings(temperaturesList);
        });
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
    void testEvaluatePrecipitationLevels(String precipitationLevels, String expectedResult) {

        List<Double> precipitationList = weatherManager.stringToDouble(precipitationLevels);

        assertEquals(expectedResult, weatherManager.evaluatePrecipitationLevels(precipitationList));

    }

    @ParameterizedTest
    @CsvSource({
            "null",
            "''"
    })
    void testEvaluatePrecipitationLevelsNullOrEmpty(String argument) {
        List<Double> precipitationList = weatherManager.stringToDouble(argument);

        assertThrows(IllegalArgumentException.class, () -> {
            weatherManager.evaluatePrecipitationLevels(precipitationList);
        });
    }
}
