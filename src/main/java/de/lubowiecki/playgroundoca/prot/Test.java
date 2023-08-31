package de.lubowiecki.playgroundoca.prot;

import de.lubowiecki.playgroundoca.prot.sub.Parent;

public class Test extends Parent {

    public static void main(String[] args) {

        Test test = new Test();
        test.machWas(); // Hier sichtbar, da main zu Test gehört

    }
}
