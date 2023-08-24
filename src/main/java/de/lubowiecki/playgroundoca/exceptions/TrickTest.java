package de.lubowiecki.playgroundoca.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TrickTest {

    public static void main(String[] args) {

        // Unchecked
        try {
            // Kann SorceCode enthalten, dass keine Exception wirft/deklariert
            System.out.println("ABC");
            //machWasAnderes();

        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }


        // Checked
        try {
            // Der SorceCode im Try MUSS eine Möglichkeit haben eine IOException oder ein Child davon deklarieren
            System.out.println("ABC");
            // throw new IOException();
            List<String> zeilen = Files.readAllLines(Paths.get("abc.txt")); // Kann eine IOException werfen
            // machWas();
        }
        catch(IOException e) { // Es darf nichts gefangen werden, was im Try niemals auftauchen kann
            System.out.println(e.getMessage());
        }

        // Ausnahme: Checked
        // Exception ist checked
        try {
            System.out.println("ABC");
        }
        catch(Exception e) { // Exception ist die enizige CheckedException, die gefangen werden kann, obwohl sie gar nicht auftaucht
            System.out.println(e.getMessage());
        }
    }

    // bei throws kann eine Exception (checked oder unchecked) deklariert werden, die im Body gar nicht auftaucht
    static public void machWas() throws IOException {

    }

    // throws kann Checked und Unchecked-Exception deklarieren
    // Aber nur die Checked-Exceptions MÜSSEN behandelt werden
    static public void machWasAnderes() throws RuntimeException, IOException, NullPointerException {

    }
}
