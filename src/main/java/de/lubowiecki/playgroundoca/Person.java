package de.lubowiecki.playgroundoca;

import java.time.LocalDate;

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

}
