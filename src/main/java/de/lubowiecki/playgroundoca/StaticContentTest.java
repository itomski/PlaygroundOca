package de.lubowiecki.playgroundoca;

import java.util.function.Predicate;

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

        // try {
        // }

        //int _ = 10;

        String[] sArr = {}; // Leeres Array
        sArr = new String[2]; // {null, null}
        int[] iArr = new int[2]; // {0, 0}
        int[][] i2DArr = new int[2][]; // {null,null}
        i2DArr = new int[2][0]; // {{},{}}
        i2DArr = new int[2][2]; // {{0,0},{0,0}}
        int[][][] i3DArr = new int[2][][]; // {null, null};
        i3DArr = new int[2][2][]; // {{null, null}, {null, null}};
        i3DArr = new int[2][2][2]; // {{{0,0}, {0,0}}, {{0,0}, {0,0}}};

        Integer[][][] I3DArr = new Integer[2][][]; // {null, null};
        I3DArr = new Integer[2][2][]; // {{null, null}, {null, null}};
        I3DArr = new Integer[2][2][1]; // {{{null},{null}}, {{null}, {null}}}};
        I3DArr[1][1] = new Integer[]{5,7}; // {{{null},{null}}, {{null}, {5,7}}}};
        System.out.println(-10%(3));

        int l = 10;
        Predicate<String> pred1 = str -> str.length() > l; // l muss final oder effektiv final sein
        // l++; // ist nicht mehr effektiv final (darf nicht geändert werden)

        int y;
        //System.out.println(y); // Nicht nutzbar

        y = 10;

        if(y++ > 10) System.out.println("Moin");

        y = 0;
        while(y++ < 10) {}
        System.out.println(y);

        // Object -> A -> B
        //             -> C

        // Object o = new A();
        // Object o = new B();
        // A a = new A();
        // A a = new B(); // Jedes B IS-A A
        // B b = new A(); // Error
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