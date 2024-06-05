import java.util.Scanner;

class LoopPatterns {
    public static void main(String[] args) {
        System.out.println("Patterns program");
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of row  :");
        int num=input.nextInt();

        //Calling method to print the first pattern using while loop
        printRightHalfPyramid(num);

        System.out.println();
        printReverseRightHalfPyramid(num);

    }

    //method to print the first pattern using while loop
    public static void printRightHalfPyramid(int maxRows){
        System.out.println("\n Here is RightHalf Pyramid");
        int rows=0;
        while (rows<maxRows){
            System.out.print("*");
            int i=0;
            while (i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    //method to print the first pattern using while loop
    public static void printReverseRightHalfPyramid(int maxRows){
        System.out.println("\n Here is Reverse RightHalf Pyramid");
        int rows=maxRows;
        while (rows>0){
            int i=0;
            while (i<rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

}
