package Day_5;

public class MarksArray extends Object {
    public static void main(String[] args) {
        int[] marks = { 85, 90, 78, 92, 88 }; // Declare and initialize an array of marks
        System.out.println("Marks of students:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of student " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Marks of students using enhanced loop:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
    
}
