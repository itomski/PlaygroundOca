package de.lubowiecki.playgroundoca.kontrollstrukturen;

public class WhileTest {

    public static void main(String[] args) {

        int i = 100;

        // Kopfgesteuert: Bedingung wird vor der Abarbeitung des Blocks geprüft
        while(i < 100) {
            System.out.println(i += 10);
        }

        // Fußgesteuert: Bedingung wird nach der Abarbeitung des Blocks geprüft
        {
            int j = 100;
            System.out.println(i += 10);
        } while(i /* + j */ < 100); // j ist hier Out-Of-Scope


    }
}
