package Day_5;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(1, "Alice");
        employees.put(2, "Bob");
        employees.put(3, "Charlie");
        System.out.println("HashMap: " + employees);
        System.out.println("Value for key 2: " + employees.get(2));
    }
}
