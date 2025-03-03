import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Please enter a valid number of the subject.");
            return;

        }
        int totalMarks = 0;
        int maximumsubjectMarks = 100;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100):");
            int marks = sc.nextInt();

            if (marks < 0 || marks > maximumsubjectMarks) {
                System.out.println("Marks should be in the range of 0 to 100.renter");
                i--;
            } else {
                totalMarks += marks;
            }
        }

        double avgPercentage = (double) totalMarks / (numSubjects * maximumsubjectMarks) * 100;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");

        String grade;

        if (avgPercentage >= 90) {
            grade = "A+";
        } else if (avgPercentage >= 80) {
            grade = "A";
        } else if (avgPercentage >= 70) {
            grade = "B";
        } else if (avgPercentage >= 60) {
            grade = "C";
        } else if (avgPercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

    }
}