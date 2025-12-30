public class Circle {
    private double r;

    public Circle(double r){
        this.r=r;
    }

    public void calculate(){
        double area=Math.PI*r*r;
        double cir=2*Math.PI*r;
        System.out.printf("Area of circle: %.4f\n",area);
        System.out.printf("Circumference of circle: %.4f\n",cir);
    }

    public static void main(String[] args){
        Circle c=new Circle(2.5);
        c.calculate();
    }
}

