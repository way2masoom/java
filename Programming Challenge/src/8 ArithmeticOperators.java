import java.util.Scanner;

//Create a program that takes two numbers and shows result of all
//arithmetic operators (+,-,*,/,%).
class ArithmeticOperators {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1=input.nextInt();

        System.out.print("Enter Second Number: ");
        int num2=input.nextInt();
        
        int sum=num1+num2;
        int subtract=num1-num2;
        int multiple=num1*num2;
        int divide=num1/num2;
        int moduler =num1%num2;

        System.out.println("The Addition of two number  is = "+sum);
        System.out.println("The subtraction of two number is = "+subtract);
        System.out.println("The Multiplication of two numbe is = "+multiple);
        System.out.println("The Division of two numbe is = "+divide);
        System.out.println("The Module of two numbe is = "+ moduler);
    }
}
