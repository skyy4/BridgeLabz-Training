/*
 * Purpose: Represents a cab driver and their availability status.
 * Used by: CabBookingSystem, Ride
 */
public class Driver {
    String name;
    boolean available=true;

    public Driver(String name){
        this.name=name;
    }
}


