import java.util.Scanner;

//Array Search
public class ArraySearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Declearing Array
        int[] arr={6,77,88,4,6,2,45,66,21,66,2,55,};

        System.out.println("Welcome to Array Searching");
        System.out.print("Enter the number you want to Search : ");
        int num=input.nextInt();

        // Calling Method
        boolean isFound=isFound(arr,num);
        //Checking the number is in Array or Not
        if(isFound){
            System.out.println("your Number is Found in array "+num);
        }
        else {
            System.out.println("your Number is NOT Found in array "+num);
        }
    }

    //Creating a Method to find the number
    public static boolean isFound(int[]arr,int num){
        int index=0;
        while (index< arr.length){
            if (arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
