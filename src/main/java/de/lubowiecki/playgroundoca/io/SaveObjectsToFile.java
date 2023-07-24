package de.lubowiecki.playgroundoca.io;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SaveObjectsToFile {

    public static void main(String[] args) {

        List<Scout> scouts = new ArrayList<>();

        scouts.add(new Scout("Peter", "Parker", LocalDate.of(1998, 12, 1)));
        scouts.add(new Scout("Bruce", "Banner", LocalDate.of(1982, 5, 10)));

        Path path = Paths.get("scouts.ser");

        // ObjectOutputStream schreibt Objekte
        try(ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path))) {

            out.writeObject(scouts); // Serialisiert die Liste von Objekten und schreibt alles in die Datei

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
