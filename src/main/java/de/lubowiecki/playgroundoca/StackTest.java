package de.lubowiecki.playgroundoca;

public class StackTest {

    public static void main(String[] args) {
        machWas(); // StackOverflowError
    }

    private static void machWas() {
        int i = 10;
        String s = new String("Hallo");
        machWas(); // Rekursiver Aufruf
    }
}
