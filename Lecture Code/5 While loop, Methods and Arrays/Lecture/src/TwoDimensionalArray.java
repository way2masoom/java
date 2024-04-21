public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{6,7,8},{9,10,11}};
//        System.out.println(arr[0].length);

        // Another way of delectraction
        int[][] myArr=new int[5][4];

//        Printing hole arrays
       int i=0;
       while (i < arr.length){
           int j=0;
           while (j < arr[i].length){
               System.out.print(arr[i] [j] +" ");
                j++;
           }
           System.out.println();
        i++;
       }
    }
}
