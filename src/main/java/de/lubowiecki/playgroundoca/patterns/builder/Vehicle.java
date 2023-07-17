package de.lubowiecki.playgroundoca.patterns.builder;

import java.util.Objects;

public class Vehicle {

    private final String registration;

    private final String brand;

    private final String type;

    private final int year;

    public Vehicle(String registration, String brand, String type, int year) {
        this.registration = registration;
        this.brand = brand;
        this.type = type;
        this.year = year;
    }

    public String getRegistration() {
        return registration;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("registration='").append(registration).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }

    /*
    public boolean equals(Object other) {

        if(this == other) return true; // zeigen beide Referenzen auf das gleiche Objekt?

        if(other == null) return false; // Ist es null?

        if(!(other instanceof Vehicle)) { // Sind die Objekte vom gleichen Typ?
            return false;
        }

        // Vergleich von Eigenschaften
        Vehicle v = (Vehicle) other; // Die Referenz von other wird von Object auf Vehicle erweitert

        if(registration.equals(v.getRegistration()) &&
                brand.equals(v.getBrand()) &&
                type.equals(v.getType()) &&
                year == v.getYear()) {
            return true;
        }

        return false;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Objects.equals(registration, vehicle.registration) && Objects.equals(brand, vehicle.brand) && Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration, brand, type, year);
    }
}
