package de.lubowiecki.playgroundoca;

public class AbstractClassTest {

    public static void main(String[] args) {
        BClass b = new BClass();

        // AClass a = new AClass();

        StringBuilder sb = new StringBuilder();
        sb.equals(null);

        int i = 50, k = 50;
        i = k = 100;
        System.out.println(i);

    }

}

abstract class AClass {

    public AClass() {
        System.out.println("AClass");
    }
}

class BClass extends AClass {

    public BClass() {
        // super();
        System.out.println("BClass");
    }
}
