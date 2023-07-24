package de.lubowiecki.playgroundoca.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class SaveToFile {

    public static void main(String[] args) {

        // Relativ
        Path path = Paths.get("data1.txt");

        /*
        try {
            BufferedWriter out = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
            out.write("Das ist ein Haus von Nikigraus");
            out.newLine();
            out.flush(); // ist der Buffer nicht voll, wird mit flush trotzdem geschrieben
            out.close(); // Schließt die Verbindung zur Datei
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        */

        // try-with-ressources : schließt am ende des try-Blocks automatisch alles geöffneten Ressourcen
        try(BufferedWriter out = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            out.write("Das ist ein Haus von Nikigraus\n");
            //out.flush(); // wird beim close automatisch ausgeführt
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
