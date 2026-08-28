package Day_5;

import java.util.ArrayList;
public class AddExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 15); // Adding an element at index 1
        numbers.add(0, 5); // Adding an element at index 0
        System.out.println("Numbers in the ArrayList: " + numbers);
    }
}
