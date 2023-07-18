package de.lubowiecki.playgroundoca.vererbung;

public class Katze extends Tier {

    private int verbrauchteLeben;

    public Katze() {
        //super();
        this(0);
        System.out.println("KATZE");
    }

    public Katze(int verbrauchteLeben) {
        this.verbrauchteLeben = verbrauchteLeben;
        System.out.println("KATZE");
    }

    @Override
    public void getSound() {
        System.out.println("Miau miauuuu!!!");
    }

    public int getVerbrauchteLeben() {
        return verbrauchteLeben;
    }

    public void setVerbrauchteLeben(int verbrauchteLeben) {
        this.verbrauchteLeben = verbrauchteLeben;
    }

    @Override
    public String toString() {
        return "Katze{" +
                "verbrauchteLeben=" + verbrauchteLeben +
                "} " + super.toString();
    }
}
