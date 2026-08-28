package Day_5;

import java.util.ArrayList;
public class DeleteExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Original ArrayList: " + numbers);

        // Remove the element at index 1
        numbers.remove(1);
        System.out.println("ArrayList after removing element: " + numbers);
    }
}
