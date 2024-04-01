//Impoted the method to used Input function
import java.util.Scanner;

// Example of Java Docs Comments

/**
 * This is main Method
 * @param args
 */

public class Comments {
    public static void main(String args[]){
        System.out.println("Comments");

    // This is an example of Single Line Comments

     Scanner input=new Scanner(System.in);

        //Asking User to Enter a number
        System.out.println("Enter a number :");
//        storing the input
        int num=input.nextInt();

//        Printing the output
        System.out.println("Number is = "+num);


        /* Multi line Comments*/

        /*
        int num2=input.nextInt();
        System.out.println("Num");
         */

    }
}
