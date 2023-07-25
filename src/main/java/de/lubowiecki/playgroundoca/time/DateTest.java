package de.lubowiecki.playgroundoca.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTest {

    public static void main(String[] args) {

        // Jahre, Monate, Wochen, Tage
        LocalDate heute = LocalDate.now();

        System.out.println(heute);

        heute = heute.plusDays(10);
        System.out.println(heute);

        heute = heute.plusMonths(10);
        System.out.println(heute);

        heute = heute.minusYears(10);
        System.out.println(heute);

        heute = heute.minusWeeks(10);
        System.out.println(heute);

        Period zeitraum = Period.of(2, 10, 12); // Zeitraum ohne konkreten Startpunkt
        heute = heute.plus(zeitraum);
        System.out.println(heute);

        // LocalDate unterstützt folgende Einheiten:
        // ChronoUnit.DAYS, ChronoUnit.MONTHS, ChronoUnit.YEARS, ChronoUnit.WEEKS, ChronoUnit.DECADES
        // heute = heute.plus(100, ChronoUnit.SECONDS); // Error: Sekunden sind im Datum nicht enthalten
        heute = heute.plus(100, ChronoUnit.DAYS); // 100 Tage
        System.out.println(heute);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("eeee, d.M.yy");
        System.out.println(heute.format(fmt));

        // Manipuliert nur den Tag des Monats
        heute = heute.with(ChronoField.DAY_OF_MONTH, 1);
        System.out.println(heute);

        LocalDateTime ldt = heute.atTime(10, 17); // Kombiniert das Datum mit einer Uhrzeit
        System.out.println(ldt);

        // ChronoUnit = Eine Bestimmte Einheit in der etwas gemessen werden kann
        // ChronoField = Eine Bestimmte Information innerhalb der Datums- oder Zeitangabe

        // ChronoField.MICRO_OF_DAY
        // ChronoUnit.NANOS

        // Period: Zeitraum (z.B. zwischen zwei LocalDates) (OCA)
        LocalDate startWm = LocalDate.of(2026, 6, 1);
        Period abstand = Period.between(LocalDate.now(), startWm);
        System.out.println(abstand.getDays() + " Tage");
        System.out.println(abstand.getMonths() + " Monate");
        System.out.println(abstand.getYears() + " Jahre");
    }
}
