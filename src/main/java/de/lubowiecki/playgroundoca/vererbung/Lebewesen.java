package de.lubowiecki.playgroundoca.vererbung;

// Abstrakte Klassen dürfen nicht direkt instanziert werden
public abstract class Lebewesen {

    private boolean lebendig; // privates Inventar wird NICHT vererbt

    public Lebewesen() {
        // super(); // Tuft automatisch den Konstruktor der Elternklasse -> Object
        System.out.println("LEBEWESEN");
    }

    // public Inventar wird vererbt
    public boolean isLebendig() {
        return lebendig;
    }

    public void setLebendig(boolean lebendig) {
        this.lebendig = lebendig;
    }

    // Sobald eine Klasse eine abstrakte Methode hat, muss die ganze Klasse abstrakt werden
    public abstract void getSound(); // Abstrakte Methode - ist nicht eingebaut

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lebewesen{");
        sb.append("lebendig=").append(lebendig);
        sb.append('}');
        return sb.toString();
    }
}
