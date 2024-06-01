import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        System.out.println("Program to a LCM of given numbers \n");
        Scanner input=new Scanner(System.in);

        //Taking Inputs from user
        System.out.print("Enter the first number: ");
        int first=input.nextInt();
        System.out.print("Enter the second number: ");
        int second=input.nextInt();

        int result=lcm(first,second); //calling the method
        System.out.println("LCM of two number is = "+result);
    }

    public static int lcm(int first,int second) {
        int i=1;
        while (true){ // infinite Loop condition
            int factor=first*i;
            if(factor % second==0){
                return factor;
            }
            i++;
        }
//    return 0; Unreachable
    }

}
