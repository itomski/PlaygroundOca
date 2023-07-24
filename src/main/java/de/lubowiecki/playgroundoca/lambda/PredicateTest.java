package de.lubowiecki.playgroundoca.lambda;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        // Die Abstrakte Methode des Predicats heißt test
        // nimmt einen Wert entgegen
        // liefert IMMER boolean zurück!

        // Ist die Zahl größer als 10 und kleiner als 100?
        // Ist die Person älter als 10 Jahre?

        String s = "Hallo Welt";

        // Hat der String eine Länge von mind. 2 Zeichen?
        // boolean test(T t)
        Predicate<String> minLength2 = str -> str.length() >= 2;

        System.out.println(minLength2.test(s));
        System.out.println(minLength2.test("Peter Parker"));
        System.out.println(minLength2.test("x"));

        System.out.println();

        // Enthält der String ein @-Zeichen?
        // boolean test(T t)
        Predicate<String> conatinsAt = str -> str.contains("@");

        conatinsAt = str -> {
            return str.contains("@");
        };

        System.out.println(conatinsAt.test("peter.parker@shield.org"));
        System.out.println(conatinsAt.test("bruce.banner$shield.org"));

        System.out.println();

        // Zwei Predicates werden zu einer AND-Bedingung zusammengeschlatet
        System.out.println(conatinsAt.and(minLength2).test("bruce.banner$shield.org"));
        System.out.println(minLength2.and(conatinsAt).test("@"));
        System.out.println(conatinsAt.and(minLength2).test("bruce.banner@shield.org"));

        System.out.println();

        // Zwei Predicates werden zu einer OR-Bedingung zusammengeschlatet
        System.out.println(conatinsAt.or(minLength2).test("bruce.banner$shield.org"));
        System.out.println(minLength2.or(conatinsAt).test("&"));
        System.out.println(conatinsAt.or(minLength2).test("bruce.banner@shield.org"));

        System.out.println();

        // Enthält NICHT ein @
        System.out.println(conatinsAt.negate().test("bruce.banner$shield.org"));

    }
}
