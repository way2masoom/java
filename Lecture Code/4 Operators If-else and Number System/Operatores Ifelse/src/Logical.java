import java.util.Scanner;

public class Logical {
    public static void main(String[] args){
        System.out.println("Welcome to  Ticket Discount Calculator\n");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter you Age to get Discount:");
        int age= input.nextInt();
        System.out.println("Are you a Female True=T False=F (True/False) ");
        boolean isFemale=input.nextBoolean();

        if(age<5){
            System.out.println("You got 75% of Discount");
        }
        else if(isFemale){
            System.out.println("You got 25% of Discount");
        }
        else if(age>60 && !isFemale){
            System.out.println("You got 25% of Discount");
        }
        else {
            System.out.println("You got not Discount");
        }

    }
}
