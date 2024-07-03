class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Array \n");
        //Taking input as Array
        int[] numArr=ArrayUtility.inputArray();

        // calling the Palindrome method
       boolean isPalin=isPalinddrome(numArr);

       if (isPalin){
           System.out.println("Your array is Palindrome :");
       }
       else {
           System.out.println("Your array is NOT Palindrome :");
       }

    }

    //Creating a method to find the Palindrome of Array
    public static boolean isPalinddrome(int[] numArr){

        int i=0;
        while (i<numArr.length){
            if(numArr[i]!=numArr[numArr.length-1-i]){
                return false;
            }
            i++;
        }
    return true;
    }

}
