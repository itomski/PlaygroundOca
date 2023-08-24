package de.lubowiecki.playgroundoca.exceptions;

import static java.lang.System.out;
import static java.lang.System.err;

import java.io.IOException;

public class CheckedUnCheckedTest {

    public static void main(String[] args) {

        System.out.println("START");

        try {
            // machWas(); // Da RuntimeException, kein handle or declare nötig
            machWasAnderes(); // Da RuntimeException, kein handle or declare nötig
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
            //System.out.println(e.getCause());
        }



        Container c = new Container();

        try {
            c.load(); // CheckedException muss behandelt oder deklariert werden
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        out.println("ENDE");
        // err.println("ENDE");
    }

    static public void machWas() {
        // UnsupportedOperationException ist Unchecked (Kindklasse von RuntimeException)
        throw new UnsupportedOperationException("Methode ist noch nicht implementiert...");
    }

    static public void machWasAnderes() {

        try {
            machWas();
        }
        catch (UnsupportedOperationException e) {
            throw new RuntimeException("Wechsel auf RuntimeException", e);
        }
    }
}

interface File {

    void load() throws IOException;

    void save() throws IOException;
}

class Container implements File {

    @Override
    public void load() throws IOException {

        try {
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
        }
        catch(RuntimeException e) {
            // Wechsel von ArrayIndexOutOfBoundsException auf IOException
            throw new IOException(e);
        }
    }

    @Override
    public void save() throws IOException {

    }
}
