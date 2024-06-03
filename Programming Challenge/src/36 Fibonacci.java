import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci seriesProgram \n");
        Scanner input=new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number up to which you want the Fibonacci series: ");
        int num=input.nextInt();

        System.out.println("Here is the Fibonacci series "+num);
        PrintFibonacci(num);
    }

    // Creating a method to print Fibonacci series
    public static void PrintFibonacci(int n) {
        // If the input number is less than 0, return immediately as there's nothing to print
        if (n < 0) return;

        // Print the first number in the Fibonacci series
        System.out.print("0 ");

        // If the input number is 0, return after printing 0
        if (n == 0) return;

        // Print the second number in the Fibonacci series
        System.out.print("1");

        // Initialize the first two numbers in the Fibonacci series
        int first = 0, second = 1;

        // Calculate the next number in the Fibonacci series
        int nextNum = first + second;

        // Continue printing the series until 'nextNum' exceeds 'n'
        while (nextNum <= n) {
            // Print the next number in the series
            System.out.print(" " + nextNum);

            // Update the values of 'first' and 'second' to move to the next step in the series
            first = second;
            second = nextNum;

            // Calculate the new next number in the series
            nextNum = first + second;
        }
    }
}
