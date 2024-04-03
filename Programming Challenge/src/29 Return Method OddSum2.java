import java.util.Scanner;

class OddSum2 {
    public static void main(String[] args) {
        System.out.println("Printg Sum of Odd Number using Return method");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=input.nextInt();
        int sum=oddSum(num);
        System.out.println("OddSum till " + num + " is: " + sum);

    }

    //creating method
    public static int oddSum(int num){
        int sum=0;
        int i=1;
        while (i<=num){
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
