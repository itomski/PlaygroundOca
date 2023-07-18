package de.lubowiecki.playgroundoca.vererbung;

public class ParentChildProblem {

    public static void main(String[] args) {

        Child c = new Child();

    }
}

class Parent {

    int zahl;

    public Parent(int i) {
        System.out.println("Parent");
    }
}

class Child extends Parent{

    int zahl;

    public Child() {
        // automatisch wird NUR ein parameterloser Konstruktor der Elternklasse benutzt
        // super(); // wird automatisch als erste Zeile ausgeführt

        // ist kein parameterloser Konstruktor in der Elterklasse verfügbar, muss der Konstruktor per Hand aufgerufen werden
        super(10);

        int zahl = 15;
        System.out.println(zahl); // ruft die lokale zahl auf
        System.out.println(this.zahl); // ruft die zahl von Child auf
        System.out.println(super.zahl); // ruft die zahl von Parent auf

        // Wird im Konstruktor mit this ein anderer Konstruktor der gleichen Klasse benutzt wird super() nicht mehr aufgerufen
        System.out.println("Child");
    }
}
