class isShortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Shorted Check Post \n");

        // Calling the Array Utility
        int[] numArr=ArrayUtility.inputArray();

        boolean isInc=isIncreassing(numArr);
        boolean isDec=isDecreasing(numArr);

        //Checking the Array is shorted or not
        if(isDec || isInc){
            System.out.println("Your array is Sorted");
        }else {
            System.out.println("Your Array is not Sorted");
        }

    }

    // Creating a method to find the array is in Decreasing order or not
    public static boolean isDecreasing(int[] numArr){
        int i=1;
        while (i<numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    // Creating a method to find the array is in Increasing order or not
    public static boolean isIncreassing(int[] numArr){
        int i=1;
        while (i<numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

}
