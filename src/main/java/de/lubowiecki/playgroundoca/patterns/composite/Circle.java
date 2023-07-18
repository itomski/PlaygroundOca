package de.lubowiecki.playgroundoca.patterns.composite;

public class Circle extends AbstractGeoForm {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        setX(x);
        setY(y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                "}";
    }
}
