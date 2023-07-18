package uebung4;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

public interface ViewHelper {

    // automatisch public static final
    DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter TIME_FMT = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    DateTimeFormatter DATE_US_FMT = DateTimeFormatter.ofPattern("YYYY/MM/dd");

    static String getProductAsTable(List<Product> products) {

        StringBuilder output = new StringBuilder();

        output.append(String.format("%-12s | %-20s | %-10s | %s \n", "Name", "Beschreibung", "Seit", "Preis"));
        output.append("-----------------------------------------------------------------\n");

        for (Product product : products) {
            output.append(String.format("%-12s | %-20s | %10s | %10.2f EUR \n",
                    product.getName(),
                    product.getDescription(),
                    product.getCreatedAt().format(ViewHelper.DATE_FMT),
                    product.getPrice()));
        }

        return output.toString();
    }

}
