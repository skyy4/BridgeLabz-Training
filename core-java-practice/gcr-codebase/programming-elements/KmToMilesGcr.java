
public class KmToMilesGcr {
    public static double convert(double km) {
        return km * 0.621371;
    }

    public static void main(String[] args) {
        double k = 10.0;
        double m = convert(k);
        System.out.println("The distance " + k + " in miles is " + m);
    }

    
}
