public class Car {
    // Instance Variable
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public Car start(){
        if(currentFuelInLiters==0){
            System.out.println("Car is out of Fuel");
        }else if(currentFuelInLiters<5) {
            System.out.println("Car is in Reserve Mode, Please Refuel");

        } else {
            System.out.println("Car is Started..");
        }
        return this;
    }

    // Creating method for Car, Method to Drive the Car
    public void drive(){
            currentFuelInLiters --;
            System.out.println("Car is Driving..");
    }

    // Method to add Fuel to the Car
    public void addFuel(float currentFuelInLiters){
       this. currentFuelInLiters +=currentFuelInLiters;
    }

    // Method to check the current Fuel Level
    public float getCurrentFuelLevel(){
        float fuel=currentFuelInLiters;
        System.out.println("Current Fuel is = "+currentFuelInLiters);
        return  fuel;
    }
}
