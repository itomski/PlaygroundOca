package de.lubowiecki.playgroundoca.lambda;

public class LambdaTest1 {

    public static void main(String[] args) {

        Greeter a = () -> System.out.println("Hallo... schön, dass ich hier bin");
        Greeter b = () -> System.out.println("Hi. Was los?");
        Greeter c = () -> System.out.println("...");

        doSomething(c);

        Operator o1 = (z1, z2) -> z1 * z2;
        doSomethingElse(10, 25.5, o1);

        Operator o2 = (z1, z2) -> z1 * z2 / 100;
        doSomethingElse(10, 25.5, o2);

        doSomethingElse(10, 25.5, (z1, z2) -> z1 + z2 * 100);

    }

    private static void doSomething(Greeter g) {
        System.out.println("-----------------");
        g.greet();
        System.out.println("-----------------");
    }

    private static void doSomethingElse(double x, double y, Operator op) {
        System.out.println("########################");
        System.out.println(op.run(x, y));
        System.out.println("########################");
    }
}

interface Greeter {
    void greet();
}

interface Operator {
    double run(double a, double b);
}
