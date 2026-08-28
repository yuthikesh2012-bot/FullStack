package Day_5;

import java.util.ArrayList;
public class ArrayExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);
        numbers.add(5, 15);
        System.out.println("ArrayList: " + numbers);

        System.out.println("Element at index 0: " + numbers.get(0));
        System.out.println("Element at index 1: " + numbers.get(1));
        System.out.println("Element at index 2: " + numbers.get(2));

        System.out.println("Original ArrayList: " + numbers);
        numbers.set(0, 25);
        numbers.set(1, 35);
        numbers.set(2, 40);
        System.out.println("Updated ArrayList: " + numbers);

        numbers.remove(1);
        System.out.println("ArrayList after removing element: " + numbers);
    }

    double average(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    double sum(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
