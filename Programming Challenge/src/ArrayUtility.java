import java.util.Scanner;

public class ArrayUtility {

    // Method to input array from the user
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int size=input.nextInt();

        int[] nums=new int[size];
        // Taking array elements input from the user
        int i=0;
        while (i<size){
            System.out.println("Please Enter Element No"+(i+1)+": ");
            nums[i]=input.nextInt();
            i++;
        }
        return nums;
    }

    // Method to output array from the user
    public static void outputArray(int[] numArray){
        int i=0;
        while (i< numArray.length){
            System.out.print(numArray[i]+" ");
            i++;
        }
    }

    //Creating a method to input 2D Array
    public static int[][] input2DArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the Number  of Rows");
        int rows=input.nextInt();
        System.out.println("Please Enter the Number of Colums");
        int colums=input.nextInt();

        int [][] numArray=new int [rows][colums];

        // Taking array elements input from the user
        int i=0;
        while (i<rows){
            int j=0;
            while (j<colums){
                System.out.println("Please Enter Element Rows:"+(i+1)+", colums: "+(j+1)+" :");
                numArray[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    // Displaying the 2D Array
    public static void output2DArray(int[][] numArray){

        // Taking array elements input from the user
        int i=0;
        while (i<numArray.length){
            int j=0;
            while (j<numArray[i].length){
                System.out.print(numArray[i][j] + "\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}