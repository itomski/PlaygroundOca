package de.lubowiecki.playgroundoca.vererbung;

import java.util.List;

// Erben von LetztesKartenSpiel nicht möglich, da diese Klasse final ist
public class AllerLetzesKartenSpiel extends /* LetztesKartenSpiel */  KartenSpiel {


    @Override
    public List<String> getCards() {
        return null;
    }
}
