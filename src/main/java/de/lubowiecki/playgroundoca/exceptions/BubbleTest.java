package de.lubowiecki.playgroundoca.exceptions;

public class BubbleTest {

    public static void main(String[] args) {
        System.out.println("main start");
        // method1();

        try {
            methodChecked1();
        } catch (Exception e) {
            System.out.println("Problem");
        }

        System.out.println("main ende");
    }

    static void method1() {
        System.out.println("m1 start");
        method2();
        System.out.println("m1 ende");
    }

    static void method2() {
        System.out.println("m2 start");
        try {
            method3();
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("m2 ende");
    }

    static void method3() {
        System.out.println("m3 start");
        method4();
        System.out.println("m3 ende");
    }

    static void method4() {
        System.out.println("m4 start");
        // throw new RuntimeException("Problem");
        /* try { */
            int[] arr = new int[-5];
        /*}
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }*/
        System.out.println("m4 ende");
    }

    static void methodChecked1() throws Exception {
        System.out.println("mc1 start");
        methodChecked2();
        System.out.println("mc1 ende");
    }

    static void methodChecked2() throws Exception {
        System.out.println("mc2 start");
        methodChecked3();
        System.out.println("mc2 ende");
    }

    static void methodChecked3() throws Exception {
        System.out.println("mc3 start");
        // handle (try-catch) or declare (throws an die Methodensignatur)
        methodChecked4();
        System.out.println("mc3 ende");
    }

    static void methodChecked4() throws Exception { // Der Aufrufer dieser Methode muss sich um die Exception kümmern
        System.out.println("mc4 start");

        throw new Exception(); // Checked - verlässt sofort die Methode

        //System.out.println("mc4 ende");
    }

}
