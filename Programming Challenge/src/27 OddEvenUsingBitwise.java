//Odd and even Using bitwise operator


import java.util.Scanner;

class OddEvenUsingBitwise {
    public static void main(String[] arr){
        Scanner input=new Scanner(System.in);
        System.out.print("Finding Odd Or even using Bitwise Operators \n");
        System.out.print("Enter the A Number:");
        int num=input.nextInt();

       if((num & 1) ==0)
       {
           System.out.println(num + " is Even");
       }
       else {
           System.out.println(num + " is Odd");
       }


    }
}
