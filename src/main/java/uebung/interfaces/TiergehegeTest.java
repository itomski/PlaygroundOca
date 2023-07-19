package uebung.interfaces;

public class TiergehegeTest {

    public static void main(String[] args) {

        Tiergehege gehege = new Tiergehege();

        gehege.add(new Grizzly("Bob"));
        gehege.add(new Grizzly("Ziggy"));
        gehege.add(new Waschbaer());
        gehege.add(new Waschbaer());
        gehege.add(new Waschbaer());

        gehege.starteFuetterung();

        System.out.println();

        gehege.starteNachruhe();


    }

}
