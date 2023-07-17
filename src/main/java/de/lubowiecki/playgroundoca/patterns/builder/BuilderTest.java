package de.lubowiecki.playgroundoca.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderTest {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("HH-AB123", "Ford", "Fiesta", 2000);
        System.out.println(v1);

        v1 = new Vehicle(v1.getRegistration(), v1.getBrand(), v1.getType(), 2010);
        System.out.println(v1);

        VehicleBuilder builder = new VehicleBuilder();
        v1 = builder.build();
        System.out.println(v1);

        // Neuer Standard wird
        builder.setBrand("Fiat").setType("Punto").setYear(2000);

        Vehicle v2 = builder.setRegistration("HH:AB234").build();
        System.out.println(v2);

        Vehicle v3 = builder.setRegistration("HH:XY789").build();
        System.out.println(v3);

        System.out.println();

        List<Vehicle> fahrzeugen = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            fahrzeugen.add(builder.setRegistration("HH:XY78" + i).build());
        }

        System.out.println(fahrzeugen);


        System.out.println();

        v2 = builder.setRegistration("AB:ZX123").build();
        v3 = builder.setRegistration("AB:ZX123").build();

        System.out.println(v2.equals(v3));
        System.out.println(v2.hashCode());
        System.out.println(v3.hashCode());

    }
}
