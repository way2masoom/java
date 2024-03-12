
// 2.Create a program to add two numbers.
import java.util.Scanner;

class add {
    public static void main(String[] args) {
        System.out.print("Enter first Number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of your Numbers is = " + sum);
    }
}
