
public class KmToMiles {
    public static double convert(double km) {
        return km * 0.621371;
    }

    public static void main(String[] args) {
        double k = 10.0;
        double m = convert(k);
        System.out.println(k + " k is equal to " + m + " m.");
    }
    
}
