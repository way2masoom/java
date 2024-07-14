class sumAvg2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average calculator 2D Array \n");
        //calling the Array utility classes

        int[][] numArray=ArrayUtility.input2DArray();

        // Calculating the sum and average of the array elements
        long sum=sum(numArray);
        double avg=average(numArray);

        // Displaying the sum and average of the numbers
        System.out.println("SUM of the number is = "+sum);
        System.out.println("Average of the number is = "+avg);

    }

    //Creating method to find the sum of 2DArray
    public static long sum (int[][] numArray){
      long sum=0;
        int i=0;
        while (i<numArray.length) {
            int j=0;
            while (j < numArray[i].length) {
                sum+=numArray[i][j];
                j++;
            }
            i++;
        }
        return  sum;
    }

    //Creating method to find the Average of 2DArray
    public static double average(int[][] numArr){
        if(numArr.length==0){
            return 0;
        }
        int rows=numArr.length;
        int cols=numArr[0].length;

        double size=rows*cols;
        return sum(numArr)/size;
    }
}
