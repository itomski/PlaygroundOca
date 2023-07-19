package uebung.interfaces;

public class Waschbaer implements Sozialisiert {

    private static int count;

    private int nr;

    public Waschbaer() {
        this.nr = ++count;
    }

    @Override
    public void frisst() {
        System.out.println("W-Bär Nr. " + nr + ": wäscht sein essen und frisst.");
    }

    @Override
    public void schlaeft() {
        System.out.println("W-Bär Nr. " + nr + ": durchsucht die Mülltonnen.");
    }
}
