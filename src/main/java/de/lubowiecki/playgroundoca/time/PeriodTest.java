package de.lubowiecki.playgroundoca.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    public static void main(String[] args) {

        // Period ist immutable
        Period p1 = Period.of(2, 25, 100);
        System.out.println(p1);
        System.out.println(p1.normalized()); // in höhere Einheiten umrechnen
        // beim normalisieren werden Tage nicht in Monate umgerechnet!!!!!

        LocalDate heute = LocalDate.now();
        System.out.println(heute);

        Period eineWoche = Period.ofWeeks(1);
        Period einMonat = Period.ofMonths(1);

        heute = heute.plus(einMonat);
        System.out.println(heute);

        heute = LocalDate.of(2023, 7, 31);
        System.out.println(heute);
        System.out.println(heute.plus(einMonat)); // Bleibt am letzten Tag des Monats stehen
        System.out.println(heute.plusDays(31));

    }
}
