package de.lubowiecki.playgroundoca.vererbung;

import java.util.List;

public class KartenspielTest {

    public static void main(String[] args) {

        // Eine Referenz kann vom Typ eine konkreten oder abstrakten Klasse oder eines Interfaces sein.

        //KartenSpiel spiel = new KartenSpiel(); // Abstrakte Klasse darf nicht instanziert werden
        KartenSpiel spiel = new LetztesKartenSpiel();
        List<String> hand = spiel.getCards();
        KartenSpiel.printCard(hand);
        KartenSpiel.printCard(spiel.getDeck());

        System.out.println();

        KartenSpiel spiel2 = new AnderesKartenSpiel();
        hand = spiel2.getCards();
        KartenSpiel.printCard(hand);
        KartenSpiel.printCard(spiel2.getDeck());



    }

}
