package de.lubowiecki.playgroundoca.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

public class LocalDateTimeTest {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        ldt = LocalDateTime.of(2000, 10, 15, 15, 9, 10);
        System.out.println(ldt);

        ldt = LocalDateTime.of(LocalDate.now(), LocalTime.NOON);
        System.out.println(ldt);

        int i = ldt.getDayOfYear();
        System.out.println(i);
        long l = ldt.getLong(ChronoField.DAY_OF_YEAR);
        System.out.println(l);

        System.out.println(ldt.atZone(ZoneId.of("Europe/Lisbon")));

        /*
        for(String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }
        */

        System.out.println();

        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.startsWith("Europe/"))
                .forEach(System.out::println);
    }


}
