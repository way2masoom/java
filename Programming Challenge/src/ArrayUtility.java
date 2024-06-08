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
}