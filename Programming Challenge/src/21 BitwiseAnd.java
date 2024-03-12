//Convert 5 and 3 to binary:
//
//1. 5 in binary: 0101
//   3 in binary: 0011
//2. Perform bitwise AND operation:
//        0101 (5)
//        0011 (3)
//        0001 (1)
//        Convert the result back to decimal:
//        0001 in decimal: 1

//3. Convert the result back to decimal:
//   0001 in decimal: 1

import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] arr){
        Scanner input=new Scanner(System.in);
        System.out.print("Showing Bitwise AND Operation \n");
        System.out.print("Enter the First Number:");
        int num1=input.nextInt();

        System.out.print("Enter the Second Number:");
        int num2=input.nextInt();

        int result=num1 & num2;
        System.out.println("Result is : " +result);
    }
}
