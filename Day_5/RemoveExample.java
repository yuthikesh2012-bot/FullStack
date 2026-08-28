package Day_5;

import java.util.ArrayList;
public class RemoveExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Original ArrayList: " + names);
        names.remove("Bob");
        System.out.println("ArrayList after removing 'Bob': " + names);
    }
}
