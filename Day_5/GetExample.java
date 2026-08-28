package Day_5;

import java.util.ArrayList;
public class GetExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Element at index 0: " + numbers.get(0));
        System.out.println("Element at index 1: " + numbers.get(1));
        System.out.println("Element at index 2: " + numbers.get(2));
    }
}
