//19.Create a program that calculates grades based on marks
//A -> above 90% B -> above 75%
//C -> above 60% D -> above 30%
//F-> below 30%

import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args){
        System.out.println(" Calculator To calculate Grades based on marks");
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

//        taking input from user
        System.out.println("Enter the Marks of Student between (0 to 100)");
        float marks=input.nextFloat();

//        // Check the marks and assign grades accordingly
        if(marks >=90){
            System.out.println("You got A");
        }
        else if (marks>=75) {
            System.out.println("You got B");
        }
        else if (marks>=60) {
            System.out.println("You got c");
        }
        else if (marks>=30) {
            System.out.println("You got D");
        }
        else {
            System.out.println("Yo got F ");
        }

//        Another way
//        if (marks >= 90 && marks <= 100) {
//            System.out.println("You got Grade: A - Excellent, Marks: " + marks);
//        } else if (marks >= 75 && marks < 90) {
//            System.out.println("You got Grade: B - Very Good, Marks: " + marks);
//        } else if (marks >= 60 && marks < 75) {
//            System.out.println("You got Grade: C - Good, Marks: " + marks);
//        } else if (marks >= 30 && marks < 60) {
//            System.out.println("You got Grade: D - Average, Marks: " + marks);
//        } else if (marks < 30 && marks >= 0) {
//            System.out.println("You got Grade: F - Fail, Marks: " + marks);
//        } else {
//            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
//        }

    }

}

