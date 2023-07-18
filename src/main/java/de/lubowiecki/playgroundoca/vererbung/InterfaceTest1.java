package de.lubowiecki.playgroundoca.vererbung;

public class InterfaceTest1 {

    public static void main(String[] args) {

        System.out.println(Machbar.ZAHL);

        // Machbar m = new Machbar(); // Ist nicht instanzierbar

        // Interface wird als Referenztyp verwendet
        // Implementierung wird als Objekttyp verwendet
        //Machbar m = new AddImpl(); // Klasasen die das Interface implementieren können instanziert werden
        Machbar m = new MultiImpl(); // Klasasen die das Interface implementieren können instanziert werden
        System.out.println(m.runOperation(10, 10));
        System.out.println(m.runOperation(10.15, 10.22));


    }
}
