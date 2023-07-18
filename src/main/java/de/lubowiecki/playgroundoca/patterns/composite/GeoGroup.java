package de.lubowiecki.playgroundoca.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class GeoGroup implements Movable {

    private List<Movable> elements = new ArrayList<>();

    public void add(Movable element) {
        elements.add(element);
    }

    @Override
    public void moveTo(int x, int y) {

        for (Movable m: elements) {
            m.moveTo(x, y); // Bewegung für die Gruppe wird an die Elemente der Gruppe delegiert
        }
    }
}
