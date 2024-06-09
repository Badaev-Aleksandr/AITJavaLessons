package homework38;

import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Slf4j
public class TaskDateTime {
    public static void main(String[] args) {

        //Задание 1: Создание дат
        LocalDate today = LocalDate.now();
        log.info("Today-> {}", today.toString());
        LocalDate nextBirthday = LocalDate.of(2024, 8, 22);
        log.info("Next Birthday-> {}", nextBirthday.toString());

        //Задание 2: Сравнение времени
        LocalTime morning = LocalTime.of(7, 30);
        LocalTime evening = LocalTime.of(20, 45);
        boolean result = morning.isAfter(evening);
        log.info(String.valueOf(result));
        result = morning.isBefore(evening);
        log.info(String.valueOf(result));
        //Задание 2: Сравнение времени
        checkTime(morning, evening);

        //Задание 3: Разница между двумя датами
        LocalDate lastBirthday = LocalDate.of(2023, 8, 22);
        differenceDate(lastBirthday, today);

        //Задание 4: Форматирование даты и времени
        String dateTime = "2024-12-31T23:59";
        formattingDate(dateTime);

        //Задание 5: Вычисление времени до нового года
        LocalDateTime localDateTime = LocalDateTime.now();
        howLongUntilNextNewYear(localDateTime);

        //Задание 6: Определение дня недели
        dayOfWeekNextMyBirthday(nextBirthday);

        //Задание 7: Изменение времени с учетом часового пояса

        ZonedDateTime zonedDateTimeBerlin = ZonedDateTime.now();
        zonedDateTimeTokyo(zonedDateTimeBerlin);


    }

    public static void checkTime(LocalTime morningTime, LocalTime eveningTime) {
        if (morningTime.isAfter(eveningTime)) {
            log.info("After Time is -> {}, Before Time is -> {}", eveningTime, morningTime);
        }
        if (morningTime.isBefore(eveningTime)) {
            log.info("After Time is -> {}, Before Time is -> {}", eveningTime, morningTime);
        }
    }

    public static void differenceDate(LocalDate lastBirthday, LocalDate today) {
        Period day = Period.between(today, lastBirthday);
        log.info(day.toString());
        log.info("The difference in days between the current date and your last birthday -> {}", day);
        long until = lastBirthday.until(today, ChronoUnit.DAYS);
        log.info("The difference in days between the current date and your last birthday -> {} DAYS", until);
        until = lastBirthday.until(today, ChronoUnit.MONTHS);
        log.info("The difference in days between the current date and your last birthday -> {} MONTHS", until);
        until = lastBirthday.until(today, ChronoUnit.YEARS);
        log.info("The difference in days between the current date and your last birthday -> {} YEARS", until);
    }

    public static void formattingDate(String dateTimeString) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateTimeFormatter = localDateTime.format(formatter);
        log.info(dateTimeFormatter);
    }

    public static void howLongUntilNextNewYear(LocalDateTime today) {
        LocalDateTime newYear = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        Duration duration = Duration.between(today, newYear);
        long until = duration.toDays();
        log.info("Days left until the next New Year from the current date and time -> {} Days", until);
        until = duration.toHours();
        log.info("Hours left until the next New Year from the current date and time -> {} Hours", until);
        until = duration.toMinutes();
        log.info("Minutes left until the next New Year from the current date and time -> {} Minutes", until);
    }

    public static void dayOfWeekNextMyBirthday(LocalDate nextBirthday) {
        DayOfWeek dayOfWeekNextBirthday = nextBirthday.getDayOfWeek();
        log.info(dayOfWeekNextBirthday.toString());
    }

    public static void zonedDateTimeTokyo(ZonedDateTime zonedDateTime) {
        log.info("Zoned date time local -> {}", zonedDateTime.toString());
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTimeTokyo = zonedDateTime.withZoneSameInstant(tokyo);
        log.info("Zoned date time Tokyo -> {}", zonedDateTimeTokyo.toString());
    }
}
