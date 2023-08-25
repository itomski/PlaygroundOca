package de.lubowiecki.playgroundoca.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FuncInterfaceTest2 {

    public static void main(String[] args) {

        Randomizer r1 = () -> 10;
        System.out.println(r1.rand());

        // Ein Lambda ist eine anonyme Klasse, die das Interface implementiert
        Randomizer r2 = () -> (int)(Math.random() * 10) + 1;
        System.out.println(r2.rand());

        // Methodenreferenz: Verweis auf eine Methode mit gleicher Parameterliste und Rückgabetyp
        Randomizer r3 = FuncInterfaceTest2::getValue;
        System.out.println(r3.rand());

        System.out.println();

        // Bei nur einem Parameter können die Klammern weggelassen werden
        Formatter fmt1 = s -> s.toUpperCase();
        System.out.println(fmt1.change("Hi"));

        // Wird der Typ vorgegeben, müssen Klammern mitgeschrieben werden
        Formatter fmt2 = (String s) -> s.toUpperCase();
        System.out.println(fmt2.change("Hi"));

        // Methodenreferenz
        Formatter fmt3 = FuncInterfaceTest2::changeValue;
        System.out.println(fmt3.change("Hi"));

        // Bei mehr als einem Parameter müssen die Klammer benutzt werden

        Formatter fmt4 = (String s) -> {
            s += "XYZ";
            s = s.toLowerCase();
            return s; // Definiert die Abstrakte Methode einen Rückgabetyp muss hier ein return erfolgen
        };

        System.out.println(fmt4.change("Moin"));

        final int a = 10;
        int b = 20;

        // effektiv final: wird nachträglich nicht geändert
        // final: kann nachträglich nicht mehr geändert werden

        Formatter fmt5 = (String s) -> {
            s += "XYZ";
            // Variablen, die außerhalb des Lambdas deklariert sind, können verwendet werden
            // Diese Variablen müssen final oder effektiv final sein
            s += a + b;
            s = s.toLowerCase();
            return s; // Definiert die Abstrakte Methode einen Rückgabetyp muss hier ein return erfolgen
        };

        // a = 300; // Error: ist final, daf nicht geändert werden
        // b = 400; // Error: ist nicht mehr effektiv final, daf nicht nicht im Lambda verwendet werden

        System.out.println(fmt5.change("Moin"));

        // Lambdas werden dort verwendet, wo verschiedene Implementierungen genutzt werden müssen
        // aber diese Implementierungen an anderen Stellen nicht verwendet werden
        // und damit das Schreiben einer implementieren Klasse wegen der mangelnden Wiederverwendbarkeit
        // zu viel ist.

        List<String> strList = Arrays.asList("Peter", "Bruce", "Tony", "Carol"); // Produziert eine FixSizeList
        String erg = strList.stream()
                        .filter(s -> s.length() > 4) // Predicate<String>
                        .map(s -> s.toUpperCase()) // Function<String, String>
                        .reduce("Start:", (x, y) -> x + " " + y); // BinaryOperator<String>

        System.out.println(erg);

        System.out.println();

        // void accept(T t)
        strList.forEach(s -> System.out.println(s)); // Consumer<String>

        strList = new ArrayList<>(strList); // Änderung von FixSizeList auf flexible Liste
        // boolean test(T t)
        strList.removeIf(s -> s.length() < 5); // Predicate<String>

        System.out.println(strList);

        Predicate<Integer> pred1 = i -> i > 0;
        Predicate<Integer> pred2 = i -> i > 100;

        List<Integer> zahlen = new ArrayList(Arrays.asList(5,7,22,18,1,100,-15,18,-22,1000));

        // zahlen.removeIf(pred1.negate());
        zahlen.removeIf(pred1.negate().or(pred2));
        System.out.println(zahlen);

        if(pred1.negate().or(pred2).test(1200)) {
            System.out.println("Passt");
        }

        System.out.println();

        // int compare(T o1, T o2);
        Comparator<String> comp1 = (s1, s2) -> s1.length() - s2.length();

        List<String> namenList = new ArrayList(Arrays.asList("Peter", "Bruce", "Tony", "carol", "Bob", "Ed", "Natasha"));
        //namenList.sort(comp1);
        //namenList.sort((s1, s2) -> s1.length() - s2.length());
        namenList.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println(namenList);
    }

    public static int getValue() {
        return 100;
    }

    public static String changeValue(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}

// SAM: Single Abstract Method
@FunctionalInterface
interface Randomizer {

    // Das Lambda implementiert die abstrakte Methode
    int rand();


    // Kann statische und default Methoden enthalten

    // Kann alle Methoden von Object als abstrakte Methoden enthalten - sie werden nicht mitgezählt
    int hashCode();

}

interface Formatter {

    String change(String str);

}