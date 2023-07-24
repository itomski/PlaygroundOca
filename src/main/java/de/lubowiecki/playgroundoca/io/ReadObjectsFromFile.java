package de.lubowiecki.playgroundoca.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadObjectsFromFile {

    public static void main(String[] args) {

        Path path = Paths.get("scouts.ser");

        List<Scout> scouts = null;

        // ObjectInputStream liest Objekte ein
        try(ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path))) {

            scouts = (List<Scout>) in.readObject(); // Inhalt der Datei wird in Objekt umgewandelt

        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for(Scout s : scouts) {
            System.out.println(s.getFirstname() + " " + s.getLastname());
        }

    }
}
