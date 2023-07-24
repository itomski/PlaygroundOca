package de.lubowiecki.playgroundoca.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaTest2 {

    public static void main(String[] args) {


        List<Integer> zahlen = new ArrayList<>(List.of(2,10,55,17,1,18,100,200,4,2,19,27));

        System.out.println(zahlen);

        // void accept(T t);
        Consumer<Integer> c1 = (s) -> System.out.println("#" + (s * 10) + "#");
        zahlen.forEach(c1);

        System.out.println();

        // boolean test(T t);
        Predicate<Integer> p1 = (z) -> z > 50;
        zahlen.removeIf(p1);
        System.out.println(zahlen);

        System.out.println();

        // R apply(T t);
        UnaryOperator<Integer> u1 = (z) -> z * 10;
        zahlen.replaceAll(u1);

        System.out.println(zahlen);


    }
}
