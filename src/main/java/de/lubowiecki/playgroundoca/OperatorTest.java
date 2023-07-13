package de.lubowiecki.playgroundoca;

import java.util.Arrays;

public class OperatorTest {

    public static void main(String[] args) {

        System.out.println(-2 + 7 * 2);
        System.out.println(10 % 2);
        System.out.println(2 % 10);
        System.out.println(9 % 2);

        int a = 10;
        int b = 11;
        int c = 100;

        // System.out.println(2 && 4); // Error: 2 und 4 sind keine booleans

        System.out.println(Arrays.asList(a, b, c));

        System.out.println(false && true); // false
        System.out.println((a > b) && (a < ++c)); // false ++c wird NICHT mehr ausgeführt
        System.out.println((a > b) & (a < ++c)); // false ++c wir trotzdem ausgeführt

        System.out.println(Arrays.asList(a, b, c));

        // Logisch
        // && AND
        // || OR
        // ^ XOR (exklusiv oder)
        // ! NOT

        //  a  | b | a && b | a || b | a ^ b | !a
        //  1  | 1 |   1    |   1    |   0   |  0
        //  1  | 0 |   0    |   1    |   1   |  0
        //  0  | 1 |   0    |   1    |   1   |  1
        //  0  | 0 |   0    |   0    |   0   |  1

        System.out.println(10 & 4); // bit-weises-und

        // 00001010 : 10
        // 00000100 : 4
        // 00000000 : 0

        System.out.println(10 | 4); // bit-weises-und

        // 00001010 : 10
        // 00000100 : 4
        // 00001110 : 14


        Object i = 100;
        System.out.println(i instanceof Double); // Prüft eine IS-A-Beziehung
        System.out.println(i instanceof Integer);
        System.out.println(i instanceof Byte);
        System.out.println(i instanceof Number);

        // Mensch
        // Student erbt von Mensch
        // Rentner erbt von Mensch
        // JuraStudent erbt Student

        // JuraStudent ist ein Mensch? OK
        // JuraStudent ist ein Student? OK
        // JuraStudent ist ein Rentner? NICHT OK

    }
}
