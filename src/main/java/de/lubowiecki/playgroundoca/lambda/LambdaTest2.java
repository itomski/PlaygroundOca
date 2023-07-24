package de.lubowiecki.playgroundoca.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaTest2 {

    private static int staticZahl = 100;
    private int instanzZahl = 100;

    public static void main(String[] args) {


        List<Integer> zahlen = new ArrayList<>(List.of(2,10,55,17,1,18,100,200,4,2,19,27));

        System.out.println(zahlen);

        // Lambdas können lesend und schreiben auf Instanz und Klasseneigenschaften zugreifen
        // Instanz-Variable muss natürlichich sichtbar sein

        // void accept(T t);
        Consumer<Integer> c1 = s -> System.out.println("#" + (s * staticZahl) + "#");
        zahlen.forEach(c1);

        System.out.println();

        // boolean test(T t);
        Predicate<Integer> p1 = z -> {
            staticZahl++; // Schreibender Zugriff auf Klassenvariable
            return z > 50;
        };
        zahlen.removeIf(p1);
        System.out.println(zahlen);

        System.out.println();

        int wert1 = 50;
        final int wert2 = 50;

        // R apply(T t);
        UnaryOperator<Integer> u1 = (z) -> z * 10 * wert1 * wert2;
        zahlen.replaceAll(u1);

        // wert1 = 70; // wert1 wurde verändert und ist daher nicht mehr effektiv final. Fehler im Lambda
        // wert2 = 70; // wert2 ist final, darf nicht geändert werden

        System.out.println(zahlen);

        Consumer<Integer> cons1 = generateLambda();

    }

    public static Consumer<Integer> generateLambda() {
        int i = 100;
        return (w) -> System.out.println(w + i); // i-Variable wird durch den Kompiler mit demaktuellen Wert von i ersetzt
    } // Am Ende der Methode wird i vom Stack entfernt

}
