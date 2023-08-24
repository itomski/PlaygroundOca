package de.lubowiecki.playgroundoca.exceptions;

public class EigeneExceptions {

    public static void main(String[] args) {

        try {
            check(50);
        }
        catch(ZuNiedrigException e) {
            System.out.println(">");
        }
        catch(ZuHochException e) {
            System.out.println("<");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Parameter nicht passend");
        }
        catch(RuntimeException e) {
            System.out.println("Anderes Problem");
        }
    }


    static void check(int zahl) throws IllegalArgumentException {

        if(zahl < 0 ) throw new ZuNiedrigException();
        if(zahl == 50 ) throw new IllegalArgumentException("50 ist nicht erlaubt");
        if(zahl > 100 ) throw new ZuHochException();

        System.out.println("Wert ok!");
    }
}

class ZuHochException extends IllegalArgumentException {
    public ZuHochException() {
        super("Zu hoch");
    }
}

class ZuNiedrigException extends IllegalArgumentException {
    public ZuNiedrigException() {
        super("Zu niedrig");
    }
}