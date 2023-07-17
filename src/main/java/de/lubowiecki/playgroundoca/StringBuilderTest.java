package de.lubowiecki.playgroundoca;

import java.time.LocalDate;
import java.util.Objects;

public class StringBuilderTest {

    public static void main(String[] args) {

        // Intern wird ein Array von Zeichen gebaut
        // Standard capacity von 16
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity()); // Liefert die Größe des internen Arrays

        sb.append("Das ");
        sb.append("ist ");
        sb.append("ein ");

        // Fast alle Method des StringBuiolders liefern eine Referen auf das StringBulder-Objekt zurück
        sb.append("Haus ").append("von ").append("Nikigraus.");

        // Vergößerung: alte capacity * 2 + 2
        System.out.println(sb.capacity());

        String inhalt = sb.toString(); // Baut aus dem StringBuilder einen immutable String

        System.out.println();

        StringBuilder sb2 = new StringBuilder("Angangstext"); // Anzahl der Zeichen + 16 (27)
        System.out.println(sb2.capacity());

        StringBuilder sb3 = new StringBuilder(1000); // Capacity von 1000
        System.out.println(sb3.capacity());

        sb3.trimToSize(); // Schneidet die capacity auf benötigte Größe

        // Stellt sicher, dass der Stringbulder groß genug ist um 100 Zeichen aufzunehmen
        // ist er das nicht, wird gem. den Regeln vergrößert
        sb3.ensureCapacity(100);

        sb3.setLength(10); // Scheidet die Länge auf 10 zu ... ggfl. gehen Inhalte verloren

        sb3.delete(10, 15); // Löscht von index 10 bis 15 (Endindex exclusive)

        sb3.insert(10, "Hallo"); // Setzt gewünschten Inhalt an Position 10

        sb3.replace(5, 10, "..."); // Ersetzt die Zeichen zwischen Position 5 und 10 mit ...

        System.out.println(sb3.length()); // Anzahl enthaltener Zeichen

        System.out.println();

        NextStudent s = new NextStudent();
        s.setVorname("Peter")
                .setNachname("Parker")
                .setGeburtsdatum(LocalDate.now());

        System.out.println(s);


    }
}

class NextStudent {

    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;

    public NextStudent setVorname(String vorname) {
        this.vorname = vorname;
        return this; // this ist eine Referenz auf DIESES Objekt
    }

    public NextStudent setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    public NextStudent setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NextStudent{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsdatum=").append(geburtsdatum);
        sb.append('}');
        return sb.toString();
    }

    /*
    @Override
    public String toString() {
        return "NextStudent{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                '}';
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NextStudent that = (NextStudent) o;
        return Objects.equals(vorname, that.vorname) && Objects.equals(nachname, that.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname);
    }
}
