package de.lubowiecki.playgroundoca;

public class OcaTest1F52 {

    int x = y;
    static int y = 10;

    // Das ist kein Default-Konstruktor!
    public void OcaTest1F52() {
    }

    public OcaTest1F52() {
        super();
    }

    public static void main(String[] args) {
        System.out.println(new OcaTest1F52().x);
        System.out.println(y);

        Double d = 10.0 / 0.0;
        System.out.println(d);
        System.out.println(d.isInfinite());
        System.out.println(d.isNaN());

        new OcaTest1F52();
    }

    static {
        y = 15;
    }
}
