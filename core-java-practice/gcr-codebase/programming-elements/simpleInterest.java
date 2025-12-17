public class simpleInterest {

    public static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {

        double p = 1000.0; 
        double r = 5.0;    
        double t = 3.0;    

        double si = simpleInterest(p, r, t);

        System.out.println(
            "Simple Interest for p = " + p +
            ", r = " + r + "%, t = " + t +
            " years is: " + si
        );
    }
}
