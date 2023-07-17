package de.lubowiecki.playgroundoca.vererbung;

// Tier erweitert Lebewesen
public class Tier extends Lebewesen {

    private String name;

    public Tier() {
        // super(); // Tuft automatisch den Konstruktor der Elternklasse -> Lebewesen
        System.out.println("TIER");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getSound() {
        System.out.println("Ein wilder Ruf!");
    }

    @Override
    public String toString() {
        return "Tier{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
