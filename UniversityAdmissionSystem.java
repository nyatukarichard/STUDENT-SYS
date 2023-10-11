import java.util.Scanner;

public class UniversityAdmissionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store student information
        String[] studentNames = new String[50];
        int[] studentScores = new int[50];
        int numberOfStudents = 0;

        // Main menu
        while (true) {
            System.out.println("University Admission System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (numberOfStudents < studentNames.length) {
                        System.out.print("Enter student name: ");
                        String name = scanner.next();
                        System.out.print("Enter student test score: ");
                        int score = scanner.nextInt();

                        studentNames[numberOfStudents] = name;
                        studentScores[numberOfStudents] = score;
                        numberOfStudents++;
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Maximum number of students reached.");
                    }
                    break;

                case 2:
                    System.out.println("Student List:");
                    for (int i = 0; i < numberOfStudents; i++) {
                        System.out.println("Name: " + studentNames[i] + ", Score: " + studentScores[i]);
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
