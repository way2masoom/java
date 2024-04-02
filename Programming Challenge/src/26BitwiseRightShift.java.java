//Example:
//        Suppose the user enters the number 40.
//
//        Perform right shift bitwise operation:
//        💫Shift each bit of the number to the right by 3 positions:
//        ✔️Binary representation of 40: 0010 1000
//        ✔️After right shift by 3 positions: 0000 0101
//        ✔️Decimal value of 0000 0101 in binary is 5

//Basically 40 will Divide by 3 time up to 3 times Eg: 40/3/3/3=5


import java.util.Scanner;

class BitwiseRightShift {
     public static void main(String[] args) {
         System.out.println("Showing Bitwise >> RightShift  Operation \n ");

         Scanner input=new Scanner(System.in);

         System.out.print("Enter A number :");
         int num=input.nextInt();
         int result=num>>3;
         System.out.println("Result is = "+result);
     }
}
