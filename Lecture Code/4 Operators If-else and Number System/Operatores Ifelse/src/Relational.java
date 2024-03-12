import java.util.Scanner;

public class Relational  {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Driving Licence Calculator");

        System.out.print("Enter your age to check Eligibility:");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("Your are Eligible");
        }
        else {
            System.out.println("You are Not Eligible");
        }


    }

}
