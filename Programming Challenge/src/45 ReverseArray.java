import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse An Array Program \n");

        //Taking Array as input
        int[] numArr=ArrayUtility.inputArray();

        // Displaying the array before Reverse
        System.out.print("Before Reverse:");
        ArrayUtility.outputArray(numArr);
        System.out.println();

        //Calling the method reverse
        reverse2(numArr);

        // Displaying the Array
        System.out.print("Your Reverse Array is :");
        ArrayUtility.outputArray(numArr);

    }

    //Creating a method to Reverse an Array
    public static void reverse(int[] arr){
        int i=0;
        while (i<arr.length/2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }

    // Another method
    // Creating a method to Reverse an Array
    public static void reverse2(int[] arr) {
        int left = 0; // Starting index
        int right = arr.length - 1; // Ending index

        // Loop to swap elements from start to end
        while (left < right) {
            // Swapping the elements
            int swap = arr[left];
            arr[left] = arr[right];
            arr[right] = swap;

            // Move towards the center
            left++;
            right--;
        }
    }
}
