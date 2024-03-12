//Create a program that categorize a person into different age groups
//Child -> below 13 Teen -> below 20
//Adult -> below 60 Senior-> above 60

import java.util.Scanner;

class AgeCalculator {
     public static void main(String[] args) {
         System.out.println("A simple AGE Calculator");
         Scanner input=new Scanner(System.in);
         System.out.println("Enter the AGE of the Person :");
         int age=input.nextInt();

//         checking the age
         if(age>=65){
             System.out.println("You are a Senior Citizen");
         }
         else if (age>=20) {
             System.out.println("Your are  Adult");
         }
         else if (age>=13) {
             System.out.println("You are Teen");
         }
         else {
             System.out.println("You are Child");
         }
     }
}
