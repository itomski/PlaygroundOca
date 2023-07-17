package de.lubowiecki.playgroundoca.vererbung;

public class Hund extends Tier {

    private String rasse;

    public Hund() {
        System.out.println("HUND");
    }

    @Override
    public void getSound() {
        System.out.println("Wauuu wau!!!");
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    @Override
    public String toString() {
        return "Hund{" +
                "rasse='" + rasse + '\'' +
                "} " + super.toString();
    }
}
