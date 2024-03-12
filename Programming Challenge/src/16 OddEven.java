//16.Create a program that determines if a number is odd or even.

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Checking Odd or Even Number");
        int num=input.nextInt();

//        checking the number is odd or even
        if(num%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
