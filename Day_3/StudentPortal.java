import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentPortal {
	private static final Scanner scanner = new Scanner(System.in);
	private static final List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n=== Student Portal ===");
			System.out.println("1. Add student");
			System.out.println("2. View students");
			System.out.println("3. Search student");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");

			switch (scanner.nextLine().trim()) {
				case "1" -> addStudent();
				case "2" -> viewStudents();
				case "3" -> searchStudent();
				case "4" -> {
					System.out.println("Goodbye!");
					return;
				}
				default -> System.out.println("Invalid option.");
			}
		}
	}

	private static void addStudent() {
		System.out.print("Student ID: ");
		String id = scanner.nextLine().trim();
		System.out.print("Name: ");
		String name = scanner.nextLine().trim();
		System.out.print("Course: ");
		String course = scanner.nextLine().trim();

		students.add(new Student(id, name, course));
		System.out.println("Student added successfully.");
	}

	private static void viewStudents() {
		if (students.isEmpty()) {
			System.out.println("No students found.");
			return;
		}
		students.forEach(System.out::println);
	}

	private static void searchStudent() {
		System.out.print("Enter student ID or name: ");
		String query = scanner.nextLine().trim().toLowerCase();
		boolean found = false;

		for (Student student : students) {
			if (student.id.toLowerCase().contains(query)
					|| student.name.toLowerCase().contains(query)) {
				System.out.println(student);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Student not found.");
		}
	}

	private static class Student {
		private final String id;
		private final String name;
		private final String course;

		private Student(String id, String name, String course) {
			this.id = id;
			this.name = name;
			this.course = course;
		}

		@Override
		public String toString() {
			return "ID: " + id + " | Name: " + name + " | Course: " + course;
		}
	}
}
