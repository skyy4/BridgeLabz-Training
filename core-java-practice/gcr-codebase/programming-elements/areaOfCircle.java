
public class areaOfCircle {
    public static double solve(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        double r = 7.0; 
        double area = solve(r);
        System.out.println("Area of circle with radius " + r + " is: " + area);
    }
    
}
