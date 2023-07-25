package uebung5;

public class App {

    public static void main(String[] args) {

        // Schreibe eine Variante des Würfelbechers, der ein Lambda zur Erzeugung der Zufallszahlen bekommen kann

        // Schreibe ein Consumer, mit dem du die Ausgabe der Zufallszahlen beeinflussen kannst

        // Dabei soll für das Ändern der Ausgabe oder das Ermittel der Zufallszahlen nicht jedes Mal der Würfelbecher
        // verändert werden müssen.


        DiceCup cup = new DiceCup(RandUtils.W6);
        // iceCup cup = new DiceCup(RandUtils.createSupplier(25));
        // DiceCup cup = new DiceCup(() -> (int)(Math.random() * 1000) + 1);
        // DiceCup cup = new DiceCup(() -> 1);

        int[] arr = cup.roll(100);

        //cup.print(arr, s -> System.out.print(s + ", "));
        //cup.print(arr, s -> System.out.println(s));
        cup.print(arr, s -> System.out.println(String.format("%4d", s)));

    }
}
