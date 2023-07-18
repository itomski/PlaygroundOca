package de.lubowiecki.playgroundoca.vererbung;

public class MultiImpl implements Machbar {


    @Override
    public int runOperation(int a, int b) {
        return a * b;
    }

    @Override
    public double runOperation(double a, double b) {
        return a * b;
    }
}
