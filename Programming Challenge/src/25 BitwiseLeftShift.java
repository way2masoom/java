//Example:
//        Suppose the user enters the number 5.
//
//        Perform left shift bitwise operation:
//        💫Shift each bit of the number to the left by 4 positions:
//        ✔️Binary representation of 5: 0000 0101
//        ✔️After left shift by 4 positions: 0101 0000
//        ✔️Decimal value of 0101 0000 in binary is 80

//Basically 5 will multiply by 2 time up to 4 times Eg: 5*2*2*2*2=80


import java.util.Scanner;

class BitwiseLeftShift {
     public static void main(String[] args) {
         System.out.println("Showing Bitwise << LeftShift  Operation \n ");

         Scanner input=new Scanner(System.in);

         System.out.print("Enter A number :");
         int num=input.nextInt();
         int result=num<<4;
         System.out.println("Result is = "+result);
     }
}