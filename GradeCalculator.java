import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[3];

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 3.0;
    }

    public char getGrade() {
        double average = calculateAverage();
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 60) return 'C';
        else if (average >= 40) return 'D';
        else return 'F';
    }

    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.printf("Average Marks: %.2f\n", calculateAverage());
        System.out.println("Grade: " + getGrade());
    }
}

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        int[] marks = new int[3];
        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        Student student = new Student(name, marks);
        student.displayResult();

        scanner.close();
    }
}

