package de.lubowiecki.playgroundoca.vererbung;

public class Mensch extends Lebewesen {

    private String vorname;

    private String nachname;

    public Mensch() {
        System.out.println("MENSCH");
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public void getSound() {
        System.out.println("Ich denke, also bin ich...");
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return "Mensch{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                "} " + super.toString();
    }
}
