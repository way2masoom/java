//Write a function that calculates the factorial of a given number.
import java.util.Scanner;

class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Program to Calculate Factorial of a Number \n");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num=input.nextInt();

        long fact=Factorial(num);
        System.out.println("The factorial of a Number is = "+fact);
    }

    // Creating a method to calculate the factorial of a given number
    // Formula to calculate the Factorial of number n!=n*(n-1)*(n-2)*.... * 1
    public static long Factorial(int num){
        //initial condition
        if(num<2){
            return 1;
        }

        int i=2;
        long fact=1;
    // Condition to find the factorial of a number
        while (i<=num){
            fact*=i;    //fact=fact*i
            i++;
        }
        return fact;
    }
}
