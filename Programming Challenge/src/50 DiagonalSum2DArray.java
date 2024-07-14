class DiagonalSum2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum 2DArray \n");

        //calling the Array Utility classes
        int[][] numArray=ArrayUtility.input2DArray();

        System.out.println("Square matrix");
        ArrayUtility.output2DArray(numArray);
        //Calling the method
        long sum=sumOfDiagonal(numArray);

        //Displaying the sum of diagonal
        System.out.println("Sum of Diagonal is :"+sum);

    }

    //Method to find the sum of Diagonal Elements in 2D Array
    public static long sumOfDiagonal(int[][] numArray){
        long leftsum=sumOfLeftDiagonal(numArray);
        long rightsum=sumOfRightDiagonal(numArray);
        long sum=leftsum+rightsum;

        //checking the size of the diagonal
        if(numArray.length % 2 !=0){
            int ind=numArray.length/2;
            sum -=numArray[ind][ind];
        }
        return sum;
    }

    // Creating method to find the sum of LeftDiagonal
    public static long sumOfLeftDiagonal(int[][] numArray){
        int sum=0;
        int i=0;
        while (i<numArray.length){
            sum +=numArray[i][i];
            i++;
        }
        return sum;
    }

    // Creating method to find the sum of RightDiagonal
    public static long sumOfRightDiagonal(int[][] numArray){
        long sum=0;
        int i=0;
        while (i<numArray.length){
            int col=numArray.length-1-i;
            sum +=numArray[i][col];
            i++;
        }
        return 0;
    }
}
