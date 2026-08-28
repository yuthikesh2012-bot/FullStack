package Day_5;

public class AverageArray {
    public static void main(String[] args) {
        int[] marks = { 85, 90, 78, 92, 88 }; // Declare and initialize an array of marks
        int sum = 0;
        for (int mark : marks) {
            sum += mark; // Calculate the sum of marks
        }
        double average = (double) sum / marks.length; // Calculate the average
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average of marks: " + average);

        int sumEnhanced = 0;
        for(int i=0; i<marks.length; i++){
            sumEnhanced += marks[i]; // Calculate the sum of marks using enhanced for loop
        }
        double averageEnhanced = (double) sumEnhanced / marks.length; // Calculate the average using enhanced for loop
        System.out.println("Sum of marks using enhanced loop: " + sumEnhanced);
        System.out.println("Average of marks using enhanced loop: " + averageEnhanced);
    }
}