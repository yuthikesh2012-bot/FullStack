package Day_5;

import java.util.ArrayList;

public class CopyArrayLIst {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Alice");
        originalList.add("Bob");
        originalList.add("Charlie");

        // Create a copy of the original ArrayList
        ArrayList<String> copiedList = new ArrayList<>(originalList);

        // Display both lists
        System.out.println("Original ArrayList: " + originalList);
        System.out.println("Copied ArrayList: " + copiedList);
    }
    
}
