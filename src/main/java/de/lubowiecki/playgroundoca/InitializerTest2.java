package de.lubowiecki.playgroundoca;

import java.util.*;

public class InitializerTest2 {

    static String s01 = "ABC";

    public static void main(String[] args) {

        String s1 = "AB";
        String s2 = "";
        s2 = s2 + 'A';
        // s2 = s2 + 'B';
        s2 = (s2 + 'B').intern(); // Sucht im Pool nach einem passenden String und liefert eine Referenz

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println();

        String s03 = "ABC";
        String s04 = "AB" + "C"; // Wird zu Kompilezeit zu "ABC" zusammengesetzt
        String s05 = "AB";
        String s06 = s05+ "C"; // Wird erst zur Laufzeit zusammengestzt, landet nicht im Pool
        String s07 = (s05+ "C").intern(); // Wird im Pool gesucht

        // String-Literal-Pool
        System.out.println(s01 == s03);
        System.out.println(s01 == s04);
        System.out.println(s01 == s06);
        System.out.println(s01 == s07);

        System.out.println();

        Integer i1 = 130; // Byte-Pool geht von -128 bis 127. Nur für Ganzzahlen-Wrapper
        Integer i2 = 130;

        System.out.println(i1.equals(i2));
        System.out.println(i1 == i2);


    }
}

class Date {
}
