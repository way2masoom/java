public class LearnigIf {
    public static void main(String[] args) {

        System.out.println("Before IF");
        boolean Ismain=true;
        String name="Alam";
        if(Ismain){
            System.out.println("Mr. "+name);
        }
        else{
            System.out.println("Ms. "+name);
        }
        System.out.println("Before IF\n\n");

//        Another example
        boolean isSeniorCitizen=false;
        boolean isAdult=false;
        if(isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        }
        else if(isAdult){
                System.out.println("Hello Adult");
        }
        else {
            System.out.println("Hello child");
            }
    }

}
