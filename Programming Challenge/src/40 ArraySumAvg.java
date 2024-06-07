//Create a program to find the sum and average of all elements in an array

import java.util.Scanner;

class SumandAvg {
     public static void main(String[] args) {
         System.out.println("Welcome to Sum and Average calculator");

         // Calling the method to input the array from the user
         int [] numArray=ArrayUtility.inputArray();

         // Calculating the sum and average of the array elements
         long sum=sum(numArray);
         double avg=average(numArray);

         // Displaying the sum and average of the numbers
         System.out.println("SUM of the number is = "+sum);
         System.out.println("Average of the number is = "+avg);
     }

    // Method to calculate the sum of the array elements
    public static long sum(int[] numArray){
            long sum=0;
            int i=0;
            while (i<numArray.length){
                sum+=numArray[i];
                i++;
            }
         return sum;
     }

    // Method to calculate the average of the array elements
     public static double average(int[] numArray ){
        long sum=sum(numArray);

         return (double) (sum/numArray.length);
     }
}

