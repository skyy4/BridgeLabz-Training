
public class celsius2Fahrenheit {
    public static double c2f(double c) {
        return (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        double c = 25.0;
        double f = c2f(c);
        System.out.println(c + "°C  =  " + f + "°F");
    }
    
}
