public class car {
    // Properties of Car
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    //Method of car
    public  void drive(){
        System.out.println("Car is driving");
    }
    public void Fuel(float fuel){
        currentFuelInLiters +=fuel;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
