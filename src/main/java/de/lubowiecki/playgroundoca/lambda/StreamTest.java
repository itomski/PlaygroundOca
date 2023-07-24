package de.lubowiecki.playgroundoca.lambda;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // Streams sind Pipelines für Werte
        // Können endlos sein

        // Supplier (Fabrik) für primitive ints
        IntSupplier w6 = () -> (int)(Math.random() * 6) + 1;

        // Seit Java 1.8
        IntStream.generate(w6)
                .filter(w -> w > 2) // Entfernt Zahlen kleiner gleich 2
                .forEach(w -> System.out.println(w));


    }
}
