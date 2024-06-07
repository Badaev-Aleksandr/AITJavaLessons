package lesson39;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTimeDateTest {
    @Test
    void testDifferenceDaysPositive(){
        TestTimeDate timeDate = new TestTimeDate();
        LocalDate localDate = LocalDate.of(2020,06,06);
        LocalDate localDate1 = LocalDate.of(2024,06,06);
        assertEquals(1461,timeDate.differenceDate(localDate,localDate1));
    }
    @Test
    void testDifferenceDaysNegative(){
        TestTimeDate timeDate = new TestTimeDate();
        LocalDate localDateNow = null;
        LocalDate lastBirthday = LocalDate.of(2024,06,06);
        assertThrows(IllegalArgumentException.class, () -> {
            timeDate.differenceDate(lastBirthday,localDateNow);
        });
    }
}
