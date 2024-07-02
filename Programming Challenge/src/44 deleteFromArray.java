import java.util.Scanner;

class deleteFromArray {
     public static void main(String[] args) {
         System.out.println("Welcome to Array deleting \n");
         Scanner input=new Scanner(System.in);

         //Taking Array as input
        int[] numArr=ArrayUtility.inputArray();

         // Displaying the input array before deletion
         System.out.println("Original Array:");
         ArrayUtility.outputArray(numArr);

        // Taking Number as input
         System.out.print("\n Enter the No. the you want to delete : ");
         int numToDelete=input.nextInt();

         // Calling the method
         int[] newArr=deleteNumber(numArr,numToDelete);

         //Displaying the input array
         System.out.print("Here is your new Array :");
        ArrayUtility.outputArray(newArr);


     }

     // Method to delete the specific Number
    public static int[] deleteNumber(int[] numArr, int numToDelete){
        //Finding the number of Occurrences
        // Calling the occurrences method
        int occ=OccurrencesArray.noOfOccurrences(numArr,numToDelete);

        //Based case
        if (occ==0){
            return numArr;
        }

        int newSize=numArr.length-occ;

        // creating a new array after deletion
        int[] newArr=new int[newSize];

        // Checking or Coping the array to new array
        int i=0,j=0;
        while (i<numArr.length){
            if (numArr[i]!=numToDelete){
                newArr[j]=numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
