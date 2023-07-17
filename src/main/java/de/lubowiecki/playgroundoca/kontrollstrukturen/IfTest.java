package de.lubowiecki.playgroundoca.kontrollstrukturen;

public class IfTest {

    public static void main(String[] args) {

        int i = 100;

        if(i < 100) { // Wenn
            System.out.println("Zu klein!"); // Dann
        }

        System.out.println();

        if(i < 100) { // Wenn
            System.out.println("Zu klein!"); // Dann
        }
        else {
            System.out.println("Passend"); // Sonst
        }

        System.out.println();

        if(i < 50) { // Wenn
            System.out.println("kleiner 50!"); // Dann
        }
        else if(i < 100) { // Sonst-Wenn
            System.out.println("kleiner als 100"); // Dann
        }
        else
            System.out.println("Passend"); // Sonst

        System.out.println();

        // Werden die Klammer weggelassen, gehört lediglich die nächste Anweisung zum Block
        // Nächste ANweisung endet mit dem ;

        if(i < 50) System.out.println("kleiner 50!");
        else if(i < 100) System.out.println("kleiner als 100");
        else System.out.println("Passend");

        if(i < 50) System.out.println("kleiner 50!");
        else if(i < 100); System.out.println("kleiner als 100");
        // else System.out.println("Passend"); // Error: Es fehlt das if für dieses else

        i = 80;

        if(i > 50) // 3
        if(i > 70) // 2
        if(i > 100) // 1
        System.out.println("C");
        else // 1
        System.out.println("B");
        else // 2
        System.out.println("A");



    }
}
