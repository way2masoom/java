import java.util.Scanner;

//13.Create a program to calculate Compound interest.
//   Compound Interest = P(1 + R/100)t
class CompoundInterest {
    public static void main(String[] args){
        System.out.println("Calculating Compound Interest");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount in RS: ");
        double P = input.nextDouble();
        System.out.print("Enter the Time Taken In Years: ");
        int T = input.nextInt();
        System.out.print("Enter the Rate of Interest R (in percentage): ");
        double R = input.nextDouble();

        // Formula to calculate the Compound Interest, CP = P(1 + R/100)^T
        double CP = P * Math.pow(1 + R / 100, T);

        System.out.println("\nPrincipal Amount: RS " + P);
        System.out.println("Time Taken: " + T + " years");
        System.out.println("Rate of Interest: " + R + "%");
        System.out.println("Compound Interest: RS " + CP);
    }
}

