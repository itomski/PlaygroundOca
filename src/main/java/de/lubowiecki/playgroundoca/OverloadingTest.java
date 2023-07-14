package de.lubowiecki.playgroundoca;

public class OverloadingTest {

    public static void main(String[] args) {
        new OverloadingTest().start();
    }

    private void start() {
        byte b = 100;
        doSomething(b);

        // byte < short < int < long < float < double

        // 1. Methode für den passenden Typ
        // 2. primitive widening
        // 3. Autoboxing zum passenden Wrapper
        // 4. komplex Widening
        // 5. VarArgs
    }

    /*
    private void doSomething(byte b) {
        System.out.println("byte");
    }

    private void doSomething(short b) {
        System.out.println("short");
    }

    private void doSomething(int b) {
        System.out.println("int");
    }

    private void doSomething(long b) {
        System.out.println("long");
    }

    private void doSomething(float b) {
        System.out.println("float");
    }

    private void doSomething(double b) {
        System.out.println("double");
    }

    private void doSomething(Byte b) { // Wrappertyp
        System.out.println("Byte");
    }
    */

    // Signatur (Name der Methode und die Parameterliste) muss unterscheidbar sein
    private void doSomething(Double b) {
        System.out.println("Double");
    }

    /* Error: Methoden-Aufruf ist nicht eindeutig unterscheidbar
    private void doSomething(Double a) {
        System.out.println("Double");
    }
    */

    /*
    private void doSomething(Number b) {
        System.out.println("Number");
    }
    */

    private void doSomething(byte a, byte b) {
        System.out.println("2 Parameter");
    }

    private void doSomething(byte... b) {
        System.out.println("VarArg");
    }


}
