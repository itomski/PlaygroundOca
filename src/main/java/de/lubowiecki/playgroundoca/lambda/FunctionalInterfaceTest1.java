package de.lubowiecki.playgroundoca.lambda;

import java.time.LocalDate;
import java.util.function.*;

public class FunctionalInterfaceTest1 {

    public static void main(String[] args) {

        FnInterface1 i1 = (x1, x2) -> (int)(x1 - x2);
        System.out.println(i1.run(7, 10));

        i1 = (x1, x2) -> (int)(x1 * x2);
        System.out.println(i1.run(7, 10));

        i1 = (x1, x2) -> (int)(x1 % x2);
        System.out.println(i1.run(7, 10));

        i1 = (x1, x2) -> (int)(x1 * x1 * x1 * x2 * 2);
        System.out.println(i1.run(7, 10));

        System.out.println();

        FnInterface2 i2 = (str) -> Double.parseDouble(str);
        System.out.println(i2.change("2.7"));

        i2 = (str) -> Double.valueOf(str.length());
        System.out.println(i2.change("2.7"));

        System.out.println();

        FnInterface3 i3 = (d) -> String.format("%.2f EUR", d);
        System.out.println(i3.change(200.95));
        System.out.println(i3.change(19.99));
        System.out.println(i3.change(15));
        System.out.println(i3.change(-12));

        System.out.println();

        FnInterface4 i4 = (v, n) -> new Person(v, n);
        Person p1 = i4.create("Peter", "Parker");
        System.out.println(p1);

        Person p2 = i4.create("Bruce", "Banner");
        System.out.println(p2);

        System.out.println();

        FnInterface5 i5 = p -> p.toString();
        System.out.println(i5.convert(p1));

        i5 = p -> p.getVorname().charAt(0) + ". " + p.getNachname();
        System.out.println(i5.convert(p1));
        System.out.println(i5.convert(p2));

        // Verwendung der Build-In-FunctionalInterface . Es muss kein eigenes Interface definiert werden
        Function<Person, String> fn1 = p -> p.getVorname().charAt(0) + ". " + p.getNachname();
        System.out.println(fn1.apply(p1));

        BiFunction<String, String, Person> fn2 = (a, b) -> new Person(a, b);
        Person p3 = fn2.apply("Peter", "Parker");

        System.out.println();

        UnaryOperator<String> change = s -> s.trim().toUpperCase();
        String res = change.apply("    augjgdj sdkljsdlj dsklsdljiruporwiweprBSKHkd fnfkfh    ");
        System.out.println(res);

        BinaryOperator<Double> multi = (a, b) -> a * b;
        BinaryOperator<Double> div = (a, b) -> a / b;
        BinaryOperator<Double> add = (a, b) -> a + b;
        BinaryOperator<Double> sub = (a, b) -> a - b;

        System.out.println(multi.apply(10.0, 15.22));
        // System.out.println(add.apply(10, 15.22)); // Error: 10 ist ein int. Autoboxing zu Integer, Double verlangt
        System.out.println(div.apply(10.0, 15.22));

        // arbeitet mit primitiven doubles
        DoubleBinaryOperator add2 = (a, b) -> a + b;
        System.out.println(add2.applyAsDouble(10, 15.22)); // 10 widening von int zu double
    }
}

interface FnInterface1 {
    int run(double a, double b);
}

interface FnInterface2 {
    double change(String str);
}

interface FnInterface3 {
    String change(double price);
}

interface FnInterface4 {
    Person create(String fname, String lname);
}

interface FnInterface5 {
    String convert(Person p);
}

class Person {

    private String vorname;

    private String nachname;

    private LocalDate geburtsdatum;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String vorname, String nachname, LocalDate geburtsdatum) {
        this(vorname, nachname);
        this.geburtsdatum = geburtsdatum;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                '}';
    }
}
