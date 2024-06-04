import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Fibonacci seriesProgram \n");

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);

        // Print the result
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
    // Creating method to find the number is Armstrong number
    public static boolean isArmstrongNumber(int num){
        // Copying the original number
        int copyNum=num;

        // Calling the noOfDigits method to get the number of digits
        int noOfDigits=noOfDigits(num);

        int finalNumber=0;

        // Loop to calculate the sum of each digit raised to the power of noOfDigits
        while(num>0){
            int lastDigit=num%10;       // Extract the last digit
            num/=10;                    // Remove the last digit from the number
            finalNumber+=pow(lastDigit,noOfDigits);  // Add the power of the last digit to the sum
        }
        // Check if the calculated sum is equal to the original number
        return finalNumber==copyNum;
    }

    //Cresting a method to find the number of digits
    public static int noOfDigits(int num){
        int digits=0;
        // Loop to count the number of digits
        while (num>0){
            digits++;
            num/=10;        // Remove the last digit from the number
        }
        return digits;
    }

    //Creating a method to find the Power of the Number
    public static int pow(int num1,int num2){
        int result=1;
        int i=0;
        // Loop to multiply the base num1, num2 times
        while (i<num2){
            result*=num1;       // Multiply result by num1
            i++;
        }
        return result;
    }
}
