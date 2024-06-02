import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        System.out.println("Program to calculate GCD");

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter first Number: ");
        int first = input.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter second Number: ");
        int second = input.nextInt();

        // Calculate GCD of the two numbers
        int result = gcd(first, second);

        // Display the result
        System.out.println("The GCD of two numbers is = " + result);
    }

    // Method to find GCD
    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int i = 2;

        // Find the smaller of the two numbers
        int least = least(num1, num2);

        // Iterate from 2 up to the smaller number
        while (i <= least) {
            // Check if both numbers are divisible by i
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Update gcd to the current divisor
            }
            i++;
        }
        return gcd; // Return the GCD
    }

    // Method to find the smaller of two numbers
    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1; // Return the first number if it is smaller
        } else {
            return num2; // Return the second number if it is smaller or equal
        }
    }
}
