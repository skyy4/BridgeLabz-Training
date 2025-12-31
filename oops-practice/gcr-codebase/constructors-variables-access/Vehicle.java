public class Vehicle {
    private String ownerName,vehicleType;
    private static double registrationFee=2000;

    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    public void displayVehicleDetails(){
        System.out.println("Owner: "+ownerName);
        System.out.println("Vehicle: "+vehicleType);
        System.out.println("Fee: "+registrationFee);
    }

    public static void updateRegistrationFee(double fee){
        registrationFee=fee;
    }

    public static void main(String[] args){
        Vehicle v1=new Vehicle("Ravi","Bike");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2500);
        v1.displayVehicleDetails();
    }
}

