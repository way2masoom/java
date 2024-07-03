class sumAvg2 {
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
        int i=0,j=0;
        while (i<numArray.length) {
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
        long sum=sum(numArr);

        return (double) (sum/numArr.length);
    }
}
