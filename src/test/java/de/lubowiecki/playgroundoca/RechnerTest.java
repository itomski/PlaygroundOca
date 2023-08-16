package de.lubowiecki.playgroundoca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RechnerTest {

    @Test
    public void add() {
        Rechner rechner = new Rechner();
        double a = 10.0;
        double b = 20.0;
        double expected = 30.0;
        assertEquals(expected, rechner.add(a, b));
    }

    @Test
    public void sub() {
        Rechner rechner = new Rechner();
        double a = 10.0;
        double b = 20.0;
        double expected = -10.0;
        assertEquals(expected, rechner.sub(a, b));
    }
}
