
// Create a program to swap two number
import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        int temp = 0; // Temporary value
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number A: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second number B: ");
        int num2 = input.nextInt();

        System.out.println("Number Before swap");
        System.out.println("A = " + num1 + " and B =" + num2);
        System.out.println("\n");

        // Swapping the number
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number After swap");
        System.out.print("A = " + num1 + " and B =" + num2);

    }
}

