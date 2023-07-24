package uebung4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Model
public class ProductManagement {

    private final Path path = Paths.get("products.ser");

    private final List<Product> products;

    public ProductManagement() {
        // Beim instanzieren von ProductManagement werden Daten aus der Datei gelsen
        products = readFromFile();
    }

    public void add(Product product) {
        products.add(product);
        saveToFile(); // Änderung in die Datei speichern
    }

    public List<Product> getAll() {
        return products;
    }

    private void saveToFile() {
        try(ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path))) {
            out.writeObject(products);
        }
        catch(IOException e) {
            e.printStackTrace(); // TODO: Problem richtig behandeln
            // e = new IOException("Dies und das"); // Neuzuweisung möglich
            // throw e; // Exception wird neu geworfen und kann in diesem catch nicht mehr behandelt werden
        }
    }

    private List<Product> readFromFile() {
        List<Product> products = new ArrayList<>();
        try(ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path))) {
            products = (List<Product>) in.readObject();
        }
        catch(IOException | ClassCastException | ClassNotFoundException e) {
            e.printStackTrace(); // TODO: Problem richtig behandeln
            // e = new ClassCastException(); // e ist final
            // throw e; // Rethrow
        }
        return products;
    }
}