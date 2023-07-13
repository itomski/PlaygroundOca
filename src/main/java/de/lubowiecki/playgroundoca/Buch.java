package de.lubowiecki.playgroundoca;

import java.io.Serializable;

// VO - Value Object
// JavaBeans
public class Buch implements Serializable { // Serializable: Kann in Text übersetzt werden um serialisiert zu werden

    private String titel;

    private String isbn;

    private double preis;

    public Buch() {
    }

    public Buch(String titel, String isbn, double preis) {
        this.titel = titel;
        this.isbn = isbn;
        this.preis = preis;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", isbn='" + isbn + '\'' +
                ", preis=" + preis +
                '}';
    }
}
