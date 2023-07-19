package uebung.interfaces;

public class Grizzly implements Sozialisiert {

    private String name;

    public Grizzly(String name) {
        this.name = name;
    }

    // In einer Klasse  sind alle Methoden per default package-private

    @Override // Annotation
    public void frisst() {
        System.out.println(name + ": frisst Fleisch in großen Mengen.");
    }

    @Override
    public void schlaeft() {
        System.out.println(name + ": schläft und schnarcht.");
    }
}
