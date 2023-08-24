package de.lubowiecki.playgroundoca.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CatchTest {

    public static void main(String[] args) throws Exception {

        try {
            List<String> lines = Files.readAllLines(Paths.get("abc.txt")); // NIO
        }
        catch (FileNotFoundException e) { // Kindklasse von IOException, e ist NICHT final
            System.out.println("FileNotFoundException");
        }
        catch (IOException e) { // Kindklasse von Exception
            System.out.println("IOException");
        }
        catch (Exception e) { // Kindklasse von Throwable
            System.out.println("Exception");
            e = new UnsupportedOperationException();
            throw e; // müsste auf höherer Ebene gefangen oder deklariert werden
        }
        catch (Throwable e) {
            System.out.println("Throwable");
        }

        // Multicatch
        try {
            List<String> lines = Files.readAllLines(Paths.get("abc.txt")); // NIO
        }
        //catch (FileNotFoundException | IOException e) { // Die Exceptions im Multicatch dürfen nicht in Kind-Eltern-Beziehung stehen
        //    System.out.println("FileNotFoundException und IOException");
        //}
        catch (IOException | RuntimeException e) { // OK, sind nicht miteinander verwandt. e ist final
            System.out.println("RuntimeException und IOException");
        }

        machWas();

        System.out.println(machWas(10));
        System.out.println(machWas2(10));
    }

    static void machWas() {

        try {
            System.out.println("START TRY-BLOCK");
            int[] arr = {1,2,3,4,5,6,7,8};
            System.out.println("Wert: " + arr[3]);
            System.out.println("ENDE TRY-BLOCK");
            return; // Verlassen der Methode
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
        finally { // Wird vor dem return ausgeführt
            System.out.println("FIN");
        }
    }

    static int machWas(int i) {

        try {
            int[] arr = {1,2,3,4,5,6,7,8};
            return arr[i];
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            return -1; // Wird IMMER zurückgegeben. Überschreibt den return aus dem Try
        }
    }

    static int machWas2(int i) {

        try {
            int[] arr = {1,2,3,4,5,6,7,8};
            return arr[i];
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return -1; // Wird NUR zurückgegeben, wenn Try-Block abgebrochen wird
    }

    static int machWas3(int i) {

        int[] arr = {1,2,3,4,5,6,7,8};

        // Entweder
        if(i < arr.length) { // passender Rückgabewert
            return arr[i];
        }
        throw new RuntimeException("Index nicht passend!"); // Oder Exception
    }
}
