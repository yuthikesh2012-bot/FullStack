package Day_5;

import java.util.ArrayList;
public class SearchExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("ArrayList: " + names);
        System.out.println("Contains 'Bob': " + names.contains("Bob"));
        System.out.println("Contains 'David': " + names.contains("David"));
    }
}
