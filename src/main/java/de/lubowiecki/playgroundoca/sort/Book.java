package de.lubowiecki.playgroundoca.sort;

// Comparable stellt eine natürliche Reihenfolge für Vergleiche bereit
public class Book implements Comparable<Book> {

    private static int count;

    private final int nr;

    private String isbn;

    private String title;

    private String description;

    private double price;

    private String publisher;

    private Author author;

    public Book() {
        nr = ++count; // Zuweisung einer laufenden Nummer
    }

    public Book(String isbn, String title, double price, Author author) {
        this(); // Ruft den parameterlosen Kunstruktor DIESER Klasse auf
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // - wenn kleiner
    // + wenn größer
    // 0 bei Gleichheit
    @Override
    public int compareTo(Book other) {
        // return Double.compare(price, other.getPrice());
        // return title.compareTo(other.getTitle());
        return isbn.compareTo(other.getIsbn());
    }
}
