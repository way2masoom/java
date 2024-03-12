import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Function {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // function
        greeting();

        System.out.println("First pattern call");
        PatternOne();
        System.out.println("Second pattern call");
        PatternTwo();
    }
    public static void greeting(){
        System.out.print("Good Morning");
    }

    public static void PatternOne() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");

        System.out.println("\n");
    }
    public static void PatternTwo(){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");


    }
}