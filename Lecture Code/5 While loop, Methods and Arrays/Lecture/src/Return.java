import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
    //calling greet method
        greet();
    // calling Number read method
        int first=readNumber();     // calling method
        int second=readNumber();    // calling method

    //Adding two numbers
        int sum=first+second;
        System.out.println("The sum of two number is = "+sum);
    }

    //creating a greet method
    public static void greet(){
        System.out.println("Welcome to Calculator \n");
    }

    //creating a method to read numebrs from user
    public static int readNumber() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=input.nextInt();
        return number;
    }
}
