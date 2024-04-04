
import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double marks = 0;
        double totalmarks = 0;
        double averagepourcentage = 0;

        System.out.println("enter the number of subjects");
        int numsubjects = scanner.nextInt();
        for (int i = 0; i < numsubjects; i++) {
            System.out.println("enter the marks of subject " + (i + 1));
            marks = scanner.nextDouble();
            totalmarks += marks;

        }
        averagepourcentage = totalmarks / numsubjects;
        String grade;
        String remarque;

        if (averagepourcentage >= 90) {
            grade = "O";
            remarque = "EXELLENT :)";

        } else if (averagepourcentage >= 80) {
            grade = "A";
            remarque = "GOOD JOB";

        } else if (averagepourcentage >= 70) {
            grade = "B";
            remarque = "VERY GOOD";
        }

        else if (averagepourcentage >= 60) {
            grade = "C";
            remarque = "GOOD";
        } else if (averagepourcentage >= 50) {
            grade = "D";
            remarque = "POOR";
        } else {
            grade = "E";
            remarque = "VERY POOR";
        }

        System.out.println("your total marks is " + totalmarks);
        System.out.println("your average is " + averagepourcentage);
        System.out.println("your grade is " + grade);
        System.out.println(remarque);
    }
}
