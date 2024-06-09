// create a program to find number of Occurrences of an Element in an Array
import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Occurrences \n");
        Scanner input=new Scanner(System.in);

        // calling the Array utility method ;
        int[] numArr=ArrayUtility.inputArray();

        System.out.print("Enter the Number you want to find : ");
        int num=input.nextInt();

        int occurrences=noOfOccurrences(numArr,num);

        System.out.println("Your Elements was found = "+occurrences+" time in the array");
    }

    // Creating Method to find the Occurrences in the Array
    public static int noOfOccurrences(int[] numArr, int num){
        int i=0;
        int occ=0;

        while (i<numArr.length){
            if (numArr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
