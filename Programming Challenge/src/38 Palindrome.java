import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome  Program");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number :");
        int num=input.nextInt();

        boolean isPalindrome=isPalindrome(num);

        if(isPalindrome){
            System.out.println(num+" is Palindrome Number");
         }
        else {
            System.out.println(num + " is Not Palindrome number");
        }
    }

    // Creating a method to find the number is Palindrome or not
    public static boolean isPalindrome(int num){
        // calling the reverse method
        int reverse=reverse(num);
        return reverse==num;
    }


    // Creating a method to reverse a Number
    public static int reverse(int num) {
        int newNum = 0; // Variable to store the reversed number

        // Loop to reverse the digits of the number
        while (num > 0) {
            int digit = num % 10; // Extract the last digit of the number
            newNum = newNum * 10 + digit; // Append the digit to the new number
            num /= 10; // Remove the last digit from the original number
        }

        return newNum; // Return the reversed number
    }
}
