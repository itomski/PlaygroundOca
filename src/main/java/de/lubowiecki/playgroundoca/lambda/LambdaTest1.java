package de.lubowiecki.playgroundoca.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaTest1 {

    public static void main(String[] args) {

        Greeter a = () -> System.out.println("Hallo... schön, dass ich hier bin");
        Greeter b = () -> System.out.println("Hi. Was los?");
        Greeter c = () -> System.out.println("...");

        doSomething(c);

        // Ein Lambda-Ausdruck realisiert IMMER die abstrakte Methode des Interface
        Operator o1 = (z1, z2) -> z1 * z2;
        doSomethingElse(10, 25.5, o1);

        //BinaryOperator<Integer> bo = (z1, z2) -> z1 * z2;

        Operator o2 = (z1, z2) -> z1 * z2 / 100;
        doSomethingElse(10, 25.5, o2);

        doSomethingElse(10, 25.5, (z1, z2) -> z1 + z2 * 100);

        // Consumer: Nimmt einen Wert entgegen und liefert void zurück!
        // Predicate: Prüft einen Wert gegen eine Behauptung (liefert boolean zurück)
        // Function: Transformiert einen Wert in einen anderen (der Datentyp kann sich dabei ändern)
        // UnaryOperator: Transformiert einen Wert in einen anderen (der Rückgabetyp muss gleich dem Eingangstyp bleiben)
        // Supplier: Produziert einen Wert. Nimmt nichts entgegen

        Supplier<Integer> w6 = () -> (int)(Math.random() * 6) + 1;
        Supplier<Integer> w10 = () -> (int)(Math.random() * 10) + 1;
        Supplier<Integer> w100 = () -> (int)(Math.random() * 100) + 1;

        System.out.println(w6.get());
        System.out.println(w10.get());
        System.out.println(w100.get());
        System.out.println(w6.get());
        System.out.println(w10.get());
        System.out.println(w100.get());
        System.out.println(w6.get());
        System.out.println(w10.get());
        System.out.println(w100.get());



    }

    private static void doSomething(Greeter g) {
        System.out.println("-----------------");
        g.greet();
        System.out.println("-----------------");
    }

    private static void doSomethingElse(double x, double y, Operator op) {
        System.out.println("########################");
        System.out.println(op.run(x, y));
        System.out.println("########################");
    }
}

interface Greeter {
    void greet();
}

@FunctionalInterface
interface Operator {
    double run(double a, double b);
    //int run(int a, int b); // im FunctionalInterface darf es nur eine einzige abstrakte Methode geben
}
