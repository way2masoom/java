//18.Create a program that determines if a given year is a leap year
//   (considering conditions like divisible by 4 but not 100, unless also divisible by 400).

import java.util.Scanner;

class LeapYear {
     public static void main(String[] args) {
         System.out.println("Finding the Leap Year");

         Scanner input=new Scanner(System.in);
         System.out.println("Enter the year");
         int year=input.nextInt();

//         Condition to find the leap year
         if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
         {
             System.out.println(year+" Is a leap Year");
         }
         else {
             System.out.println(year+" Not a leap Year");
         }

     }
}
