package de.lubowiecki.playgroundoca.vererbung;

public class InterfaceTest2 {
}

interface Printable {
    void print();
}

interface Scanable {
    void scan();
}

interface Formattable {
    void format();
}

interface MultiFunctional extends Printable, Scanable, Formattable {
}

// Wird das Interface MultiFunctional implementiert, müssen alle Methoden der Interfaces,
// die es erweitert eingebaut werden
class HPMulitScanPrinter implements MultiFunctional {

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }

    @Override
    public void format() {

    }
}
