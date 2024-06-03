    import java.util.Scanner;

     class PrimeNumber {
         public static void main(String[] args) {
             System.out.println("Program to Find PrimeNumber");

             // Create a Scanner object for user input
             Scanner input = new Scanner(System.in);

             // Prompt user to enter the first number
             System.out.print("Enter first Number: ");
             int num = input.nextInt();

             //Method Call
             boolean primeNum=isPrime(num);

             // Display the result
             if(primeNum){
                  System.out.println("Your Number is Prime");
              }
              else {
                  System.out.println("Your Number is not a Prime");
              }
         }

         // Method to find prime Number
         public static boolean isPrime(int num) {
            int i=2;
            while (i<num){
                if(num%i==0){
                    return false;
                }
                i++;
            }
             return true;
         }

     }
