//Create a program that computes the sum of the digits of an integer.

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        System.out.println("Program to calculate sum of the digits of an integer.");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number :");
        int num=input.nextInt();

        int result=SumDigit(num);
        System.out.println("The sum of digit is = "+result);

    }

    // Creating a method to calculate the sum of digit
    public static int SumDigit(int n){
        int sum=0;
        int i=0;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        return sum;
    }

}
