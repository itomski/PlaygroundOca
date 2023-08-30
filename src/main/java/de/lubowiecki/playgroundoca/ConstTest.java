package de.lubowiecki.playgroundoca;

public class ConstTest {

    public static void main(String[] args) {
        A a = new B();
    }
}

class A {

    A() {
        print();
    }

    void print() {
        System.out.println("Print A");
    }
}

class B extends A {

    int i = 10; // 10 Wird erst nach der Abarbeitung von super zugewiesen

    B() {
        // super();
        print();
    }

    void print() {
        System.out.println("Print B: " + i);
    }
}
