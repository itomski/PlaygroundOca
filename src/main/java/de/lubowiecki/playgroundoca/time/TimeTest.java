package de.lubowiecki.playgroundoca.time;

import java.time.*;

public class TimeTest {

    public static void main(String[] args) {

        // LocalDate, LocalTime und LocalDateTime sind immutable und haben keine verwendbaren Konstruktor

        LocalDate date = LocalDate.now(); // aktuelles Datum
        date = LocalDate.of(2024, 6, 30);
        System.out.println(date);

        System.out.println();

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println();

        Instant start = Instant.now(); // Maschinenzeit in Nanosekunden
        //System.out.println(nowInstant);

        // date = LocalDate.from(nowInstant); // Error, da Instant auch die Zeit enthält
        // System.out.println(date);

        final int MAX_COUNT = 10_000_000;

        int[] zufallsZahlen = new int[MAX_COUNT];

        for(int i = 0; i < MAX_COUNT; i++) {
            zufallsZahlen[i] = (int)(Math.random() * 10) + 1;
            // System.out.println(zufallsZahlen[i]);
        }

        Instant ende = Instant.now();

        System.out.println(Duration.between(start, ende).toMillis() + " ms");

    }

}
