package de.lubowiecki.playgroundoca.lambda;

import java.time.LocalDate;
import java.util.Comparator;

public class UserContaierTest {

    public static void main(String[] args) {

        UserContainer container = new UserContainer();
        container.add(new User("Peter", "Parker", LocalDate.of(1989, 10, 1)));
        container.add(new User("Carol", "Danvers", LocalDate.of(1992, 5, 10)));
        container.add(new User("Bruce", "Banner", LocalDate.of(1982, 12, 7)));

        // container.print(); // Verwendet toString von User
        // container.print(user -> System.out.printf("| %-10s | %-10s | %-10s | \n", user.getFirstname(), user.getLastname(), user.getBirthdate()));
        //container.sort(); // Nach Nachnamen
        //container.print(user -> System.out.println(user.getFirstname().charAt(0) + ". " + user.getLastname()));

        Comparator<User> comp = (user1, user2) -> user1.getBirthdate().compareTo(user2.getBirthdate());
        container.sort(comp.reversed());
        container.print(user -> System.out.printf("| %-10s | %-10s | %-10s | \n", user.getFirstname(), user.getLastname(), user.getBirthdate()));
    }
}
