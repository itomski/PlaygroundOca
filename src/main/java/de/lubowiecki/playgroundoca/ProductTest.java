package de.lubowiecki.playgroundoca;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setName("Taschenrechner");
        p1.setPrice(19.99);

        System.out.println(p1); // Verwendet automatisch die toString-Methode

        Product p2 = new Product();
        p2.setName("Tischlampe");
        p2.setPrice(59.99);

        System.out.println(p2);

        Product p3 = new Product();
        System.out.println(p3);

        Product p4 = new Product();
        System.out.println(p4);

    }
}

class Product {

    // Klassenvariable - gehört dem Bauplan
    private static int count; // Diese Variable teilen sich alle Objekte der gleichen Klasse

    // final = Konstante
    private final int nr; // Standardwert für int ist 0

    // Instanzvariablen: jedes Objekt hat seine eigenen
    private String name;

    private double price;

    public Product() {
        this.nr = ++count; // ++ Inkrement, erhöht die Zahl um 1
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Wenn versucht wird ein Objekt als String zu verwenden, wird die toString Methode genutzt
    @Override
    public String toString() {
        return "Product{" +
                "nr=" + nr +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
