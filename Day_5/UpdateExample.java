package Day_5;

import java.util.ArrayList;

public class UpdateExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Original ArrayList: " + numbers);

        // Update the element at index 1
        numbers.set(0, 25);
        numbers.set(1, 35);
        numbers.set(2, 40); // This will throw an IndexOutOfBoundsException since index 3 does not exist yet
        System.out.println("Updated ArrayList: " + numbers);
    }
}
