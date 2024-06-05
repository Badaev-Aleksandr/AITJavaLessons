package lesson38;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class JavaTimeMuster {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 05, 20);
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTimeNew = LocalTime.of(13, 45);
        System.out.println(localTimeNew);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTimeNew);
        System.out.println(localDateTime);
        LocalDateTime localDateTimeNew = LocalDateTime.of(2024, 9, 12, 00, 45, 15);
        System.out.println(localDateTimeNew);

        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 1, 1, 12, 45);
        ZoneOffset zoneOffset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime1, zoneOffset);
        System.out.println(offsetDateTime);

        LocalDateTime localDateTime2 = LocalDateTime.of(2024, 6, 4, 20, 30, 39);
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime2, zoneId);
        System.out.println(zonedDateTime);

        YearMonth yearMonth = YearMonth.of(2024, Month.APRIL);
        System.out.println(yearMonth);
        MonthDay monthDay = MonthDay.of(Month.AUGUST, 22);
        System.out.println(monthDay);
        Year year = Year.of(2024);
        System.out.println(year);

        LocalDate localDate1 = LocalDate.of(2024, 01, 01);
        System.out.println(localDate1);
        localDate1 = localDate1.plusDays(24);
        System.out.println(localDate1);
        localDate1 = localDate1.plusDays(36);
        System.out.println(localDate1);
        localDate1 = localDate1.minusDays(20);
        System.out.println(localDate1);


        if (LocalDate.now().isAfter(localDate1)) {
            System.out.println("is after now");
        } else {
            System.out.println("is not after now");
        }

        LocalDate date = LocalDate.parse("2024-12-02");
        System.out.println(date);
        LocalDateTime localDateTimeToParse = LocalDateTime.parse("2020-02-02T12:30:23");
        System.out.println(localDateTimeToParse);

        String format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY).format(LocalDate.of(2024, 04, 01));
        System.out.println(format);

        LocalDate startLocaldate = LocalDate.parse("2024-02-02");
        LocalDate endLocalDate = LocalDate.parse("2024-12-04");
       long until = startLocaldate.until(endLocalDate, ChronoUnit.MONTHS);
        System.out.println(until);






    }
}
