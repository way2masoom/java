class mergeTwoShortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Merge array \n");

        //Taking array as input
        int[] arr1=ArrayUtility.inputArray();
        int[] arr2=ArrayUtility.inputArray();

        // Calling method merge
        int[] mergedArr=merge(arr1,arr2);

        //Displaying the merger Array
        System.out.println("Your merge Array is :");
        ArrayUtility.outputArray(mergedArr);

    }
    public static int[] merge(int[] arr1, int[] arr2) {
        // Calculate the new array size as the sum of the sizes of the two input arrays
        int newSize = arr1.length + arr2.length;

        // Create a new array to hold the merged elements
        int[] newArr = new int[newSize];

        // Initialize indices for arr1 (i), arr2 (j), and newArr (k)
        int i = 0, j = 0, k = 0;

        // Loop until all elements from both arrays are processed
        while (i < arr1.length || j < arr2.length) {
            // If all elements from arr2 are processed or
            // (elements remain in arr1 and current element in arr1 is smaller than current element in arr2)
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                // Copy the current element from arr1 to newArr
                newArr[k] = arr1[i];
                i++; // Move to the next element in arr1
            } else {
                // Copy the current element from arr2 to newArr
                newArr[k] = arr2[j];
                j++; // Move to the next element in arr2
            }
            k++; // Move to the next position in newArr
        }

        // Return the merged array
        return newArr;
    }

}
