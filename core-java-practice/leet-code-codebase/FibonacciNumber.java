public class FibonacciNumber {

    public static int fib(int n) {

        // Base case: agar n = 0 ho toh 0 return
        if (n == 0) return 0;

        // Base case: agar n = 1 ho toh 1 return
        if (n == 1) return 1;

        // Starting ke do Fibonacci numbers
        int num1 = 1, num2 = 1, res = 1;

        // Loop n-2 times chalega kyunki pehle do values fix hain
        for (int i = 0; i < n - 2; i++) {

            // Next Fibonacci number calculate kiya
            res = num1 + num2;

            // Values shift ki
            num1 = num2;
            num2 = res;
        }

        // Final Fibonacci number return
        return res;
    }

    
    public static void main(String[] args) {
        int n = 7;   // test input
        System.out.println(fib(n));
    }
}
