package lesson38;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

@Slf4j
public class TimeTask {
    public static void main(String[] args) {
        /*
        Создание и вывод даты
**Задача**: Создайте объект `LocalDate` для вашего дня рождения и
выведите его на консоль в формате "гггг-мм-дд".
         */
        LocalDate localDate = LocalDate.of(1992, 8, 22);
        log.info(localDate.toString());

        LocalTime localTime = LocalTime.now();
        log.info(localTime.toString());
        localTime = localTime.plusMinutes(90);
        log.info(localTime.toString());


        /*
        Разница между датами
**Задача**: Создайте два объекта `LocalDate`: один для первого дня текущего
года и другой для сегодняшнего дня. Используйте `Period`,
чтобы вычислить разницу между этими датами в годах, месяцах и днях.
Выведите результат на консоль.
         */
        LocalDate localDateStart = LocalDate.of(2024, 1, 1);
        log.info(localDateStart.toString());
        LocalDate localDateNow = LocalDate.now();
        log.info(localDateNow.toString());
        long until = localDateStart.until(localDateNow, ChronoUnit.DAYS);
        log.info(String.valueOf(until));
        until = localDateStart.until(localDateNow, ChronoUnit.MONTHS);
        log.info(String.valueOf(until));
        until = localDateStart.until(localDateNow, ChronoUnit.YEARS);
        log.info(String.valueOf(until));

        /*
        Форматирование даты
**Задача**: Создайте объект `LocalDate` для случайной даты и отформатируйте
его в виде строки в формате "дд.мм.гггг". Выведите эту строку на консоль.
         */
        LocalDate localDateRandom = LocalDate.now();
        log.info(localDateRandom.toString());
        String date = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMANY).format(localDateRandom);
        log.info(date);

        // выводим так как нам нужно
        String localDateRandomIndividualFormated = DateTimeFormatter.ofPattern("dd*MM*yyyy").format(localDateRandom);
        log.info(localDateRandomIndividualFormated);

        /*
        Создайте объект `ZonedDateTime` для текущего момента времени в часовом
        поясе GMT (Лондон). Преобразуйте его в часовой пояс EST (Нью-Йорк) и
        выведите оба объекта на консоль для сравнения.
         */
        ZonedDateTime zonedDateTimeNowGMT = ZonedDateTime.now(ZoneId.of("GMT"));
        log.info(zonedDateTimeNowGMT.toString());
        zonedDateTimeNowGMT = ZonedDateTime.now(ZoneId.of("America/New_York"));
        log.info(zonedDateTimeNowGMT.toString());




    }
}
