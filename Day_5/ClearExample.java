package Day_5;

import java.util.ArrayList;

public class ClearExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Original ArrayList: " + names);
        names.clear();
        System.out.println("ArrayList after clear(): " + names);
    }
}
