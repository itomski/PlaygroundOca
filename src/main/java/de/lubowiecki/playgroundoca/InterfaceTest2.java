package de.lubowiecki.playgroundoca;

import de.lubowiecki.playgroundoca.patterns.composite.AbstractGeoForm;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest2 {

    public static void main(String[] args) {

        Parkhaus cityParkhaus = new Parkhaus(100);

        Pkw p1 = new Pkw("HH:AB 123");


        if(cityParkhaus.parkeEin(p1)) {
            System.out.println("Pkw eingeparkt");
        }

        if(cityParkhaus.parkeAus(p1)) {
            System.out.println("Pkw wurde ausgeparkt");
        }

        System.out.println();

        Nutzfahrzeug n1 = new Nutzfahrzeug("XY:AB 355");

        if(cityParkhaus.parkeEin(n1)) {
            System.out.println("Nutzfahrzeug eingeparkt");
        }

        if(cityParkhaus.parkeAus(n1)) {
            System.out.println("Nutzfahrzeug wurde ausgeparkt");
        }

        System.out.println();

        Motorrad m1 = new Motorrad("B:XY 445");

        if(cityParkhaus.parkeEin(m1)) {
            System.out.println("Motorrad eingeparkt");
        }

        if(cityParkhaus.parkeAus(m1)) {
            System.out.println("Motorrad wurde ausgeparkt");
        }

        System.out.println();

        Pferd pf1 = new Pferd("Gaul 123");

        if(cityParkhaus.parkeEin(pf1)) {
            System.out.println("Pferd eingeparkt");
        }

        if(cityParkhaus.parkeAus(pf1)) {
            System.out.println("Pferd wurde ausgeparkt");
        }
    }
}

class Parkhaus {

    private final int MAX_SIZE;

    private final List<Fahrzeug> fahrzeuge = new ArrayList<>();

    public Parkhaus(int size) {
        MAX_SIZE = size;
    }

    boolean parkeEin(Fahrzeug fahrzeug) {
        if(fahrzeuge.size() < MAX_SIZE) {
            boolean ok = fahrzeuge.add(fahrzeug);
            fahrzeug.parkeEin(); // Das Interface sichert zu, dass jedes Fahrzeug diese Methode hat
            return ok;
        }
        return false;
    }

    boolean parkeAus(Fahrzeug fahrzeug) {
        boolean ok = fahrzeuge.remove(fahrzeug);
        fahrzeug.parkeAus(); // Das Interface sichert zu, dass jedes Fahrzeug diese Methode hat
        return ok;
    }
}

interface Fahrzeug {

    public void parkeEin();

    public void parkeAus();

}

abstract class AbstractFahrzeug implements Fahrzeug {

    private final String kennzeichen;

    // Kann von den erbenden Klassen verwendet werden
    public AbstractFahrzeug(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }
}


class Pkw extends AbstractFahrzeug {

    public Pkw(String kennzeichen) {
        super(kennzeichen);
    }

    public void parkeEin() {
        System.out.println(getKennzeichen() + ": In die Parklücke fahren");
        System.out.println(getKennzeichen() + ": Motor abstellen");
        System.out.println(getKennzeichen() + ": Fenster schließen");
        System.out.println(getKennzeichen() + ": Fahrzeug verlassen");
    }

    public void parkeAus() {
        System.out.println(getKennzeichen() + ": Einsteigen");
        System.out.println(getKennzeichen() + ": Tür schließen");
        System.out.println(getKennzeichen() + ": Motor starten");
        System.out.println(getKennzeichen() + ": Parkhaus verlassen");
    }
}

class Nutzfahrzeug extends AbstractFahrzeug {

    public Nutzfahrzeug(String kennzeichen) {
        super(kennzeichen);
    }


    @Override
    public void parkeEin() {
        System.out.println(getKennzeichen() + ": In die Parklücke fahren");
        System.out.println(getKennzeichen() + ": Motor abstellen");
        System.out.println(getKennzeichen() + ": Ladung sichern");
        System.out.println(getKennzeichen() + ": Fahrzeug verlassen");
    }

    @Override
    public void parkeAus() {
        System.out.println(getKennzeichen() + ": Einsteigen");
        System.out.println(getKennzeichen() + ": Tür schließen");
        System.out.println(getKennzeichen() + ": Ladefläche checken");
        System.out.println(getKennzeichen() + ": Motor starten");
        System.out.println(getKennzeichen() + ": Parkhaus verlassen");
    }
}

class Motorrad extends AbstractFahrzeug {

    public Motorrad(String kennzeichen) {
        super(kennzeichen);
    }

    @Override
    public void parkeEin() {
        System.out.println(getKennzeichen() + ": In die Parklücke fahren");
        System.out.println(getKennzeichen() + ": Motor abstellen");
        System.out.println(getKennzeichen() + ": Absteigen");
    }

    @Override
    public void parkeAus() {
        System.out.println(getKennzeichen() + ": Aufsteigen");
        System.out.println(getKennzeichen() + ": Motor starten");
        System.out.println(getKennzeichen() + ": Parklücke verlassen");
    }
}

// Jede Klasse die das Interface Fahrzeug implementiert ist sofort kompatibel mit dem Parkhaus
class Pferd implements Fahrzeug {

    private final String name;

    public Pferd(String name) {
        this.name = name;
    }

    @Override
    public void parkeEin() {
        System.out.println(name + ": Trabt in die Parklücke");
        System.out.println(name + ": Absteigen");
        System.out.println(name + ": Wird angebunden");
    }

    @Override
    public void parkeAus() {
        System.out.println(name + ": Los machen");
        System.out.println(name + ": Aufsteigen");
        System.out.println(name + ": Parklücke verlassen");
    }
}