package de.lubowiecki.playgroundoca.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {

    public static void main(String[] args) {

        LocalTime jetzt = LocalTime.now();
        System.out.println(jetzt);

        jetzt = jetzt.plusMinutes(10);
        System.out.println(jetzt);

        jetzt = jetzt.minus(2, ChronoUnit.HOURS);
        System.out.println(jetzt);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(jetzt.format(fmt));

        // Zeiträume für Zeit (Stunden, Minuten, Sekunden etc.) werden als Duration festgehalten (OCP)

    }

}
