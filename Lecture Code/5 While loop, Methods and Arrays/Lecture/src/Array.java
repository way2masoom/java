//Array Chapter

public class Array {
    public static void main(String[] args) {
        System.out.printf("Array Chapter \n\n");

        //Array Decleration
//        int[] myArr=new int[5];
//        myArr[0]=98;
//        myArr[1]=33;
//        myArr[2]=28;
//        myArr[3]=8;
//        myArr[4]=7;

        //Another way to declear Array
        int[] myArr={98,33,28,8,7};
//        int index=2;

        //Printing the array
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        //printing Output using loop
       //It also Called Array Traversal
        int index=0;
        while (index <myArr.length){
            System.out.print(myArr[index]+" ");
            index++;
        }

        // Array Decleratin using Sting value

//        String[] myStr=new String[4];
//        myStr[0]="Hello";
//        myStr[2]="This is md";
//        System.out.println(myStr[0]);
//
//        String[] mystr2={"hello", "This is", "Alam"};
//        System.out.println(mystr2[0]);
//
//        String[] mystr3=new String[4];
//        mystr3[0]="Anas";
//        mystr3[1]="Arrina";
//        System.out.println(mystr3[1]);
//
//        String[] mystr4={"Hello","Good Morning", "Good Night"};
//        System.out.println(mystr4[2]);

    }
}
