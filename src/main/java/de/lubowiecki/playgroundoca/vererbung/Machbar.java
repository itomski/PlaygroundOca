package de.lubowiecki.playgroundoca.vererbung;

public interface Machbar {

    // alle Eigenschaften in einem Interface sind per default public static final
    int ZAHL = 100;

    // Interfaces haben keine Konstruktoren, da sie nicht instanzierbar sind

    // Alle Instanzmethode eines Interface sind public
    // Alle Instanzmethode eines Interface sind abstract (außer ab Java 1.8 default Methoden)

    // Beschreibt, WAS gemacht wird aber nicht WIE es gemacht wird
    int runOperation(int a, int b); // Abstrakte Methode

    // default: Standardimplementierung
    // d.h. Klassen, die diese Methode nicht selbst einbauen erben die Standardimplementierung
    default double runOperation(double a, double b) {
        return a + b;
    }
}
