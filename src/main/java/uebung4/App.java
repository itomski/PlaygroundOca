package uebung4;

import java.time.LocalDate;
import java.util.Scanner;

// Controller und View
public class App {

    private final Scanner scanner = new Scanner(System.in);
    private final ProductManagement management = new ProductManagement();

    private static final String KEYS = "\n\n**********************************\n"
            + "* N: \tNeues Produkt            *\n"
            + "* PN: \tNeues V.Produkt          *\n"
            + "* L: \tAlle Produkte ausgeben   *\n"
            + "* H: \tHilfe                    *\n"
            + "* Q: \tProgramm verlassen       *\n"
            + "**********************************\n\n";

    public static void main(String[] args) {
        new App().run();
    }

    private void run() {

        System.out.println("### Produktverwaltung ###");

        System.out.println(KEYS);


        app: while(true) {

            System.out.print("\nEingabe: ");
            String input = scanner.nextLine().trim().toLowerCase();

            switch(input) {

                case "h":
                    System.out.println(KEYS);
                    break;

                case "n":
                    management.add(createProduct(false));
                    System.out.println("Produkt wurde gespeichert.");
                    break;

                case "pn":
                    management.add(createProduct(true));
                    System.out.println("Verderbliches Produkt wurde gespeichert.");
                    break;

                case "l":
                    System.out.println(ViewHelper.getProductAsTable(management.getAll()));
                    break;

                case "q": break app;

                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }

        System.out.println("Programm wurde beendet.");
    }

    private Product createProduct(boolean pershable) {

        Product p = null;
        if(pershable) {
            System.out.print("\nVerfallsdatum: ");

            String input = null;
            // TODO: while
            try {
                input = scanner.next();
                LocalDate expiryDate = LocalDate.parse(input, ViewHelper.DATE_FMT);
                // TODO: Validieren
                p = new PershableProduct(expiryDate);
            }
            catch(Exception e) {
                System.out.println(input);
            }
        }
        else {
            p = new Product();
        }

        System.out.print("\nName: ");
        p.setName(scanner.next());

        scanner.nextLine(); // fix
        System.out.print("\nBeschreibung: ");
        p.setDescription(scanner.nextLine());

        System.out.print("\nPreis: ");
        p.setPrice(scanner.nextDouble());

        scanner.nextLine(); // fix

        return p;
    }
}
