//1.Convert 5 to binary:
//        5 in binary: 0000 0101
//
// 2. Perform bitwise complement operation:
//        . Flip each bit of the number:
//        . 0000 0101 (5)
//        . 1111 1010 (-6 in two's complement representation)


import java.util.Scanner;

class BitwiseCompliment {
     public static void main(String[] args) {
         System.out.println("Showing Bitwise ~ Compliment Operation \n ");

         Scanner input=new Scanner(System.in);

         System.out.print("Enter A number :");
         int num=input.nextInt();
         int result=~num;
         System.out.println("Result is = "+result);
     }
}
