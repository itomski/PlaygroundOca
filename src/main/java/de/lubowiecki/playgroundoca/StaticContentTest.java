package de.lubowiecki.playgroundoca;

public class StaticContentTest {

    public static void main(String[] args) {

        StaticContentTest obj = new StaticContentTest();
        obj.machWas();

        StaticContentTest.machWas();

        StaticContentI sci = new StaticContentI() {};
        // sci.machWas(); // Beim Interface nicht möglich

        StaticContentI.machWas();

        // Byte-Literal-Pool -128 bis 127, für Byte, Short, Integer, Long
        Integer i1 = 130;
        Integer i2 = 130;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        String s = "Hallo ";
        s = s.concat("Welt");
        System.out.println(s);

        // Runtime-Konstante
        final int i;
        i = 100;

        // Kompiletime-Konstante
        final int j = 200;

        String s2 = "Hi";
        Object o1 = s2; // Up-Casting
        String s3 = (String)o1; // Down-Casting

        // a 1-Dimension
        // b 2-Dimensionen
        int[] a, b[];

        int zahl = 100;
        System.out.println(String.format("Das ist eine Zahl %d", zahl));
        System.out.println(String.format("Das ist eine Zahl %10d #", zahl));
        System.out.println(String.format("Das ist eine Zahl %-10d #", zahl));
        System.out.println(String.format("Das ist eine Zahl %010d", zahl));

        int[] arr = {1,2,3,4,5};

        for(int x : arr) { // x darf nicht vor dem loop deklariert werden
            System.out.println(x);
        } // hier ist x out-of-scope


        int x = 10;
        for(x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
        System.out.println(x);

        /*
        while(i == 100) {
        }
        System.out.println("Hi"); // Nicht erreichbar - Zur Laufzeit

        while(j == 200) {
        }
        // System.out.println("Hi"); // Nicht erreichbar - Kompiler-Error
        */

    }

    static void machWas() {
        System.out.println("Static");
    }
}

interface StaticContentI {

    static void machWas() {
        System.out.println("StaticI");
    }
}