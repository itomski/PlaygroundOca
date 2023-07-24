package de.lubowiecki.playgroundoca.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {

    public static void main(String[] args) {

        Path path = Paths.get("data1.txt");

        /*
        try(BufferedReader in = Files.newBufferedReader(path)) {
            String line = null;
            // Nur die aktuelle Zeile der Datei muss in den Speicher eingelesen werden
            while((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        */

        /*
        try {
            // Vollständige Datei muss in den Speicher eingelesen werden
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

        // Seit Java 8
        try {
            // Mit Streams und Lambdas
            // Nur die aktuelle Zeile der Datei muss in den Speicher eingelesen werden
            // Files.lines(path).forEach(System.out::println); // Methodenreferenz
            Files.lines(path).forEach(l -> System.out.println(l)); // Mit Consumer als Lambda
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
