
public class volumeOfCylinder {
    public static double volume(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static void main(String[] args) {
        double r = 5.0;
        double h = 10.0; 
        double v = volume(r, h);
        System.out.println("Volume of cylinder with radius " + r + " and height " + h + " is = " + v);
    }
    
}
