package de.lubowiecki.playgroundoca.exceptions;

public class ExceptionTest1 {

    public static void main(String[] args) {

        // In try wird das abgelegt, was ausgeführt werden soll und eine Exception produzieren kann
        try {
            // Sobald eine Exception entsteht, wird sofort die Abarbeitung des try-Blocks unterbrochen

            int[] arr = new int[-10]; // RuntimeException: NegativeArraySizeException
            //int[] arr = new int[10];
            //int[] arr = null;
            System.out.println(arr[0]); // RuntimeException: NullPointerException
            arr[10] = 253; // RuntimeException: ArrayIndexOutOfBounds
        }
        catch(NullPointerException e) {
            // In catch kommt die Behandlung der Ausnahme
            // Dieser Block wird NUR betreten, wenn eine Exception auftritt
            System.out.println("Problem!");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            // Eine andere Behandlung
            System.out.println("Anderes Problem!");
        }
        catch(RuntimeException e) {
            // Sammelt alle RuntimeExceptions ein
            System.out.println("Anderes Problem!");
        }
        catch(Exception e) {
            // Behandlung für den Rest
            System.out.println("Ganz anderes Problem!");
        }
    }
}
