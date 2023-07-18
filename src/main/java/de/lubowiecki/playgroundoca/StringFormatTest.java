package de.lubowiecki.playgroundoca;

import java.util.Locale;
import java.util.Scanner;

public class StringFormatTest {

    public static void main(String[] args) {

        // Locale.setDefault(Locale.US); // Standard ist in DE Locale.GERMANY

        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble(); // Eingabe wird lokalisiert
        scanner.nextLine(); // fix
        System.out.printf("%.2f EUR", price); // Ausgabe wird lokalisiert

        price = Double.parseDouble(scanner.nextLine()); // Eingabe wird NICHT lokalisiert
        System.out.println(price); // Ausgabe wird NICHT lokalisiert

    }
}
