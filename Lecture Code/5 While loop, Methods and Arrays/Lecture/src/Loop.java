import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
//        Example of Loop
//        System.out.println("Printing numbers form 1 to 100 using loop");
//
//        int num=1; // Initialization
//        while (num<=100){ // Condition
//            System.out.println(num); // Output of the code
//            num=num+1; // Updating the Condition
//        }

//        printing the reverse Counting from 500 to 200
//        int cout=500;
//        while (cout>=200){
//            System.out.println(cout);
//            cout=cout-1;
//        }

//        Taking inputs from User 5 times
        Scanner input=new Scanner(System.in);
        int i=0; // Initialization
        while(i<5) { // Condition
            System.out.print("enter a number : ");
            int num = input.nextInt();
            System.out.println("Your Number is = "+num);
            i=i+1;

        }

    }
}
