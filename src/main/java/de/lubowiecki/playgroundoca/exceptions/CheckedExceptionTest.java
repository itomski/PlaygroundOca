package de.lubowiecki.playgroundoca.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        String s = null;

        // UnCheckedException
        try {
            // Exception kann auftreten, kann, muss aber NICHT behandelt werden
            System.out.println(s.length()); // NullPointerException
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // CheckedException
        Path pfad = Paths.get("data.txt");

        // IOException MUSS behandelt werden!
        // Ohne Behandlung kann der Sourcecode nicht kompiliert werden!

        try {
            List<String> zeilen = Files.readAllLines(pfad); // Files.readAllLines liefert alle Zeilen der Datei
        }
        catch (IOException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace(); // Gibt die Meldung in System.err
        }

        // Kann eine Exception werfen - Exception ist Checked d.h. ich muss behandeln
        try {
            doSometing();
        }
        catch (Exception e) {
            System.out.println("Problem");
        }

        // throws deklariert eine RuntimeException. Behandlung ist optional
        doSometingElse();

        try {
            System.out.println(checkAlter(150));
        }
        catch(ZuJungException e) {
            System.out.println("Du bist zu jung. Versuche es später...");
        }
        catch(ZuAltException e) {
            System.out.println("Du bist zu alt. Sorry...");
        }

        System.out.println("Programmende"); // Gibt die Meldung in System.out
    }

    // throws ist ein Hinweis, dass hier eine Exception auftreten könnte
    // ist die Exeception hier throws Checked wird eine Behandlung erzwungen
    public static void doSometing() throws Exception {
        System.out.println("Das ist das Haus von Nikigraus!");
    }

    public static void doSometingElse() throws RuntimeException {
        System.out.println("Das ist das Haus von Mickymouse!");
    }

    public static int checkAlter(int alter) {
        if(alter < 18) {
            throw new ZuJungException();
        }

        if(alter > 100) {
            throw new ZuAltException();
        }

        return Objects.hash(new Object());
    }
}

class ZuJungException extends RuntimeException {
}

class ZuAltException extends RuntimeException {
}
