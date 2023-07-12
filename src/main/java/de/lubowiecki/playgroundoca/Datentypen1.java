package de.lubowiecki.playgroundoca;

public class Datentypen1 {

    public static void main(String[] args) {

        // Java erlaubt beim byte und short eine Zuweisung per int-Literal. Es muss im passenden Wertebereich liegen
        byte b = 120; // 100 als Literal ist ein int
        short s = 100; // 100 als Literal ist ein int

        int i = 100;
        // b = i; // Error: int ist eigentlich zu groß für byte oder short

        // long l = 1_000_000_000; // 1_000_000_000 ist ein int-Literal. Primitive Widening von int auf long
        long l = 2_150_000_000L;

        // byte < short < int < long < float < double
        //         char <

        byte b1 = 100;
        i = b1; // primitive widening von byte auf int

        // b1 = i; // Error: primitive narrowing von int auf byte - kann nicht automatisch erfolgen
        b1 = (byte) i; // primitive narrowing von int auf byte wird erzwungen

        // Jede Mathematisch operation passt die Operanden an den höheren Typ, mind. int
        b1 = 125;

        b1++; // b1 = (byte)(b1 + 1) // Es kann zu eienm Über- oder Unterlauf kommen

        // b1 = b1 + 1; // Error: Operanden werden auf int angehoben, Erg ist auch int
        // b1 = b1 + b1; // Error: Operanden werden auf mind. int angehoben, Erg ist auch int

        b1 += 10; // b1 = (byte)(b1 + 10)

        b1++;

        System.out.println(b1);

        b1 = (byte)10_000_000;
        System.out.println(b1);

        // ++, --, +=, -=, *=, /=, %= funktionieren nur mit Variablen

        int j = 012; // Oktal 10, 1 x 8 + 2
        System.out.println(j);

        j = 0b10010; // Binär 18, 1 x 16 + 1 x 2

        j = 0x11; // Hex 17, 1 x 16 + 1
        // 0-9a-f
        j = 0x1a; // Hex 27, 1 x 16 + 10
        System.out.println(j);

        j = 2_100_000_000;
        System.out.println(j);
        System.out.println(Integer.toHexString(j));
        System.out.println(Integer.toOctalString(j));
        System.out.println(Integer.toBinaryString(j));

        //float f = 10.0; // Error: 10.0 ist double. double ist größer als float
        float f = 10.0f; // 10.0f ist ein float

        double d = 10.0;

        // 10 / 3 / 3

        char c1 = 'x';
        // c1 = "x"; // x wäre hier ein String

        i = 10_000;
        System.out.println((char)i);
        System.out.println((int)'x');


    }

}
