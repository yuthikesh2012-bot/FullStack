package Day_5;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        System.out.println("Original ArrayList: " + names);
        Collections.sort(names);
        System.out.println("Sorted ArrayList: " + names);
        Collections.reverse(names);
        System.out.println("Reversed ArrayList: " + names);
    }
}