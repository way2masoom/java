import java.util.Scanner;

//11.Create a program to calculate the Area of a Triangle.
//Area of triangle =  ½(b × h)
class AreOfTringle {
    public static void main(String[] args) {
        System.out.println("Calculating the Are of Triangle");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Base of Triangle B: ");
        double Base = input.nextDouble();
        System.out.print("Enter the Base of Height B: ");
        double Height = input.nextDouble();

//        Formulla to calulate the area of triangle, Area of triangle = ½2*B*H
        double Area =(Base*Height)/2;

        System.out.println("Are of triangle is = "+Area);

    }
}
//12.Create a program to calculate simple interest.
//Simple Interest = (P x T x R)/100

