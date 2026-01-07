/*
 * Purpose: Calculates fare at normal rates (non-peak hours).
 * Implements: FareCalculator
 * Used by: CabBookingSystem
 */
public class NormalFare implements FareCalculator {
    public double calculateFare(double km){
        return km*10;
    }
}


