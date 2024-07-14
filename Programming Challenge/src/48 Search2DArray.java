import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Array Search \n");
        Scanner input=new Scanner(System.in);

        //Calling the Array Utility method
        int[][] numArray=ArrayUtility.input2DArray();

        System.out.print("Enter the Number you want to Search :");
        int num=input.nextInt();

        // Calling the method;
        boolean isfound=search(numArray,num);

        //checking the number is found or not
        if (isfound){
            System.out.println("Your number was found : "+num);
        }else {
            System.out.println("Your number was not found : "+num);
        }
    }

    //Creating a method to Search the number in the array
    public static boolean search(int[][] numArr,int num){
        int i=0;
        while (i<numArr.length){

            int j=0;
            while (j<numArr[i].length){
                if (numArr[i][j]==num){
                    return true;
                }

                j++;
            }

            i++;
        }
        return false;
    }

}
