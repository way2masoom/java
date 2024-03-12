import java.util.Scanner;

//14. Create a program to convert Fahrenheit to Celsius
//°C (°F - 32) × 5/9
class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        //Converting the Fahrenheit to  Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        float Fahrenheit = input.nextFloat();

        float Celsius=(Fahrenheit-32)*(5.0f/9.0f);
        System.out.println("Temperature in Celsius: " +Celsius);

        // Converting Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        float Celsius_var = input.nextFloat();

        // Convert Celsius to Fahrenheit using the formula
        float Fahrenheit_out = (Celsius_var * 9.0f / 5.0f) + 32;
        System.out.println("Temperature in Fahrenheit: " + Fahrenheit_out);


        System.out.println("\n\nAfter calculation");
        System.out.println("Temperature in Fahrenheit to  Celsius : " +Celsius);
        System.out.print("Temperature in Celsius to Fahrenheit: " +Fahrenheit_out);
    }

}
