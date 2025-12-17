
public class powerCalculation {
    public static double p(double b, int e) {
        return Math.pow(b, e);
    }

    public static void main(String[] args) {
        double b = 2.0;
        int e = 3;
        double result = p(b, e);
        System.out.println(b + " raised to the power of " + e + " is: " + result);
    }
    
}
