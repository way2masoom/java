public class Parameter {
    public static void main(String[] args) {
        System.out.println("Example of Parameter Method \n");

        int sum = sumTwoNumber(4,7); // calling method and also passing values

        System.out.println("Sum of two number is = "+sum);
        System.out.println(sumTwoNumber(14,71));

    }

    //    creating a method with Parameter
    public static int sumTwoNumber(int first, int second){
        System.out.println("First number is = "+first);
        System.out.println("Second number is = "+second);
        int sum=first+second;
        return sum;
    }
}

