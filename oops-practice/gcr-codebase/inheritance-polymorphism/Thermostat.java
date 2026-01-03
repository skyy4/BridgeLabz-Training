class Device {
    String deviceId;
    String status;

    public Device(String deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
}

public class Thermostat extends Device {
    int temp;

    public Thermostat(String id,String status,int temp){
        super(id,status);
        this.temp=temp;
    }

    void displayStatus(){
        System.out.println(deviceId+" "+status+" "+temp);
    }
}

