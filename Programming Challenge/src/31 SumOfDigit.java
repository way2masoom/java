//Create a program that computes the sum of the digits of an integer.

import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args){
        System.out.println("Program to calculate sum of the digits of an integer.");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number :");
        int num=input.nextInt();

        int result=SumDigit(num);
        System.out.println("The sum of digit is = "+result);

    }

    // Creating a method to calculate the sum of digit
    public static int SumDigit(int num){
        int sum=0;
        while (num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }

}
