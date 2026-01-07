/*
 * Purpose: Calculates fare at peak-hour rates.
 * Implements: FareCalculator
 * Used by: CabBookingSystem
 */
public class PeakFare implements FareCalculator {
    public double calculateFare(double km){
        return km*15;
    }
}


