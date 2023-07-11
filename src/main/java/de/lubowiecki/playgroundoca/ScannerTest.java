package de.lubowiecki.playgroundoca;

import java.util.Scanner;

public class ScannerTest {

    private final Scanner scanner = new Scanner(System.in);

    private static final String KEYS = "\n-----------------------------\n" +
                                        "\t exit = Programmende \n" +
                                        "\t keys = Befehle \n" +
                                        "-----------------------------\n";

    public static void main(String[] args) {
        new ScannerTest().go(); // Wechsel vom statischen auf Instanzkontext
    }

    private void go() { // Ist eine Instanzmethode

        // Darf alle Instanz-Variblen und -Methoden verwenden

        while(true) { // Endlosschleife
            System.out.print("Eingabe: ");
            String eingabe = scanner.nextLine();
            System.out.println("Deine Eingabe: " + eingabe);

            if(eingabe.equalsIgnoreCase("exit")) {
                break; // bricht die While-Schleife ab
            }
            else if (eingabe.equalsIgnoreCase("keys")) {
                System.out.println(KEYS);
            }
        }

        System.out.println("Programmende");
    }
}
