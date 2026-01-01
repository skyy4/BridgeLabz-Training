public class RegisteredVehicle {
    private String ownerName,vehicleType;
    private final String registrationNumber;
    private static double registrationFee=150;

    public RegisteredVehicle(String ownerName,String vehicleType,String registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }

    public static void updateRegistrationFee(double fee){
        registrationFee=fee;
    }

    public void display(Object obj){
        if(obj instanceof RegisteredVehicle){
            System.out.println("Owner Name: "+ownerName);
            System.out.println("Vehicle Type: "+vehicleType);
            System.out.println("Registration Number: "+registrationNumber);
            System.out.println("Registration Fee: $"+registrationFee);
        }
    }

    public static void main(String[] args){
        RegisteredVehicle v1=new RegisteredVehicle("Honest raj","Sedan","ABC123");
        RegisteredVehicle v2=new RegisteredVehicle("Price danish","SUV","XYZ789");
        v1.display(v1);
        v2.display(v2);
    }
}

