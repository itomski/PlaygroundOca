package de.lubowiecki.playgroundoca.patterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Square s = new Square(5, 5, 25, 100);
        System.out.println(s);
        s.moveTo(15, 22);
        System.out.println(s);

        Circle c = new Circle(100, 100, 25);
        System.out.println(c);
        c.moveTo(300, 22);
        System.out.println(c);

        // Eine Gruppe von Objekten soll sich wie eine einzelnes seteurn lassen

        GeoGroup g1 = new GeoGroup();
        g1.add(s); // Squere IS-A AbstractGeoForm IS-A Movable
        g1.add(c); // Circle IS-A AbstractGeoForm IS-A Movable

        Circle c2 = new Circle(100);
        g1.add(c2);

        GeoGroup g2 = new GeoGroup(); // Zweite Gruppe

        Circle c3 = new Circle(100);
        g2.add(c3);

        Circle c4 = new Circle(100);
        g2.add(c4);

        g1.add(g2); // Die g1-Gruppe nimmt g2 als Elemet auf

        g1.moveTo(200, 200);

        System.out.println(s);
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);



    }

}
