package de.lubowiecki.playgroundoca.patterns.composite;

public abstract class AbstractGeoForm implements Movable {

    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // abstrakte Klassen können auch abstrakte Methoden enthalten
    // abstract void moveTo(int x, int y);

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
