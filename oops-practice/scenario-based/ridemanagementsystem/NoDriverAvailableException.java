/*
 * Purpose: Thrown when no available driver can be assigned to a ride.
 * Thrown by: CabBookingSystem.assignDriver()
 */
public class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String msg){
        super(msg);
    }
}


