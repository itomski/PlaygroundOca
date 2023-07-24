package de.lubowiecki.playgroundoca.lambda;

public class AnonymeKlassenTest {

    public static void main(String[] args) {

        ContentBox box1 = new ConcreteContentBox();
        box1.put("Das ist hier nix...");
        System.out.println(box1.get());
        System.out.println(box1.length());

        // Anonyme-Klassen können auf einem Interface, einer abstrakten oder einer konkreten Klasse basieren

        // Es wird eine Klasse ohne Namen deklariert in der alle nötigen Methoden implemeniert sind
        // Und es wird sofort eine Instanz davon gebau
        // Eine spätere Instanzierung dieser Klasse ist nicbht möglich!!!!
        ContentBox box2 = new ContentBox() {
            @Override
            public void put(String str) {

            }

            @Override
            public String get() {
                return null;
            }

            @Override
            public int length() {
                return 0;
            }
        };



        // Lambdas sind Anonyme-Klassen für Interfaces mit einer einizen abstrakten Methode

        Checker c1 = new Checker() {
            @Override
            public boolean check(String a) {
                return a.startsWith("A");
            }
        };

        // Durch Type-Inferenz kann Java die nötigen Datentypen aus dem Interface ermitteln
        Checker c2 = (a) -> a.startsWith("A");

        System.out.println(c1.check("Abcde"));
        System.out.println(c2.check("Abcde"));

        // in JavaScript
        // var machWas = function(a) {};
        // var machWas = (a) => ...;
        // machWas();
    }
}

interface ContentBox {

    void put(String str);

    String get();

    int length();
}

class ConcreteContentBox implements ContentBox {

    private String content;

    @Override
    public void put(String str) {
        content = str;
    }

    @Override
    public String get() {
        return content;
    }

    @Override
    public int length() {
        return content.length();
    }
}

// Interfaces, aus denen Lambdas gebaut werden können nennt man Functional-Interfaces
// SAM - Single Abstract Method
interface Checker {

    boolean check(String str);

}