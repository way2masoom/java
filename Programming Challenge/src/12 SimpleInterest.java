import java.util.Scanner;

class fcxSimpleInterest {
    public static void main(String[] args) {
        System.out.println("Calculating Simple Interest");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount in RS: ");
        double P = input.nextDouble();
        System.out.print("Enter the Time Taken In Years: ");
        int T = input.nextInt();
        System.out.print("Enter the Rate of Interest R (in percentage): ");
        double R = input.nextDouble();

        // Formula to calculate the rate of Interest, SI = (P x T x R)/100
        double SI = (P * T * R) / 100;

        System.out.println("\nPrincipal Amount: RS " + P);
        System.out.println("Time Taken: " + T + " years");
        System.out.println("Rate of Interest: " + R + "%");
        System.out.println("Simple Interest is: RS " + SI);
    }
}
