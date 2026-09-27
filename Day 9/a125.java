import java.util.Scanner;

public class a125 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();

            double mathMarks = readMarks(scanner, "Math");
            double scienceMarks = readMarks(scanner, "Science");
            double englishMarks = readMarks(scanner, "English");

            Student student = new Student(rollNumber, name, mathMarks, scienceMarks, englishMarks);
            student.printDetails();
        }
    }

    private static double readMarks(Scanner scanner, String subject) {
        while (true) {
            System.out.print("Enter " + subject + " marks (0-100): ");
            if (scanner.hasNextDouble()) {
                double marks = scanner.nextDouble();
                if (marks >= 0 && marks <= 100) {
                    return marks;
                }
            } else {
                scanner.next();
            }
            System.out.println("Please enter a number between 0 and 100.");
        }
    }

    private static class Student {
        private final int rollNumber;
        private final String name;
        private final double mathMarks;
        private final double scienceMarks;
        private final double englishMarks;

        Student(int rollNumber, String name, double mathMarks, double scienceMarks, double englishMarks) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.mathMarks = mathMarks;
            this.scienceMarks = scienceMarks;
            this.englishMarks = englishMarks;
        }

        private double calculateTotal() {
            return mathMarks + scienceMarks + englishMarks;
        }

        private double calculateAverage() {
            return calculateTotal() / 3;
        }

        private String calculateGrade() {
            double average = calculateAverage();
            if (average >= 90) {
                return "A";
            } else if (average >= 80) {
                return "B";
            } else if (average >= 70) {
                return "C";
            } else if (average >= 60) {
                return "D";
            }
            return "F";
        }

        private void printDetails() {
            System.out.println("\nStudent Marks Details");
            System.out.println("Roll number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Math: " + mathMarks);
            System.out.println("Science: " + scienceMarks);
            System.out.println("English: " + englishMarks);
            System.out.printf("Total: %.2f / 300%n", calculateTotal());
            System.out.printf("Average: %.2f%n", calculateAverage());
            System.out.println("Grade: " + calculateGrade());
        }
    }
}
