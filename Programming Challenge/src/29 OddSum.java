//Create a program to sum all odd numbers from 1 to a specified number N

import java.util.Scanner;
class OddSum {
    public static void main(String[] args) {
        System.out.println("Print the sum of odd number only");
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=input.nextInt();

        //calling method
        oddsum(num);
    }

    //creating a method for oddSum
    public static void oddsum(int num){
        int i=1;
        int sum=0;
        while (i<=num){
            if ((i%2)!=0) {
                sum=sum+i;
                System.out.println( "Odd number is "+i);
                System.out.print("\n");
            }
            i++;
        }
        System.out.println( "Sum of Odd Number is = "+sum);

    }
}
