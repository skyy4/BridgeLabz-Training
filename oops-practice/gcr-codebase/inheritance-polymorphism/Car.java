class VehicleBase {
    int maxSpeed;
    String fuelType;

    public VehicleBase(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    void displayInfo(){
        System.out.println(maxSpeed+" "+fuelType);
    }
}

public class Car extends VehicleBase {
    int seatCapacity;

    public Car(){
        super(180,"Petrol");
        seatCapacity=5;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seats: "+seatCapacity);
    }
}

