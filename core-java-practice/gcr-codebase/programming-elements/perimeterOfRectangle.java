
public class perimeterOfRectangle {
    public static double p(double l, double w) {
        return 2 * (l + w);
    }

    public static void main(String[] args) {
        double l = 8.0;
        double w = 5.0; 
        double perimeter = p(l, w);
        System.out.println("perimeter of rectangle with length " + l + " and width " + w + " is: " + perimeter);
    }
    
}
