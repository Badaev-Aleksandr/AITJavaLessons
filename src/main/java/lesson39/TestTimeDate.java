package lesson39;


import lombok.extern.slf4j.Slf4j;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Slf4j
public class TestTimeDate {
    public long differenceDate(LocalDate lastBirthday, LocalDate today) {
        if (lastBirthday== null || today == null){
            throw new IllegalArgumentException("Wrong parametr");
        }
        long until = lastBirthday.until(today, ChronoUnit.DAYS);
        log.info("The difference in days between the current date and your last birthday -> {} DAYS", until);
        return until;
    }
}
