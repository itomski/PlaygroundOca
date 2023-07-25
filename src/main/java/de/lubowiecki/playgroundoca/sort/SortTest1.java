package de.lubowiecki.playgroundoca.sort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class SortTest1 {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Author author1 = new Author("Martin", "Fowler");

        books.add(new Book("978-0134757599", "Refactoring", 19.99, author1));
        books.add(new Book("978-0321712943", "Domain Specific Languages", 39.99, author1));
        books.add(new Book("978-0321127426", "Patterns of Enterprise...", 39.99, author1));

        Author author2 = new Author("Robert C.", "Martin");

        books.add(new Book("978-0132350884", "Clean Code", 29.99, author2));

        final String FMT = "| %18s | %30s | %.2f € | %16s | %16s |";

        Consumer<Book> bookConsumer = book -> System.out.println(String.format(FMT,
                                                book.getIsbn(),
                                                book.getTitle(), // TODO: sinnvoll abschneiden
                                                book.getPrice(),
                                                book.getPublisher(),
                                                book.getAuthor()));

        // bookConsumer = book -> System.out.println(String.format("%s, %s", book.getTitle(), book.getAuthor()));

        // Collections.sort(books);

        // int compare(T o1, T o2);
        // Comparator: Vergleichsobjekt
        Comparator<Book> priceComparator = (b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice());
        Comparator<Book> titleComparator = (b1, b2) -> b1.getTitle().compareTo(b2.getTitle());
        Comparator<Book> isbnComparator = (b1, b2) -> b1.getIsbn().compareTo(b2.getIsbn());
        Comparator<Book> authorComparator = (b1, b2) -> b1.getAuthor().getLastname().compareTo(b2.getAuthor().getLastname());

        //Collections.sort(books, priceComparator);
        //Collections.sort(books, priceComparator.reversed());
        //Collections.sort(books, priceComparator.thenComparing(titleComparator));
        Collections.sort(books, authorComparator.thenComparing(titleComparator));

        books.forEach(bookConsumer);
    }
}
