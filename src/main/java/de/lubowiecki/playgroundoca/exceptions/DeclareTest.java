package de.lubowiecki.playgroundoca.exceptions;

public class DeclareTest {

    public static void main(String[] args) {

        System.out.println("START");

        // Unchecked
        try {
            doFirst();
            // Bei einer Exception, wird die Abarbeitung des TRY-Blocks sofort abgefrochen!
            // Es wird sofort in den passenden Catch-Block gesprungen
        }
        catch(RuntimeException e) {
            e.printStackTrace();
        }

        // Checked
        try {
            doFirstChecked();
            // Bei einer Exception, wird die Abarbeitung des TRY-Blocks sofort abgefrochen!
            // Es wird sofort in den passenden Catch-Block gesprungen
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("ENDE");
    }

    static void doFirst() {
        doNext();
    }

    static void doNext() {
        // RuntimeExceptions werden auch ohne Deklaration weiter nach oben gegeben
        throw new RuntimeException("Problem in doNext");
    }

    static void doFirstChecked() throws Exception {
        // CheckedExceptions: wird die Exception nicht deklariert, MUSS sie hier behandelt werden!
        doNextChecked();
    }

    static void doNextChecked() throws Exception {
        // CheckedExceptions werden NUR mit einer Deklaration weiter nach oben gegeben
        throw new Exception("Problem in doNextChecked");
    }
}
