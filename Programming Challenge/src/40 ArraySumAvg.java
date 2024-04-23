//Create a program to find the sum and average of all elements in an array

import java.util.Scanner;

class SumandAvg {
     public static void main(String[] args) {
         System.out.println("Welcome to Sum and Average calculator");

         Scanner input=new Scanner(System.in);
         int[] arr={10,20,30,40};
         int sum=ArraSum(arr);

         System.out.println(" Sum of array is = "+sum);

     }
     public static int ArraSum(int[] arr){
         int i=0;
         int arrsum=0;
         int avg=0;
         while(i < arr.length){
             arrsum = arrsum + arr[i];
             i++;
         }
         return arrsum;
     }
     public static int ArrayAvg(int avg){
        avg=ArraSum()/arr.length;
    }
}
