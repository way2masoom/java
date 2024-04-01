public class Function {
    public static void main(String[] args) {
        System.out.println("Learning Function/ Method");
        System.out.println("\n");

        greetUser(); //Calling method

        printFirstpattern();
        System.out.println("\n");
        printSecondpattern();
    }
    //creating a method
    public static void greetUser(){
        System.out.println("Good Morning From MD");
    }

    public static void printFirstpattern()
    {
        int rows=0;
        while(rows<5){
            System.out.print("*");
            int i=0;
            while (i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }


    public static void printSecondpattern() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
}
