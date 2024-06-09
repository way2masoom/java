//Create a program to find the maximum and minimum element in an array

class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum and Minimum Array Calculator");

        // Calling the Array Utility Method
        int[] numArr=ArrayUtility.inputArray();

        int max=max(numArr);
        int min=min2(numArr);

        System.out.println("Max of the Array is : "+max);
        System.out.println("min of the Array is : "+min);
    }



    //Creating method for finding the max element
    public static int max(int[] numArr) {

        //check if the input is less then or zero or not
        if(numArr.length==0){
            return Integer.MIN_VALUE;
        }
        //DECLARATION
        int max=numArr[0];
        int i=1;
        while (i< numArr.length){
            if (max < numArr[i]){
                max= numArr[i];
            }
            i++;
        }
        return max;
    }
    //Creating method for finding the MIN element
    public static int min(int[] numArr) {

        //check if the input is less then or zero or not
        if(numArr.length==0){
            return Integer.MAX_VALUE;
        }
        //DECLARATION
        int min=numArr[0];
        int i=1;
        while (i< numArr.length){
            if (min > numArr[i]){
                min= numArr[i];
            }
            i++;
        }
        return min;
    }

    //Another method to find MIN elements
    public static int min2(int[] numArr) {
        int min2=Integer.MAX_VALUE;

        //DECLARATION
        int i=0;
        while (i< numArr.length){
            if (min2 > numArr[i]){
                min2= numArr[i];
            }
            i++;
        }
        return min2;
    }
}
