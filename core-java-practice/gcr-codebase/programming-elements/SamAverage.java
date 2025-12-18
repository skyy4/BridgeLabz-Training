
public class samAverage {
    public static double avg(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        int Maths = 94;
        int Physics = 95;
        int Chemistry = 96;
        double average = avg(Maths, Physics, Chemistry);
        System.out.println("Sam's average mark in PCM is" + average);
    }
    
}
