public class AvgOfThreeNum {
    public static double avg(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        double average = avg(n1, n2, n3);
        System.out.println("Average of " + n1 + ", " + n2 + ", and " + n3 + " is = " + average);
    }
    
}
