package de.lubowiecki.playgroundoca.patterns.builder;

import java.time.Year;

public class VehicleBuilder {

    private String registration = "Unbekannt";

    private String brand = "Unbekannt";

    private String type = "Unbekannt";

    private int year = Year.now().getValue();

    public VehicleBuilder setRegistration(String registration) {
        this.registration = registration;
        return this;
    }

    public VehicleBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public VehicleBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public VehicleBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(registration, brand, type, year);
    }
}
