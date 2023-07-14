package de.lubowiecki.playgroundoca;

import java.time.LocalDate;
import java.util.Objects;

// Bauplan zum Bauen von Personen-Objekten
public class Person { // Klassendeklaration

    // Eigenschaften/Variablen beschreiben den Zustand

    String vorname; // Instanzvariablen

    String nachname;

    int groesse;

    LocalDate geburtsDatum;

    boolean lebendig;


    // Methoden sind die Fähigkeiten
    void sagHallo() { // Instanzmethode
        System.out.println("Hi, mein Name ist " + vorname + " " + nachname);
    }

    @Override
    public void finalize() {
        System.out.println("....UGHRRRRRRR!!!!!!....");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return groesse == person.groesse && lebendig == person.lebendig && Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname) && Objects.equals(geburtsDatum, person.geburtsDatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, groesse, geburtsDatum, lebendig);
    }
}
