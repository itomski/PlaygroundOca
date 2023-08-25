package de.lubowiecki.playgroundoca.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class UserContainer {

    private List<User> userList = new ArrayList<>();

    public List<User> get() {
        return userList;
    }

    public void add(User user) {
        userList.add(user);
    }

    public void sort() {
        // Collections.sort(userList); // User muss Comparable-Interface implementieren
        sort((user1, user2) -> user1.getLastname().compareToIgnoreCase(user2.getLastname())); // Nach Nachnamen
    }

    public void sort(Comparator<User> comp) {
        userList.sort(comp);
    }

    public void print() {
        print(s -> System.out.println(s));
    }

    public void print(Consumer<User> cons) {
        userList.forEach(cons);
    }
}
