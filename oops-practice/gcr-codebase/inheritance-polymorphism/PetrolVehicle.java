interface Refuelable {
    void refuel();
}

class VehicleMain {
    int maxSpeed;
    String model;

    public VehicleMain(int s,String m){
        maxSpeed=s;
        model=m;
    }
}

public class PetrolVehicle extends VehicleMain implements Refuelable {
    public PetrolVehicle(){
        super(160,"Sedan");
    }

    public void refuel(){
        System.out.println("Refueling petrol");
    }
}

