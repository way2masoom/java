public class Driver {

    // Driver's own properties
    String name;
    static int minAgeForDriving=18;
    String dateOfLicence;
    int age;


    public static void main(String[] args) {
//        // Creating an Object of the Car
//        Car mycar=new Car();
//
//        //Adding 6 Liters of Fuel inside the car
//        mycar.addFuel(6);
//
//        // Calling drive method to run the car
//        mycar.drive();
//
//        // Printing the current Fuel leve of car
//        System.out.println(mycar.getCurrentFuelLevel());
//
//        mycar.drive();
//        System.out.println(mycar.getCurrentFuelLevel());
//
//        mycar.drive();
//        System.out.println(mycar.getCurrentFuelLevel());
//
//        mycar.addFuel(4);
//        mycar.drive();
//        System.out.println(mycar.getCurrentFuelLevel());

            //creating a new car
        Car swift=new Car("Red");
        Car thar=new Car();
/*
      swift.addFuel(6);
      Car StartedCar =swift.start();
*/


//        StartedCar.drive();

//      we can call them in another way
        swift.start().drive();
        System.out.println(swift.currentFuelInLiters);
        System.out.println("Color Selected By user: "+swift.color);
        System.out.println("Default Card Color : "+thar.color);


        // creating the object of Driver
//        Driver myDriver=new Driver();
//        myDriver.dateOfLicence="12 jun 2024";
//        System.out.println("Minimum age ="+minAgeForDriving);

    }
}
