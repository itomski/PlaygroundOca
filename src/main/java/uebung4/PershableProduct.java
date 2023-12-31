package uebung4;

import java.time.LocalDate;

// Da Product serialisierbar ist, ist auch das PershableProduct serialisierbar
public class PershableProduct extends Product {

    private final LocalDate expiryDate;

    public PershableProduct(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PershableProduct [expiryDate=");
        builder.append(expiryDate);
        builder.append(", name=");
        builder.append(getName());
        builder.append(", description=");
        builder.append(getDescription());
        builder.append(", price=");
        builder.append(getPrice());
        builder.append(", createdAt=");
        builder.append(getCreatedAt());
        builder.append("]");
        return builder.toString();
    }
}
