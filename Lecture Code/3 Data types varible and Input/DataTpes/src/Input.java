import java.util.Scanner;

class inputs {
    public static void main(String[] args) {
        System.out.print("Enter you name :");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Good morning " + name);
        // Taking Integer as input
        System.out.print(name + ", Also Enter your Age ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);
    }
}
