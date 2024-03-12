//9. Create a program to calculate product of two floating points numbers

import java.util.Scanner;

 class FloatMultiplication {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("We are doing Float Multiplication\n");
        System.out.print("Enter the first first decimal number :");
        float num1=input.nextFloat();

        System.out.print("Enter the Second decimal number :");
        float num2=input.nextFloat();

        float Multiple= num1*num2;
        System.out.println("Multiple of 2 floating Number is = " +Multiple);


    }
}
