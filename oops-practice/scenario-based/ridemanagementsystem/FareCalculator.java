/*
 * Purpose: Strategy interface for calculating cab ride fare based on distance.
 * Used by: NormalFare, PeakFare, CabBookingSystem
 */
public interface FareCalculator {
    double calculateFare(double km);
}


