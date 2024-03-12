import java.util.Scanner;

public class Retrun {
    public static void main(String[] args) {
      great(); // function call
        int first=ReadNumber(); // calling the function for Input values
        int second=ReadNumber();// calling the function for Input values

    //Function call
        int result=sum(first,second); // function call to add the number
        System.out.println("The sum is = "+result);
    }
//    Greating Function
    public static void great(){
        System.out.println("Welcome to Return Statement\n");
    }

//    Read a Number Function
    public static int ReadNumber(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int number= input.nextInt();

        return number;
    }

//    function for Sum
    public static int sum(int a, int b){
        int sum;
        sum=a+b;
        return sum;
    }
}
