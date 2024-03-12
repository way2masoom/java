//15.Create a program that determines if a number is positive, negative, or zero.

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Finding the number is Positive Negative or Zero \n");

        System.out.print("Enter a number: ");
       int num=input.nextInt();

//        condition to check whether the number is positive negative or zero
        if(num>0){
            System.out.println("Positive Number");
        } else if (num==0) {
            System.out.println("your number is Zero");
        }
        else {
            System.out.println("Negative number");
        }
    }
}
