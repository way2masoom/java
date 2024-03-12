// 1.Create a program to input name of the person and
// respond with "Welcome NAME to KG Coding"

import java.util.Scanner;

class welcome {
    public static void main(String[] args) {
        System.out.print("Enter your name ");
        Scanner Ninput = new Scanner(System.in);
        String name = Ninput.nextLine();
        System.out.println("welcome " + name + " To KG Coding");

    }
}
