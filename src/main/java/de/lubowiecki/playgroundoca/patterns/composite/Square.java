package de.lubowiecki.playgroundoca.patterns.composite;

public class Square extends AbstractGeoForm {

    private int height;

    private int width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Square(int x, int y, int height, int width) {
        setX(x);
        setY(y);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", height=" + height +
                ", width=" + width +
                "}";
    }
}
