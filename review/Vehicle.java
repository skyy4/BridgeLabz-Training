public class Vehicle implements Car, Truck {
    @Override
    public void drive() {
        System.out.println("Driving the vehicle");
    }
    


    @Override
    public void load() {
        System.out.println("Loading the vehicle");
    }}