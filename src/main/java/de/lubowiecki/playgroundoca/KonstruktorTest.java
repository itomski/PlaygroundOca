package de.lubowiecki.playgroundoca;

import java.time.LocalDate;

public class KonstruktorTest {

    public static void main(String[] args) {

        // Jede Klasse in Java ist automatisch eine Kindklasse von Objekt
        Object o = new Object();

        // Ist in Java KEIN primitiver Datentyp
        String s = new String();
        s = new String("Hallo");
        char[] arr = {'a', 'b', 'c'};
        s = new String(arr);

        Student s1 = new Student(); // Baut ein leeres Student-Objekt
        System.out.println(s1.getVorname() + " " + s1.getNachname());
        s1.setVorname("Peter");
        s1.setNachname("Parker");
        System.out.println(s1.getVorname() + " " + s1.getNachname());

        System.out.println();

        // Direkt bei der Objekterzeugung wird Vor- und Nachname belegt
        Student s2 = new Student("Bruce", "Banner");
        System.out.println(s2.getVorname() + " " + s2.getNachname());

        // Student s3 = new Student("Bruce", "Banner", 23); // Kein  passender Konstruktor vorhanden

        //LocalDate heute = new LocalDate(); // Konstruktor ist privat

        // Fabrikmethoden: stellen vordefinierte Objekt bereit
        LocalDate heute = LocalDate.now(); // Statt Konstruktor werden Fabrikmethoden bereitgestellt
        LocalDate morgen = LocalDate.of(2023, 7, 12);


    }

    // Hier wird kann ein Innere-Klasse deklariert werden
}

class Student {

    private String vorname;

    private String nachname;

    // Jede Klasse hat automatisch einen default-Konstruktor, solange kein eigener erzeugt wurde
    public Student() {
    }

    public Student(String vorname, String nachname) {
        // vorname - Lokale Variable/Parameter: existiert bis zum ende der Methode
        // this.vorname - Instanzvariable: existiert solange das Student-Objekt verfügbar ist
        // this ist in allen Instanz-Methoden und Konstruktoren automatisch verfügbar
        // this ist eine Referenz auf "Dieses Objekt"
        this.vorname = vorname;
        this.nachname = nachname;
    }

    // In Java kann ein Konstruktor oder eine Methode mehrmals mit gleichen Namen deklariert werden
    // Voraussetzung ist, die Parameterliste ist unterschiedlich
    // Es heißt Überladen (Overloading)

    public String getVorname() {
        return vorname;
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
}
